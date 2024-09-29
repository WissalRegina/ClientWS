/**
 * BanqueWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package WSpackage;

public interface BanqueWS extends javax.xml.rpc.Service {
    public java.lang.String getBanqueServicePortAddress();

    public WSpackage.BanqueService getBanqueServicePort() throws javax.xml.rpc.ServiceException;

    public WSpackage.BanqueService getBanqueServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
