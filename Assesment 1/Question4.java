class Student{
    private String fname;
    private String lname;
    private int year;
    private String major;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    void getData(){
        System.out.println("First name : "+ getFname());
        System.out.println("Last name : "+ getLname());
        System.out.println("Class year : "+ getYear());
        System.out.println("Major : "+ getMajor());
    }
}
public class Question4 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setFname("Pranav");
        s1.setLname("Kulkarni");
        s1.setYear(4);
        s1.setMajor("ENTC");
        Student s2 = new Student();
        s2.setFname("Rushi");
        s2.setLname("Gothwad");
        s2.setYear(4);
        s2.setMajor("ECE");
        s1.getData();
        s2.getData();
    }
}
