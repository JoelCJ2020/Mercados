//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.10.02 a las 03:47:31 PM CLST 
//


package cl.mercados.ws.dto.v10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para VentaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VentaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="clienteId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="cajaId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VentaType", propOrder = {
    "total",
    "clienteId",
    "cajaId"
})
@XmlSeeAlso({
    OutputVentaObtener.class,
    OutputVentaCrear.class,
    InputVentaActualizar.class,
    InputVentaCrear.class
})
public class VentaType {

    protected int total;
    protected long clienteId;
    protected long cajaId;
    @XmlAttribute(name = "id")
    protected Long id;

    /**
     * Obtiene el valor de la propiedad total.
     * 
     */
    public int getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     */
    public void setTotal(int value) {
        this.total = value;
    }

    /**
     * Obtiene el valor de la propiedad clienteId.
     * 
     */
    public long getClienteId() {
        return clienteId;
    }

    /**
     * Define el valor de la propiedad clienteId.
     * 
     */
    public void setClienteId(long value) {
        this.clienteId = value;
    }

    /**
     * Obtiene el valor de la propiedad cajaId.
     * 
     */
    public long getCajaId() {
        return cajaId;
    }

    /**
     * Define el valor de la propiedad cajaId.
     * 
     */
    public void setCajaId(long value) {
        this.cajaId = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

}
