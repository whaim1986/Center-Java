//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.06.29 时间 11:06:28 PM CST 
//


package szfs.std.szfs._2010.tech.xsd.szfs_302_002;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CollectionCharges complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CollectionCharges">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpHdr" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}GroupHeader1"/>
 *         &lt;element name="ColltnChrgsInf" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.302.002.01}CollectionChargesInformation"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectionCharges", propOrder = {
    "grpHdr",
    "colltnChrgsInf"
})
public class CollectionCharges {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader1 grpHdr;
    @XmlElement(name = "ColltnChrgsInf", required = true)
    protected CollectionChargesInformation colltnChrgsInf;

    /**
     * 获取grpHdr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader1 }
     *     
     */
    public GroupHeader1 getGrpHdr() {
        return grpHdr;
    }

    /**
     * 设置grpHdr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader1 }
     *     
     */
    public void setGrpHdr(GroupHeader1 value) {
        this.grpHdr = value;
    }

    /**
     * 获取colltnChrgsInf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CollectionChargesInformation }
     *     
     */
    public CollectionChargesInformation getColltnChrgsInf() {
        return colltnChrgsInf;
    }

    /**
     * 设置colltnChrgsInf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CollectionChargesInformation }
     *     
     */
    public void setColltnChrgsInf(CollectionChargesInformation value) {
        this.colltnChrgsInf = value;
    }

}
