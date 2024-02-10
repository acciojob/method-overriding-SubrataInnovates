class A {
    // Task 1: Method in class A returning a string
    public String meth() {
        return "Invoking method from class A";
    }
}

class B extends A {
    // Task 4: Override meth() method in class B
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        // Task 3: Create an object of class B and call meth() method of class A with it
        B objB = new B();
        System.out.println(objB.meth()); // Task 5: Call overridden method from obj of class B
    }
}
