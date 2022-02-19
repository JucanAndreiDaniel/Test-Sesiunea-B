
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Companie comp = new Companie();
        ArrayList<Element> ang1 = new ArrayList<>();

        ArrayList<Type> type = new ArrayList<>();

        type.add(Type.Frontend);
        type.add(Type.Backend);

        ang1.add(new Developer("Ion", 10, 1000, type));
        ang1.add(new Developer("Gigel", 10, 1000, type));

        comp.add(new Developer("Ion", 10, 1000, type));
        comp.add(new Developer("Gigel", 10, 1000, type));
        comp.add(new Hr("nume", 5, 3000));
        comp.add(new Manager("Das", 10, 1000, ang1));

        comp.print();

        CalculateSalaryVisitor c = new CalculateSalaryVisitor();
        comp.accept(c);

        c.printSalary();
    }
}
