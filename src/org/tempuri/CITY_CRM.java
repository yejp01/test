/**
 * CITY_CRM.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class CITY_CRM  implements java.io.Serializable {
    private java.lang.String CITY_ID;

    private java.lang.String COUNTRY_NAME;

    private java.lang.String COUNTRY_CODE2;

    public CITY_CRM() {
    }

    public CITY_CRM(
           java.lang.String CITY_ID,
           java.lang.String COUNTRY_NAME,
           java.lang.String COUNTRY_CODE2) {
           this.CITY_ID = CITY_ID;
           this.COUNTRY_NAME = COUNTRY_NAME;
           this.COUNTRY_CODE2 = COUNTRY_CODE2;
    }


    /**
     * Gets the CITY_ID value for this CITY_CRM.
     * 
     * @return CITY_ID
     */
    public java.lang.String getCITY_ID() {
        return CITY_ID;
    }


    /**
     * Sets the CITY_ID value for this CITY_CRM.
     * 
     * @param CITY_ID
     */
    public void setCITY_ID(java.lang.String CITY_ID) {
        this.CITY_ID = CITY_ID;
    }


    /**
     * Gets the COUNTRY_NAME value for this CITY_CRM.
     * 
     * @return COUNTRY_NAME
     */
    public java.lang.String getCOUNTRY_NAME() {
        return COUNTRY_NAME;
    }


    /**
     * Sets the COUNTRY_NAME value for this CITY_CRM.
     * 
     * @param COUNTRY_NAME
     */
    public void setCOUNTRY_NAME(java.lang.String COUNTRY_NAME) {
        this.COUNTRY_NAME = COUNTRY_NAME;
    }


    /**
     * Gets the COUNTRY_CODE2 value for this CITY_CRM.
     * 
     * @return COUNTRY_CODE2
     */
    public java.lang.String getCOUNTRY_CODE2() {
        return COUNTRY_CODE2;
    }


    /**
     * Sets the COUNTRY_CODE2 value for this CITY_CRM.
     * 
     * @param COUNTRY_CODE2
     */
    public void setCOUNTRY_CODE2(java.lang.String COUNTRY_CODE2) {
        this.COUNTRY_CODE2 = COUNTRY_CODE2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CITY_CRM)) return false;
        CITY_CRM other = (CITY_CRM) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CITY_ID==null && other.getCITY_ID()==null) || 
             (this.CITY_ID!=null &&
              this.CITY_ID.equals(other.getCITY_ID()))) &&
            ((this.COUNTRY_NAME==null && other.getCOUNTRY_NAME()==null) || 
             (this.COUNTRY_NAME!=null &&
              this.COUNTRY_NAME.equals(other.getCOUNTRY_NAME()))) &&
            ((this.COUNTRY_CODE2==null && other.getCOUNTRY_CODE2()==null) || 
             (this.COUNTRY_CODE2!=null &&
              this.COUNTRY_CODE2.equals(other.getCOUNTRY_CODE2())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCITY_ID() != null) {
            _hashCode += getCITY_ID().hashCode();
        }
        if (getCOUNTRY_NAME() != null) {
            _hashCode += getCOUNTRY_NAME().hashCode();
        }
        if (getCOUNTRY_CODE2() != null) {
            _hashCode += getCOUNTRY_CODE2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CITY_CRM.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "CITY_CRM"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CITY_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CITY_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COUNTRY_NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "COUNTRY_NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COUNTRY_CODE2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "COUNTRY_CODE2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
