package SqeTest;

import java.io.Console;

public class TestingClass {
    
    public TestingClass() {
        super();
    }

    public static void main(String[] args) {
        TestingClass testingClass = new TestingClass();
        Console console = System.console();
        System.out.println("This is a test program.");
        
    }
    void validate() {
        if(true)
            System.out.println("This code will always run when function is called.");
    }
}
