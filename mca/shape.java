package mca;

import java.util.Scanner;
import array.*;
public class shape
{
    public static void main(String[] args) {
        System.out.println("Enter the choice \n 1 : square \n 2 : traingle \n 3 : circle");
        Scanner sc=new Scanner(System.in);
        int choice =sc.nextInt();
        area ob=new area();
        area.perimeter perim = ob.new perimeter();

        switch (choice){
            case 1:
                System.out.println("Enter the side of the square : ");
                int side=sc.nextInt();
                ob.square(side);
                perim.square(side);
                break;
            case 2:
                System.out.println("Enter the base of the triangle :");
                int base=sc.nextInt();
                System.out.println("Enter the height of the triangle");
                int height=sc.nextInt();
                ob.triangle(base,height);
                perim.triangle(base);
                break;
            case 3:
                System.out.println("Enter the radius of the circle : ");
                int radius=sc.nextInt();
                ob.circle(radius);
                perim.circle(radius);
                break;

        }
    }
}
