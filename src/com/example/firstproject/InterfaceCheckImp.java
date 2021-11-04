package com.example.firstproject;

public class InterfaceCheckImp implements InterfaceCheck {

    @Override
    public void existingMethod(String str) {
        System.out.println("Print from existing method");
    }

    public static void main(String[] args) {
        InterfaceCheck check = new InterfaceCheckImp();
        check.newMethod();
        check.existingMethod("");
        InterfaceCheck.anotherNewMethod();
    }
}
