import childs.Circle;
import childs.Triangele;
import parents.Shape;

public class App {
    public static void main(String[] args) {
        Shape lingkaran = new Circle("Biru", 20);
        Shape segitiga = new Triangele("Merah", 10, 15);

        System.out.println("Luas lingkaran berwarna " + lingkaran.getColor() + " adalah " + lingkaran.getArea());
        System.out.println("Luas segitiga berwarna " + segitiga.getColor() + " adalah " + segitiga.getArea());
    }
}
 