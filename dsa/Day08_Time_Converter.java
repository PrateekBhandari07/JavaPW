package JavaPW.dsa;

public class Day08_Time_Converter
{
    public static void main(String[] args) {
//         12:45:54PM --> 12:45:54
//        07:05:45PM --> 19:05:45
//        12:00:00AM --> 00:00:00
        String time="02:07:24AM";

//        String format=time.substring(8,9);//P
//        int hour=Integer.parseInt(time.substring(0,2));//07
//        if(format.equals("P")){
//            if(hour==12) {
//                System.out.println(12+time.substring(2,8));
//                return;
//            }
//            System.out.println((hour+12)+time.substring(2,8));
//        }
//        else {
//            if(hour==12){
//                System.out.println("00"+time.substring(2,8));
//                return;
//            }
//            else if(hour<10){
//                System.out.println("0"+(hour)+time.substring(2,8));
//                return;
//            }
//            System.out.println((hour)+time.substring(2,8));
//        }


//        2nd solution

        String period=time.substring(8);//AM or PM
        int hour=Integer.parseInt(time.substring(0,2));
        String rest=time.substring(2,8);

        if(period.equals("AM")){
            if(hour==12){
                System.out.println("00"+rest);
            }
            else {
                System.out.println(String.format("%02d",hour)+rest);
//                System.out.println(hour+rest);
            }
        }
        else if(period.equals("PM")){
            if(hour==12){
                System.out.println("12"+rest);
            }
            else {

                System.out.println((hour+12)+rest);
            }
        }

    }
}
