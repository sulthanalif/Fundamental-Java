package childs;
import parents.Person;

public class Doctor extends Person {
    private String specialist;

    public Doctor() {

    }

    public Doctor(String name, String address, String specialist) {
        super(name, address);
        this.specialist = specialist;
    }

    public void surgery() {
        System.out.println("I can surgery operation Patients");
    }

    public void greeting() {
        System.out.println("Hello, My Name is " + getName() + ".");
        System.out.println("I, come from " + getAddress() + ".");
        System.out.println("My occupation is a " + specialist + " doctor.");
    }

    //getter dan setter
    public String getSpecialist() {
        return this.specialist;
    }
    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }
}
