import java.util.Scanner;

public class ArithmeticExercise2 {
    public static void main(String[] args) {
        int soThuNhat,soThuHai;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập số thứ nhất:");
        soThuNhat=scanner.nextInt();
        System.out.print("Nhập số thứ hai:");
        soThuHai=scanner.nextInt();
        System.out.println(soThuNhat+" + "+soThuHai+" = "+(soThuNhat+soThuHai));
        System.out.println(soThuNhat+" - "+soThuHai+" = "+(soThuNhat-soThuHai));
        System.out.println(soThuNhat+" X "+soThuHai+" = "+(soThuNhat*soThuHai));
        System.out.println(soThuNhat+" / "+soThuHai+" = "+(soThuNhat/soThuHai));
        System.out.println(soThuNhat+" % "+soThuHai+" = "+(soThuNhat%soThuHai));
    }
}
