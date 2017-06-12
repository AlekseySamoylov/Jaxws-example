package com.alekseysamoylov.jaxws.helloservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Hello soap service example
 */
@WebService()
//@WebService(name = "Hello")
//@SOAPBinding(style = SOAPBinding.Style.RPC)
public class Hello {
    private final String message = "Hello, ";

    // https://docs.oracle.com/javaee/7/tutorial/jaxws001.htm#BNAYW


    @WebMethod()
//    @WebMethod(action = "sample", operationName = "name")
    public String sayHello(String name) {
        return message + name + ".";
    }

    @WebMethod(exclude = true)
    public String exclusiveMethod(String value) {
        return value;
    }

}
