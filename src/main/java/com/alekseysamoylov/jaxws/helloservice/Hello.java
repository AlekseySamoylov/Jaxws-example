package com.alekseysamoylov.jaxws.helloservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Hello soap service example
 */
@WebService
public class Hello {
    private final String message = "Hello, ";

    // https://docs.oracle.com/javaee/7/tutorial/jaxws001.htm#BNAYW

    public Hello() {
    }


    @WebMethod
    public String sayHello(String name) {
        return message + name + ".";
    }
}
