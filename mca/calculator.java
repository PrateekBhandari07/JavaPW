package mca;

import java.util.Scanner;

class calculatorr
{
    int first =0,second=0;
    static int result;
    calculatorr(int first, int second){
        this.first=first;
        this.second=second;
    }
    public void add(){
        result= first+second;
        System.out.println("Additon of "+first+" and "+second+" is :"+result);
    }
    public void sub(){
        result= first-second;
        System.out.println("Subtraction of "+first+" and "+second+" is :"+result);
    }
    public void mul(){
        result= first*second;
        System.out.println("Multiplication of "+first+" and "+second+" is :"+result);
    }
    public void div(){
        result= first/second;
        System.out.println("Divison of "+first+" and "+second+" is :"+result);
    }
    public void reset(){
        result=0;
        System.out.println("Assigned value of result to 0");
    }
    public static void exit(){
        System.out.println("Program got exited");
        System.exit(0);
    }
    public static void main(String[] args) {
        System.out.println("Enter the first number");
        Scanner sc=new Scanner(System.in);
        int first =sc.nextInt();
        System.out.println("Enter Second number : ");
        int second=sc.nextInt();
        calculatorr a=new calculatorr(first,second);
        System.out.println("Enter the choice\n 1 : Addition \n 2: Subtraction \n 3 : Multiplication \n 4 : Division \n 5 : Reset \n 6 :exit \n");
        int choice=sc.nextInt();
        switch(choice){
            case 1 :
                a.add();
                break;
            case 2 :
                a.sub();
                break;
            case 3 :
                a.mul();
                break;
            case 4 :
                a.div();
                break;
            case 5 :
                a.reset();
                break;
            case 6 :
                calculatorr.exit();
                break;
            default:
                System.out.println("Invalid Inputs");
        }

    }
}
