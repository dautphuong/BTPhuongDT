import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number : ");
        int a=sc.nextInt();
        System.out.print("Input second number : ");
        int b=sc.nextInt();
        System.out.print("Input third number : ");
        int c=sc.nextInt();
        System.out.print("Input fourth number : ");
        int d=sc.nextInt();
        if(a==b && c==d && b==c){
            System.out.println("Numbers are equal!");
        }else{
            System.out.println("Numbers are not equal!");
        }
    }
}
