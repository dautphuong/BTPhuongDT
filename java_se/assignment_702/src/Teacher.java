public class Teacher extends Person{
    double basicSalary;
    double subsidy;

    public Teacher(String name, String gender, String phoneNumber, String email, double basicSalary, double subsidy) {
        super(name, gender, phoneNumber, email);
        this.basicSalary = basicSalary;
        this.subsidy = subsidy;
    }
    public double calculationSalary(){
        return basicSalary+subsidy;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "basicSalary=" + basicSalary +
                ", subsidy=" + subsidy +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
