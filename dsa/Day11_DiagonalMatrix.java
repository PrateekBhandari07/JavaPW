package JavaPW.dsa;
//Given a square matrix, calculate the absolute difference between the sums of its diagonals.

public class Day11_DiagonalMatrix
{
    public static void main(String[] args) {
        int arr[][]={{1,2,3},
                     {4,5,6},
                     {7,8,-12}};
        int diagonal1=0,diagonal2=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){

                if(i==j){
                    diagonal1+=arr[i][j];
                }
                if (i+j==arr.length-1){
                    diagonal2+=arr[i][j];
                }
            }
        }
        System.out.println("Difference of Diagonal : "+Math.abs(diagonal1-diagonal2));
    }
}
