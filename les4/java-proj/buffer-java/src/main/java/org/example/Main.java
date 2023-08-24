package org.example;

import example.simple.Simple.simpleMessage;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        simpleMessage.Builder builder = simpleMessage.newBuilder();

//        setting an id
//        builder.setId(42);
//        builder.setIsSimple(true);
//        builder.setName("My simple message");


//        simple fields
        builder.setId(42).setIsSimple(true).setName("My simple message name section");

//        repated fields
        builder.addSimpleList(1);
        builder.addSimpleList(2);
        builder.addSimpleList(3);

        builder.addAllSimpleList(Arrays.asList(4,5,6));

//        builder.clearSimpleList();


        simpleMessage message = builder.build();

    }
}