package lad8.SupperclassPerson;

public class Student extends Person {
    String program;
    int year;
    double fee;

    public Student(String name, String address, String program, int year, double fee){
        super(name,address);
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public void Student(){

    }
    @Override
    public String toString() {
        return "Student{" +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                "program='" + program + '\'' +
                ", year=" + year +
                ", fee=" + fee +
                '}';
    }
}
