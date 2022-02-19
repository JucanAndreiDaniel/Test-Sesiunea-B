import java.util.ArrayList;

public class Manager extends Angajat {

    protected ArrayList<Element> angajati;

    public Manager(String nume, int vechime, int salariul, ArrayList<Element> angajati) {
        super(nume, vechime, salariul);
        this.angajati = angajati;
    }
    @Override
    public void print() {
        System.out.println("Manager");
        System.out.println("Nume: " + nume);
        System.out.println("Vechime: " + vechime);
        System.out.println("Salariul: " + salariul);
        System.out.println("Angajati:");
        for (Element i : angajati)
            i.print();

    }

    @Override
    public void add(Element element) {

    }

}
