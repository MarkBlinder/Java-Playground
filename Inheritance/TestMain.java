public class TestMain {
    public static void main(String[] args) {
        Test t = new Test("Mark", 25);
        TestChild tc = new TestChild("David", 26, "Brother");

        System.out.println(t);
        System.out.println(tc);

        System.out.println(tc.getName());
    }
}