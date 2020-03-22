public class Student {
    private String fname, lname, id;
    private double gpa;

    public Student() {
        this.fname = "FirstName";
        this.lname = "LastName";
        this.id = "w1234567";
        this.gpa = 4.0;
    }

    public Student(String fn, String ln, String id, double gpa) {
        this.fname = fn;
        this.lname = ln;
        this.id = id;
        this.gpa = gpa;
    }

    public void setFname(String fn) {
        this.fname = fn;
    }

    public void setLname(String ln) {
        this.lname = ln;
    }

    public void setID(String id) {
        this.id = id;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    public String getFname() {
        return this.fname;
    }

    public String getLname() {
        return this.lname;
    }

    public String getID() {
        return this.id;
    }

    public double getGPA() {
        return this.gpa;
    }
}













