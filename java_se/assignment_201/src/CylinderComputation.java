import java.util.Scanner;

public class CylinderComputation {
    public static void main(String[] args) {
        final float PI=3.14f;
        float radius,height,surfaceArea,baseArea,volume;
        Scanner sc = new Scanner(System.in);
        System.out.print("radius is ");
        radius=sc.nextFloat();
        System.out.print("height is ");
        height=sc.nextFloat();
        surfaceArea=2*PI*radius*height+2*PI*radius*radius;
        System.out.println("Surface area = " + surfaceArea);
        baseArea=PI*radius*radius;
        System.out.println("Base area = "+baseArea );
        volume=PI*radius*radius*height;
        System.out.println("Volume = "+volume);
    }
}
