
import java.util.ArrayList;

public class Companie implements Element {
    protected ArrayList<Element> elements;

    public Companie() {
        this.elements = new ArrayList<>();
    }

    public void add(Element element) {
        elements.add(element);
    }

    @Override
    public void accept(Visitor visitor) {
        if (elements != null) {
            for (Element i : elements)
                i.accept(visitor);
        }
    }

    @Override
    public void print() {
        if (elements != null) {
            for (Element i : elements)
                i.print();
        }
    }

}
