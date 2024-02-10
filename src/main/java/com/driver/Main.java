package com.driver;


class classA {
    public String meth() {
        return "Invoking method from class A";
    }
}

class classB extends classA {
    // Task 4: Override method meth of class A in class B
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        // Task 3: Create object of class B and call method meth of class A with it
        classB obj = new classB();
        System.out.println(obj.meth()); // Output: "Method is overridden in Extended class B" (Task 5)
    }
}
