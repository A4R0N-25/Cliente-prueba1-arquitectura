package ec.edu.espe.arquitectura.cliente.service;

import ec.edu.espe.arquitectura.cliente.soap.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import java.math.BigInteger;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
@Component("Partido")
public class PartidoFutbolService extends WebServiceGatewaySupport {

    public String endpoint = "http://localhost:8080/ws/partido.wsdl";

    public List<PartidoRS> partidosDisponibles(){
        PartidosDisponiblesRequest request = new PartidosDisponiblesRequest();
        PartidosDisponiblesResponse response = (PartidosDisponiblesResponse) getWebServiceTemplate().marshalSendAndReceive(endpoint, request);
        return response.getPartidoRS();
    }

    public List<LocalidadRS> localidadDisponible(){
        LocalidadDisponibleRequest request = new LocalidadDisponibleRequest();
        LocalidadDisponibleResponse response = (LocalidadDisponibleResponse) getWebServiceTemplate().marshalSendAndReceive(endpoint, request);
        return response.getLocalidadRS();
    }

    public String comprarBoleto(Integer codPartido, String localidad){
        ComprarBoletoRequest request = new ComprarBoletoRequest();
        request.setCodPartido(BigInteger.valueOf(codPartido));
        request.setCodLocalidad(localidad);
        ComprarBoletoResponse response = (ComprarBoletoResponse) getWebServiceTemplate().marshalSendAndReceive(endpoint, request);
        return response.getEstado();
    }


}
