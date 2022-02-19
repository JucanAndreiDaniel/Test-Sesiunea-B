

public class CalculateSalaryVisitor implements Visitor{
    private int salariu;

    public void calculateSalary(Angajat angajat) {
        salariu += angajat.getSalariul();
    }

    public void printSalary() {
        System.out.println("Salariu total angajati: " + this.salariu);
    }
}
