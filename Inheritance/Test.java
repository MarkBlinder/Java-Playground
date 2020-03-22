public class Test {
    private String name;
    private int age;

    public Test() {
        this.name = "Default";
        this.age = 0;
    }

    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {
        return name + " " + age;
    }
}