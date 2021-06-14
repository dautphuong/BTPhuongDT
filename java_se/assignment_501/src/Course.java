import com.sun.istack.internal.NotNull;

import java.util.Scanner;

public class Course {
    
    String courseId;//FW
    String courseName;
    double courseDuration;
    String statusCourse;
    String flag;//optional or required

    public Course() {
    }

    public Course(String courseId, String courseName, double courseDuration, String statusCourse, String flag) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDuration = courseDuration;
        this.statusCourse = statusCourse;
        this.flag = flag;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(double courseDuration) {
        this.courseDuration = courseDuration;
    }

    public String getStatusCourse() {
        return statusCourse;
    }

    public void setStatusCourse(String statusCourse) {
        this.statusCourse = statusCourse;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseDuration=" + courseDuration +
                ", statusCourse='" + statusCourse + '\'' +
                ", flag='" + flag + '\'' +
                '}';
    }
    public void input(){
        Scanner scanner =new Scanner(System.in);
        System.out.print("Input course Id :");
        this.courseId= scanner.nextLine();
        System.out.print("Input course name :");
        this.courseName = scanner.nextLine();
        System.out.println("Input course duration :");
        this.courseDuration=Double.parseDouble(scanner.nextLine());
        System.out.print("Input status course ('active' or 'in-active') :");
        this.statusCourse=scanner.nextLine();
        System.out.print("Input flag ('optional', 'mandatory', 'N/A') :");
        this.flag=scanner.nextLine();
    }
}
