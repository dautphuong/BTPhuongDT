import java.util.Scanner;

public class RectangleExercise {
    public static void main(String[] args) {
        float chieuRong,chieuDai;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập chiều rộng:");
        chieuRong=scanner.nextFloat();
        System.out.print("Nhập chiều cao:");
        chieuDai=scanner.nextFloat();
        System.out.println("Area is "+chieuRong+" * "+chieuDai+" = "+(chieuRong*chieuDai));
        System.out.println("Perimeter is 2* ("+chieuRong+" * "+chieuDai+") = "+(2*(chieuRong+chieuDai)));
    }
}
