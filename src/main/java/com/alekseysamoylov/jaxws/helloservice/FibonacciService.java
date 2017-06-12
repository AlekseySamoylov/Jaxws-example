package com.alekseysamoylov.jaxws.helloservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by alekseysamoylov on 6/12/17.
 */
@WebService
public class FibonacciService {

    @WebMethod
    public int calculate(int value) {
        int a = 1, b = 1;
        int fib = 2, i = 2;
        while (i < value) {
            fib = a + b;
            a = b;
            b = fib;
            i++;
        }
        return fib;
    }
    @WebMethod
    public int wrongMethod(int value) {

        value += Math.random() * 10;

        return value;
    }
}
