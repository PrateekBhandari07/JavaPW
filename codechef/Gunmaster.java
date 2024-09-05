package codechef;
//You have two guns: a close-range gun and a long-range gun.
//The close-range gun can only shoot targets at distances less than or equal to D
//while the long-range gun can only shoot targets at distances strictly greater than D
//You can only hold one gun at a time. Initially, you are holding the close-range gun.
//You need to shoot at a series of N targets in order. The distance to the ith target is Ai.
//Your task is to determine the minimum number of times you need to switch between the two guns to shoot all N
// targets in the given order
import java.util.Scanner;

public class Gunmaster
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of iterations : ");
        int t = sc.nextInt();

        while (t-- > 0) {
            int count = 0;
            System.out.println("Enter the total number of shots : ");
            int n = sc.nextInt();
            System.out.println("Enter the range of short range gun : ");
            int shortRange = sc.nextInt();
            System.out.println("Enter the range for all the shots : ");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            boolean gun = true;
            if (arr[0] <= shortRange) {
                gun = true;
            } else if (arr[0] > shortRange) {
                gun = false;
                count++;
            }
            for (int i = 1; i < n; i++) {
                if (!gun) {
                    if (arr[i] <= shortRange) {
                        count++;
                        gun = true;
                    } else {
                        gun = false;
                    }
                } else {
                    if (arr[i] <= shortRange) {
                        gun = true;
                    } else {
                        count++;
                        gun = false;
                    }
                }
            }
            System.out.println("The number of time gun need to be changed is : "+count);
        }
    }
}
