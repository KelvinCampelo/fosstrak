package org.fosstrak.epcis.soap;

import javax.xml.ws.WebFault;

/**
 * This class was generated by Apache CXF (incubator) 2.0.4-incubator Wed Jan 30
 * 15:43:44 CET 2008 Generated source version: 2.0.4-incubator
 */

@WebFault(name = "InvalidURIException", targetNamespace = "urn:epcglobal:epcis-query:xsd:1")
public class InvalidURIExceptionResponse extends Exception {
    public static final long serialVersionUID = 20080130154344L;

    private org.fosstrak.epcis.model.InvalidURIException invalidURIException;

    public InvalidURIExceptionResponse() {
        super();
    }

    public InvalidURIExceptionResponse(String message) {
        super(message);
    }

    public InvalidURIExceptionResponse(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidURIExceptionResponse(String message, org.fosstrak.epcis.model.InvalidURIException invalidURIException) {
        super(message);
        this.invalidURIException = invalidURIException;
    }

    public InvalidURIExceptionResponse(String message, org.fosstrak.epcis.model.InvalidURIException invalidURIException,
            Throwable cause) {
        super(message, cause);
        this.invalidURIException = invalidURIException;
    }

    public org.fosstrak.epcis.model.InvalidURIException getFaultInfo() {
        return this.invalidURIException;
    }
}
