package JavaPW.pattern;

import java.util.Scanner;

public class pattern1 {
    public static class Pattern
    {
        public static void main(String[] args) {
            System.out.print("Enter length of pattern : ");
            Scanner sc=new Scanner(System.in);
            int len=sc.nextInt();
            int s=len;
            for(int i=0;i<len;i++){
                for(int k=0;k<s;k++) {
                    System.out.print(" ");
                }
                s--;
                for(int j=0;j<i+1;j++){
                    System.out.print("* " );
                }
                System.out.println();
            }

            System.out.println("\n");
            int  f=len;
            for (int i=len;i>0;i--){
                for(int c=f;c<len;c++){
                    System.out.print("  ");
                }
                f--;
                for(int b=0;b<i;b++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}

//output

//Enter length of pattern : 5
//     *
//    * *
//   * * *
//  * * * *
// * * * * *
//
//
//* * * * *
//  * * * *
//    * * *
//      * *
//        *