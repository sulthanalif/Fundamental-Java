public class App {
    public static void main(String[] args) throws Exception {
        Person person2 = new Person();

        person2.name = "Joko";
        person2.address = "Surabaya"; 

        person2.sayHello("Sulhtan");
        System.out.println(person2.sayAddress());
    }
}   
