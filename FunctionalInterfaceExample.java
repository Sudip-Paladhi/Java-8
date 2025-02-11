package Lambda;
//Question: Create a custom functional interface and implement it using a lambda expression.
@FunctionalInterface
interface MyFunctionalInterface {
    void sayHello();
}
public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionalInterface greeting = () -> System.out.println("Hello, Java 8!");
        greeting.sayHello();
    }
}
