package com.driver;
import com.driver.A;
import com.driver.B;

class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

class B extends A {
    // Task 4: Override method meth of class A in class B
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        // Task 3: Create object of class B and call method meth of class A with it
        B obj = new B();
        System.out.println(obj.meth()); // Output: "Method is overridden in Extended class B" (Task 5)
    }
}
