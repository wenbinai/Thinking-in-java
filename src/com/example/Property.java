package com.example;

import java.util.Date;
import java.util.Properties;

public class Property {
    public static void main(String[] args) {
        System.out.println(new Date());
        Properties p = System.getProperties();
        p.list(System.out);
        System.out.println("---Memory Usage: ");
        Runtime rt = Runtime.getRuntime();
    }
}
