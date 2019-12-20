package com.example.c04;

public class Overloading {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i ++){
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded methed");
        }
        new Tree();
    }
}

class Tree{
    int height;
    Tree(){
        System.out.println("Plangting a seedling");
        height = 0;
    }
    Tree(int i){
        System.out.println("Creating new Tree that is" + i + "fell tall");
        height = i;
    }
    void info(){
        System.out.println("Tree is " + height + "feel tall");
    }
    void info(String s){
        System.out.println(s);
    }
}