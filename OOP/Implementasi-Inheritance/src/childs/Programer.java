package childs;
import parents.Person;

public class Programer extends Person {
    private String technology;

    public Programer() {

    }

    public Programer(String name, String address, String technology) {
        super(name, address);
        this.technology = technology;
    }

    public void hacking() {
        System.out.println("I can hacking a website");
    }

    public void coding() {
        System.out.println("I can create a application using technology : " + technology + ".");
    }

    public void greeting() {
        super.greeting();
        System.out.println("My job is a " + technology + " programer.");
    }

    //Getter dan Setter
    public String getTechnology() {
        return this.technology;
    }
    public void setTechnology(String technology) {
        this.technology = technology;
    }
}
