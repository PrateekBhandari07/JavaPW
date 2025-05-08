package JavaPW.dsa;

public class Day01_Number_Length
{
    public static void main(String[] args) {
        int number=-91989;
        int counter=0;
        int length=String.valueOf(number).length();
        System.out.println(length);
        while (number !=0){
            number/=10;
            counter++;
//            System.out.println(number);
        }
        System.out.println(counter);

    }
}
