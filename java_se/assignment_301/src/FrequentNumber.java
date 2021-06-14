import java.util.Scanner;

public class FrequentNumber {
    public static void main(String[] args) {
        int[]arr;
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter length of Array :");
        int len=Integer.parseInt(scanner.nextLine());
        arr=new int[len];
        for (int i=0;i<arr.length;i++){
            System.out.print("Element " +(i+1)+" :");
            arr[i]=Integer.parseInt(scanner.nextLine());
            if(i!=arr.length-1){
                System.out.print("Do you want to continue?");
                String isCheck=scanner.nextLine();
                if(isCheck.equals("N") || (isCheck.equals("n"))){
                    break;
                }
            }
        }
        System.out.print("Enter an int value stored :");
        int value=Integer.parseInt(scanner.nextLine());
        int count=0;
        StringBuilder index = new StringBuilder();
        for (int i=0;i<arr.length;i++) {
            if (value == arr[i]) {
                count++;
                index.append(i).append(" ");
            }
        }
        System.out.println("Amount of frequence :"+count);
        System.out.println("Index : " +index);
    }
}
