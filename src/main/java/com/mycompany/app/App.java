package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private final String message = "Hello World! I am back. Doing the first change to new branch. THIS IS A HOTFIX!";

    public App() {
    }

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
