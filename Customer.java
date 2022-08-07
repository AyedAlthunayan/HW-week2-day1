public class Customer {
    private int id;
    private String name;
    private int dicount;

    public Customer(int id, String name, int dicount) {
        this.id = id;
        this.name = name;
        this.dicount = dicount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDicount() {
        return dicount;
    }

    public void setDicount(int dicount) {
        this.dicount = dicount;
    }

}
