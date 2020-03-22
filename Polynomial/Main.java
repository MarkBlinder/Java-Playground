public class Main {
    public static void main(String[] args) {
        Term t1 = new Term(3, 4);
        Term t2 = new Term(5, 3);
        Term t3 = new Term(-2, 2);
        Term t4 = new Term(-4, 0);
        
        Term t5 = new Term(7, 3);
        Term t6 = new Term(-2, 1);

        Polynomial poly = new Polynomial();
        poly.addTerm(t1);
        poly.addTerm(t2);
        poly.addTerm(t3);
        poly.addTerm(t4);

        Polynomial poly2 = new Polynomial();
        poly2.addTerm(t5);
        poly2.addTerm(t6);

        System.out.println(poly);
        System.out.println(poly2);
        System.out.println(poly.addPolyNew(poly2));
        //poly.addPolyNew(poly2);


    }
}