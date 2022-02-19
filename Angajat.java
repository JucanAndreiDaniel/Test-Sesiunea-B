
public abstract class Angajat implements Element {
    protected String nume;
    protected int vechime;
    protected int salariul;

    public Angajat(String nume, int vechime, int salariul) {
        this.nume = nume;
        this.vechime = vechime;
        this.salariul = salariul;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVechime() {
        return vechime;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }

    public int getSalariul() {
        return salariul;
    }

    public void setSalariul(int salariul) {
        this.salariul = salariul;
    }

    @Override
    public String toString() {
        return "Angajat [vechime=" + vechime + ", nume=" + nume + ", salariul=" + salariul + "]";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.calculateSalary(this);
    }

}
