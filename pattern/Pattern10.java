package pattern;

import java.util.Scanner;
//* * *
//*     *
//*     *
//*     *
//*     *
//*     *
//*     *
//* * *
public class Pattern10
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the pattern : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0|| (i==0 && j<n/2-1)|| (i==n-1 && j<n/2-1)||(j==n/2-1&&i>0&&i<n-1)){
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
