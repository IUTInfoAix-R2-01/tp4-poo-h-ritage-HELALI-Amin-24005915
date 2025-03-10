package tp3exosYaip4;


public class Student extends Person { 
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address); 
        this.program = program;
        this.year = year;
        this.fee = fee;
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

    @Override
    public String toString() { 
        return "Student[Person[name=" + getName() + ", address=" + getAddress() +
               "], program=" + program + ", year=" + year + ", fee=" + fee + "]";
    }
    
//    public static void main(String[] args) {
//        Staff staff1 = new Staff("Amin", "Vitrolles", "IUT aix-marseille", 3500.0);
//        Student student1 = new Student("Bob", "456 Avenue Centrale", "Informatique", 2, 2500.0);
//
//        System.out.println(staff1);
//        System.out.println(student1);
//    }
}

