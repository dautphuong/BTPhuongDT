import java.util.Scanner;

public class ArrayContains {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] stringArray;
        System.out.print("Enter length array:");
        int n=Integer.parseInt(sc.nextLine());
        stringArray=new String[n];
        for(int i=0;i<stringArray.length;i++){
            System.out.print("Element " +(i+1)+" :");
            stringArray[i]=sc.nextLine();
        }
        System.out.print("Require to enter a string variable ");
        String sValue=sc.nextLine();

        for(int i=0;i<stringArray.length;i++){
            if(sValue.equals(stringArray[i])){
                System.out.println("Check '"+sValue+"' in Array: Contained!" );break;
            }else if(i==stringArray.length-1){
                System.out.println("Check '"+sValue+"' in Array: No contained!" );
            }
        }
    }
}
