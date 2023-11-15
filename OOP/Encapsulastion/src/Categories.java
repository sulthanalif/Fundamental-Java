public class Categories {
    private int id;
    private String name;
    private boolean expensive;

    public Categories(int id, String name, boolean expansive) {
        super();
        this.id = id;
        this.name = name;
        this.expensive = expansive;
    }

    public Categories() {
        super();
    }

    //contoh Getter dan Setter tipe boolean

    //Getter
    public boolean isExpansive() {
        return this.expensive;
    }

    //Setter
    public void setExpansive(boolean expansive) {
        this.expensive = expensive;
    }



    //Contoh tipe data Object

    //Getter
    public String getName() {
        return this.name;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }


    //Contoh tipe data Primitif (integer)

    //Getter
    public int getId() {
        return this.id;
    }

    //Setter
    public void setId(int id) {
        this.id = id;
    }
}