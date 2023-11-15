public class Person {
    String name, address;
    final String country = "Indonesia";

    //method void
    void sayHello(String paramName) {
        System.out.println("Hello " + paramName +", My name is " + name + ".");
    }

    //method string
    String sayAddress() {
        return "I, come from " + address + ".";
    }
}
