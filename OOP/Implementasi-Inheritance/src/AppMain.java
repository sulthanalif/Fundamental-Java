import childs.Doctor;
import childs.Programer;
import childs.Teacher;
import parents.Person;

public class AppMain {
    public static void main(String[] args) {
        //pembuatan object
        Person person1 = new Person();

        person1.setName("Sulthan");
        person1.setAddress("Sumedang");

        System.out.println(person1.getName());
        System.out.println(person1.getAddress());
    }





    // public static void main(String[] args) {
    //     Person person1 = new Programer("Rizky", "Bandung", "Net Core");
    //     Person person2 = new Teacher("Joko", "Tegal", "Matematika");
    //     Person person3 = new Doctor("Eko", "Surabaya", "Pedistrician");

    //     sayHello(person1);
    //     sayHello(person2);
    //     sayHello(person3);
    // }

    // static void sayHello(Person person) {
    //     String message;

    //     if (person instanceof Programer) {
    //         Programer programer = (Programer) person;
    //         message = "Hello, " + programer.getName() + ". Seorang Programmer " + programer.getTechnology() + ".";
    //     } else if (person instanceof Teacher) {
    //         Teacher teacher = (Teacher) person;
    //         message = "Hello, " + teacher.getName() + ". Seorang Guru " + teacher.getSubject() + ".";
    //     } else if (person instanceof Doctor) {
    //         Doctor doctor = (Doctor) person;
    //         message = "Hello, " + doctor.getName() + ". Seorang Dokter " + doctor.getSpecialist() + ".";
    //     } else {
    //         message = "Hello, " + person.getName() + ".";
    //     }
    //     System.out.println(message);
    // }
}
