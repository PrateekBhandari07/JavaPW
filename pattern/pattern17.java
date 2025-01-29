package pattern;

import java.util.Scanner;

public class pattern17
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the pattern : ");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            char c='A';
            for(int j=0;j<n;j++){
                if(i<=(n-1)/2&&(i+j>=(n-1)/2)&&((j-i)<=(n-1)/2)){
                    System.out.print(c+" ");
                    c++;
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
