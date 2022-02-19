public class Hr extends Angajat {

    public Hr(String nume, int vechime, int salariul) {
        super(nume, vechime, salariul);
    }

    @Override
    public void print() {
        System.out.println("Hr");
        System.out.println("Nume: " + nume);
        System.out.println("Vechime: " + vechime);
        System.out.println("Salariul: " + salariul);
    }



    @Override
    public void add(Element element) {
        // TODO Auto-generated method stub

    }

}
