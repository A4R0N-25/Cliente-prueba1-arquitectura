package ec.edu.espe.arquitectura.cliente.config;

import ec.edu.espe.arquitectura.cliente.service.PartidoFutbolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapConfiguration {

    @Autowired
    private PartidoFutbolService partidoFutbolService;

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("ec.edu.espe.arquitectura.cliente.soap");
        return marshaller;
    }

    @Bean
    @Primary
    public PartidoFutbolService soapClient(Jaxb2Marshaller marshaller) {
        partidoFutbolService.setMarshaller(marshaller);
        partidoFutbolService.setUnmarshaller(marshaller);
        return partidoFutbolService;
    }

}
