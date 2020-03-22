import java.util.Collections;
import java.util.LinkedList;

public class Polynomial {
    LinkedList<Term> poly;

    public Polynomial() {
        poly = new LinkedList<Term>();
    }

    public Polynomial(LinkedList<Term> l) {
        poly = l;
    }

    public LinkedList<Term> getList() {
        return poly;
    }

    public void setList(LinkedList<Term> l) {
        poly = l;
    }

    public LinkedList<Term> polyListClone(LinkedList<Term> p) {
        LinkedList<Term> clone = new LinkedList<Term>();
        for (Term t : p) {
            clone.add(new Term(t));
        }
        return clone;
    }

    public void addTerm(Term t) {
        boolean added = false;
        for (Term term : poly) {
            if (t.getExponent() == term.getExponent()) {
                term.setCoefficient(t.getCoefficient() + term.getCoefficient());
                added = true;
            }
        }
        if (!added) {
            poly.add(t);
        }
        Collections.sort(poly);
    }

    public void addPolyMod(Polynomial p) {
        for (Term t : p.getList()) {
            addTerm(t);
        }
    }

    public Polynomial addPolyNew(Polynomial p) {
        Polynomial sum = new Polynomial(polyListClone(this.poly));
        for (Term t : p.getList()) {
            sum.addTerm(t);
        }
        return sum;
    }

    @Deprecated
    public Polynomial addPoly(Polynomial p) {
        Polynomial sumPoly = new Polynomial();
        LinkedList<Term> polyCopy = polyListClone(this.poly);
        LinkedList<Term> pList = polyListClone(p.getList());
        boolean added = false;
        int index, index2;
        for (Term t : polyCopy) {
            added = false;
            for (Term k : pList) {
                if (k != null && t != null) {
                    if (t.getExponent() == k.getExponent()) {
                        sumPoly.getList().add(new Term ((t.getCoefficient() + k.getCoefficient()), t.getExponent()));
                        added = true;
                        index = polyCopy.indexOf(t);
                        polyCopy.set(index, null);
                        index2 = pList.indexOf(k);
                        pList.set(index2, null);
                    }
                }
            }
            if (!added) {
                sumPoly.getList().add(t);
                index = polyCopy.indexOf(t);
                polyCopy.set(index, null);
            }
        }
        for (Term l : pList) {
            if (l != null) {
                sumPoly.getList().add(l);
            }
        }
        Collections.sort(sumPoly.getList());
        return sumPoly;
    }

    public String toString() {
        String string = "";
        boolean firstTerm = true;
        for (Term t : poly) {
            if (firstTerm) {
                string += t.toString().substring(1);
                firstTerm = false;
            }
            else {
                string += t.toString();
            }
        }
        return string;
    }
}