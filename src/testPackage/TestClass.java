package testPackage;

public class TestClass {

    public static void main (String [] args) {
        System.out.print("Hello World");
        System.out.println("CHeck");

        //test
        A a = new A();
        A b = new B();
        b.print();

        a.print();
    }


}

class A {
    public void print() {
        System.out.println("A");
    }
}

class B extends A {
    @Override
    public void print() {
        System.out.println("B");
    }
}
