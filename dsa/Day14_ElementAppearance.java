package JavaPW.dsa;
//find the single element in the array
public class Day14_ElementAppearance
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,3,1};

//        brute force
//        tc=n^2
        for (int i=0;i<arr.length;i++){
            boolean flag=false;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j] && j!=i){
                    flag=true;
                }
            }
            if(!flag) {
                System.out.println(arr[i]);
                break;
            }
        }

//        Better Approach
        int singleEle=arr[0];
//        Here we are applying xor approach to te problem
//        1^1=0   0^0=0; 1^0=1 5^5=0;
        for(int i=1;i<arr.length;i++){
            singleEle=singleEle^arr[i];
        }
        System.out.println(singleEle);
        System.out.println(5^3);
        System.out.println(3^5^3);
    }

}
