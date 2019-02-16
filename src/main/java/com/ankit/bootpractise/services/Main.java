package com.ankit.bootpractise.services;

public class Main {

    public static void main(String[] args) {
        Spec impl = new SpecImpl();
        Spec sec = new Sec();
        Sec sec1 = (Sec)impl;
        sec1.fun();;
    }
}
