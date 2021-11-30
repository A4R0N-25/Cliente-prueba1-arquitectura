package ec.edu.espe.arquitectura.cliente.controller;

import ec.edu.espe.arquitectura.cliente.service.PartidoFutbolService;
import ec.edu.espe.arquitectura.cliente.soap.LocalidadRS;
import ec.edu.espe.arquitectura.cliente.soap.PartidoRS;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@Data
@RequestMapping("/api/v1/partido/")
public class PartidoFutbolController {

    @Autowired
    private PartidoFutbolService partidoFutbolService;

    @GetMapping("/partidos")
    public ResponseEntity partidosDisponibles(){
        try {
            List<PartidoRS> partidoRS = this.partidoFutbolService.partidosDisponibles();
            return ResponseEntity.ok(partidoRS);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @GetMapping("/localidades")
    public ResponseEntity localidadDisponible(){
        try {
            List<LocalidadRS> localidadRS= this.partidoFutbolService.localidadDisponible();
            return ResponseEntity.ok(localidadRS);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @GetMapping("/{codParitdo}/{localidad}")
    public ResponseEntity localidadDisponible(@PathVariable Integer codParitdo,@PathVariable String localidad){
        try {
            String estado= this.partidoFutbolService.comprarBoleto(codParitdo,localidad);
            return ResponseEntity.ok(estado);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

}
