package Assesment5;

public class Person {
    String first_name;
    String last_name;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    Person(String first_name, String last_name){
        setFirst_name(first_name);
        setLast_name(last_name);
    }
}
