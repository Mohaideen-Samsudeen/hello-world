package com.example.firstproject;

public interface InterfaceCheck {

    /* This is a default method so we need not
     * to implement this method in the implementation
     * classes
     */
    default void newMethod() {
        System.out.println("Print from default method");
    }

    static void anotherNewMethod() {
        System.out.println("Newly added static method");
    }

    /* Already existing public and abstract method
     * We must need to implement this method in
     * implementation classes.
     */
    void existingMethod(String str);

    private String returnString() {
        return "HelloWorld";
    }
}
