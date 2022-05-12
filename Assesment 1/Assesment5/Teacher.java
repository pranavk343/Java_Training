package Assesment5;

public class Teacher extends Person{
    double annual_salary;
    int start_year;
    int experience;

    public double getAnnual_salary() {
        return annual_salary;
    }

    public void setAnnual_salary(double annual_salary) {
        this.annual_salary = annual_salary;
    }

    public int getStart_year() {
        return start_year;
    }

    public void setStart_year(int start_year) {
        this.start_year = start_year;
    }

    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    Teacher(String first_name, String last_name, double annual_salary, int start_year, int experience){
        super(first_name,last_name);
        setAnnual_salary(annual_salary);
        setStart_year(start_year);
        setExperience(experience);
    }
    void getData(){
        System.out.println("First name : "+ getFirst_name());
        System.out.println("Last namr : "+ getLast_name());
        System.out.println("Salary : "+ getAnnual_salary());
        System.out.println("Starting year : "+ getStart_year());
        System.out.println("Experience : "+ getExperience());
    }
}
