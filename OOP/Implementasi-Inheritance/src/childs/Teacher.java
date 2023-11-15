package childs;
import parents.Person;

public class Teacher extends Person {
    private String subject;

    public Teacher() {

    }

    public Teacher(String name, String address, String subject) {
        super(name, address);
        this.subject = subject;
    }

    public void teaching() {
        System.out.println("I can teach " + subject + ", So anyone how want to learn can takl to me.");
    }

    public void greeting() {
        System.out.println("Hello, My Name is " + getName() + ".");
        System.out.println("I, come from " + getAddress() + ".");
        System.out.println("My job is a " + subject + " teacher.");
    }

    //getter dan setter
    public String getSubject() {
        return this.subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
}
