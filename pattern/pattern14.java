package pattern;

import java.util.Scanner;
//              *
//            * * *
//          *   *   *
//        *     *     *
//      * *     *     * *
//    *     *   *   *     *
//  *         * * *         *
//* * * * * * * * * * * * * * *
//  *         * * *         *
//    *     *   *   *     *
//      * *     *       *
//        *     *     *
//          *   *   *
//            * * *
//              *
public class pattern14
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the pattern : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j==(n-1)/2||i+j==(n-1)+(n-1)/2||Math.abs(i-j)==(n-1)/2||i==(n-1)/2||j==(n-1)/2||
                        (i==j && i>(n-1)/4 && i<(n-1)/2+(n-1)/4)||(i+j)==n-1&&(j>(n-1)/4)&&i>(n-1)/4){
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
