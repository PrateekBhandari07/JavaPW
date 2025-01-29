package mca;

class check{
     protected check(){
        System.out.println("up constructor called");
    }
}

public class chech {
    protected chech(){
        System.out.println("same constructor called");
    }


    public static void main(String[] args) {

        chech obj=new chech();
       check ob=new check();

    }
}