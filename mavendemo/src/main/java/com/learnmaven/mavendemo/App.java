package com.learnmaven.mavendemo;

/**
 * Hello world!
 *
 */
import org.apache.log4j.Logger;
public class App 
{
	final static Logger logr = Logger.getLogger(App.class);
    public static void main( String[] args )
    {
        Calculator calc = new Calculator();
        logr.debug(calc.add(1, 2));
        logr.debug(calc.subtract(4, 3));
        logr.debug(calc.multiply(10, 10));
        logr.debug(calc.divide(100, 10));
    }
}
