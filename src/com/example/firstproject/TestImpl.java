package com.example.firstproject;

interface interface1 {
    abstract void impIt();
}

interface interface2 {
    abstract void impIt();
}

abstract class abstract1 {
    abstract void impIt();

    void print() {
        System.out.println("abstract1");
    }
}

abstract class abstract2 extends abstract1 {
    abstract void impIt();

    void print() {
        System.out.println("abstract2");
    }
}

public class TestImpl extends abstract1 implements interface1, interface2 {
    @Override
    public void impIt() {
        System.out.println("TestImpl");
    }

    void print() {
        System.out.println("TestImpl");
    }

    public static void main(String[] args) {
        abstract1 impl = new TestImpl();
        impl.impIt();
        impl.print();
    }
}
