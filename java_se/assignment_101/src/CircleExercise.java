import java.util.Scanner;

public class CircleExercise {
    public static void main(String[] args) {
        float radius ;
        final float PI=3.14f;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập bán kính:");
        radius =scanner.nextFloat();
        System.out.println("Perimeter is = " +(2*radius*PI) );
        System.out.println("Area is =  "+ (radius*radius*PI));
    }
}
