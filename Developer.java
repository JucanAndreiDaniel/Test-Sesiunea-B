import java.util.ArrayList;

public class Developer extends Angajat {
    protected ArrayList<Type> type;

    public Developer(String nume, int vechime, int salariul, ArrayList<Type> type) {
        super(nume, vechime, salariul);
        this.type = type;
    }

    public ArrayList<Type> getType() {
        return type;
    }

    public void setType(ArrayList<Type> type) {
        this.type = type;
    }

    @Override
    public void print() {
        System.out.println("Developer");
        System.out.println("Nume: " + nume);
        System.out.println("Vechime: " + vechime);
        System.out.println("Salariul: " + salariul);
        System.out.println("Tip: " + type);
    }

    @Override
    public void add(Element element) {

    }

}

enum Type {
    Frontend, Backend, Fullstack
}
