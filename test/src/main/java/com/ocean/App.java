package com.ocean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ThreadLocal<String> tl = new ThreadLocal<>();
        tl.set("aaa");
    }
}
