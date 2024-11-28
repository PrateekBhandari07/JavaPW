import java.util.Scanner;

public class Check2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int even = 0, odd = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0 && n%i==0) {
                    even++;
                } else if(i % 2 != 0 && n%i==0) {
                    odd++;
                }
            }
            System.out.println(even + " " + odd);
            System.out.println(even >= odd ? even == odd ? "0" : "1" : "-1");

        }

    }

}
