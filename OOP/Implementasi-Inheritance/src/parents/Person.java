package parents;

public class Person {
    private String name, address;

    public Person(String name, String address) {
        super();
        this.name = name;
        this.address = address;
    }

    public Person() {
        super();
    }

    public void greeting() {
        System.out.println("Hello, My Name is " + name + ".");
        System.out.println("I, come from " + address + ".");
    }

    //Getter dan Setter
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
