//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.16 at 07:03:41 AM EET 
//


package ua.epam.sergiishapoval.projects.xmlxsd.voucher;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for touristVouchers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="touristVouchers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="touristVoucher" type="{}touristVoucher"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "touristVouchers", propOrder = {
    "touristVoucher"
})
public class TouristVouchers {

    @XmlElement(required = true)
    protected List<TouristVoucher> touristVoucher;

    /**
     * Gets the value of the touristVoucher property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the touristVoucher property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTouristVoucher().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TouristVoucher }
     * 
     * 
     */
    public List<TouristVoucher> getTouristVoucher() {
        if (touristVoucher == null) {
            touristVoucher = new ArrayList<>();
        }
        return this.touristVoucher;
    }

}