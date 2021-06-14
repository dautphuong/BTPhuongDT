public class Student extends Person{
    String studentID;
    double theory;
    double practice;

    public Student(String name, String gender, String phoneNumber, String email, String studentID, double theory, double practice) {
        super(name, gender, phoneNumber, email);
        this.studentID = studentID;
        this.theory = theory;
        this.practice = practice;
    }
    public double CalculateFinalMark (){
        return (theory+practice)/2;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", theory=" + theory +
                ", practice=" + practice +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
