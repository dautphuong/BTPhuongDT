import java.util.Scanner;

public class LogicalExercise {
    public static void main(String[] args) {
        int soThuNhat,soThuHai;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập số thứ nhất:");
        soThuNhat=scanner.nextInt();
        System.out.print("Nhập số thứ hai:");
        soThuHai=scanner.nextInt();
        if(soThuNhat<soThuHai){
            System.out.println(soThuNhat +" != "+soThuHai);
            System.out.println(soThuNhat +" < "+soThuHai);
            System.out.println(soThuNhat +" <= "+soThuHai);
        }else if(soThuNhat>soThuHai){
            System.out.println(soThuNhat +" != "+soThuHai);
            System.out.println(soThuNhat +" > "+soThuHai);
            System.out.println(soThuNhat +" >= "+soThuHai);
        }else{
            System.out.println(soThuNhat +" = "+soThuHai);
        }
    }
}
