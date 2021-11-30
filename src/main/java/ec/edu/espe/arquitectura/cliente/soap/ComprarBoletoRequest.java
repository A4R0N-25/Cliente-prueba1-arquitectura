//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.11.29 a las 09:48:35 PM COT 
//


package ec.edu.espe.arquitectura.cliente.soap;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codPartido" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="codLocalidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "codPartido",
    "codLocalidad"
})
@XmlRootElement(name = "comprarBoletoRequest")
public class ComprarBoletoRequest {

    @XmlElement(required = true)
    protected BigInteger codPartido;
    @XmlElement(required = true)
    protected String codLocalidad;

    /**
     * Obtiene el valor de la propiedad codPartido.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodPartido() {
        return codPartido;
    }

    /**
     * Define el valor de la propiedad codPartido.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodPartido(BigInteger value) {
        this.codPartido = value;
    }

    /**
     * Obtiene el valor de la propiedad codLocalidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodLocalidad() {
        return codLocalidad;
    }

    /**
     * Define el valor de la propiedad codLocalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodLocalidad(String value) {
        this.codLocalidad = value;
    }

}
