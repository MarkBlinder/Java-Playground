public class Term implements Comparable<Term>{
    private int coefficient;
    private int exponent;

    public Term() {
        coefficient = 0;
        exponent = 0;
    }

    public Term(int c, int e) {
        coefficient = c;
        exponent = e;
    }

    public Term(Term t) {
        coefficient = t.getCoefficient();
        exponent = t.getExponent();
    }

    public void setAll(int c, int e) {
        coefficient = c;
        exponent = e;
    }

    public void setCoefficient(int c) {
        coefficient = c;
    }

    public void setExponent(int e) {
        exponent = e;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public int getExponent() {
        return exponent;
    }

    public String toString() {
        String term = "";
        if (coefficient == 0) {
            return "";
        }
        if (coefficient > 0) {
            term += "+";
        }
        if (coefficient == -1 && exponent != 0) {
            term += "-";
        }
        if (exponent == 0 && (coefficient == 1 || coefficient == -1)) {
            term += coefficient;
        }
        if (coefficient > 1 || coefficient < -1) {
            term += coefficient;
        }
        if (exponent == 0) {
            return term;
        }
        term += "x";
        if (exponent > 1 || exponent < 0) {
            term += "^" + exponent;
        }
        return term;
    }

    @Override
    public int compareTo(Term t) {
        if (this == t) {
            return 0;
        }
        if (this.exponent > t.getExponent()) {
            return -1;
        }
        else if (this.exponent < t.getExponent()) {
            return 1;
        }
        return 0;
    }
}