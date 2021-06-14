import java.util.Scanner;

public class PersonManage {
    public static void main(String[] args) {
        Person[] arr=new Person[3];
        Scanner sc=new Scanner(System.in);
        int i=0;
        while (i !=arr.length){
            System.out.println("1. Student");
            System.out.println("2. Teacher");
            System.out.print("Enter :");
            String name,gender,phoneNumber,email;
            int n=Integer.parseInt(sc.nextLine());
            switch (n){
                case 1:
                    System.out.print("Name :");
                    name=sc.nextLine();
                    System.out.print("Gender :");
                    gender=sc.nextLine();
                    System.out.print("Phone number :");
                    phoneNumber=sc.nextLine();
                    System.out.print("Email :");
                    email=sc.nextLine();
                    System.out.print("Student ID :");
                    String studentID=sc.nextLine();;
                    System.out.print("Theory :");
                    double theory=Double.parseDouble(sc.nextLine());
                    System.out.print("Practice :");
                    double practice=Double.parseDouble(sc.nextLine());
                    arr[i]=new Student(name,gender,phoneNumber,email,studentID,theory,practice);break;
                case 2:
                    System.out.print("Name :");
                    name=sc.nextLine();
                    System.out.print("Gender :");
                    gender=sc.nextLine();
                    System.out.print("Phone number :");
                    phoneNumber=sc.nextLine();
                    System.out.print("Email :");
                    email=sc.nextLine();
                    System.out.print("Basic salary");
                    double basicSalary=Double.parseDouble(sc.nextLine());
                    System.out.print("Subsidy :");
                    double subsidy=Double.parseDouble(sc.nextLine());
                    arr[i]=new Teacher(name,gender,phoneNumber,email,basicSalary,subsidy);break;
                default:
                    break;
            }
            i++;
        }
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j].toString());
        }
        System.out.println("----------------------------------------------------");
        for(int j=0;j<arr.length;j++){
            if(arr[j] instanceof Teacher )
            System.out.println(arr[j].toString());
        }
    }
}
