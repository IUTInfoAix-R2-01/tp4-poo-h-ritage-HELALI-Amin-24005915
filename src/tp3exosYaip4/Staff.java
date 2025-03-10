package tp3exosYaip4;

public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() { 
        return "Staff[Person[name=" + getName() + ", address=" + getAddress() +
               "], school=" + school + ", pay=" + pay + "]";
    }
    
//    public static void main(String[] args) {
//        Staff staff1 = new Staff("Amin", "Vitrolles", "IUT aix-marseille", 3500.0);
//        Student student1 = new Student("Bob", "456 Avenue Centrale", "Informatique", 2, 2500.0);
//
//        System.out.println(staff1);
//        System.out.println(student1);
//    }
}


