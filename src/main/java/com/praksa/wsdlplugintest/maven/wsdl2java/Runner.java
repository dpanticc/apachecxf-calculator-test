package com.praksa.wsdlplugintest.maven.wsdl2java;

import org.tempuri.Calculator;
import org.tempuri.CalculatorSoap;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class Runner {
    public static void main(String[] args) throws MalformedURLException {
        final String endpoint = "http://www.dneonline.com/calculator.asmx";

        final URL url = URI.create(endpoint).toURL();

        final Calculator calculatorService = new Calculator(url);

        final CalculatorSoap calculatorPort = calculatorService.getPort(CalculatorSoap.class);

        int result = calculatorPort.add(10, 20);
        System.out.println("Result: " + result);
    }
}
