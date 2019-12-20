package com.example.c04;

class Rock{
    Rock(int i){
        System.out.println("Creating Rock number " + i);
    }
}
public class SimpleConstruct{
    public static void main(String[] args) {
        for(int i = 0; i < 10; i ++)
            new Rock(i);
    }
}
