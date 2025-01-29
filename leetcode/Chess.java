package leetcode;

import java.util.Scanner;

//Check if Two Chessboard Squares Have the Same Color
//You are given two strings, coordinate1 and coordinate2, representing the coordinates of a square on an 8 x 8 chessboard.
//Return true if these two squares have the same color and false otherwise.
public class Chess
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String coordinate1=sc.next(),coordinate2=sc.next();

        int col1 = coordinate1.charAt(0) - 'a' + 1;
        int row1 = coordinate1.charAt(1) - '0';
        int col2 = coordinate2.charAt(0) - 'a' + 1;
        int row2 = coordinate2.charAt(1) - '0';
        if((col1 + row1) % 2 == (col2 + row2) % 2){
            System.out.println("same color");
        }
        else{
            System.out.println("different color");
        }
    }
}
//a1 b1
//different color