package JavaPW.array;
class arr{
    public void add(int arr[]){
        int total=0;
        for(int a:arr){
            total+=a;
        }
        System.out.println("Total : "+total);
    }
}
public class anonymous
{
    public static void main(String[] args) {
        arr ob=new arr();
        ob.add(new int[]{1,2,3,4,5});
    }
}
