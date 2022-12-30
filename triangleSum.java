import java.util.Arrays;

public class triangleSum{
    public static void main(String[] args) {
        int[] A={1,2,3,4,5};
        triagnle(A);

    }
    static int[] triagnle(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int[] temp=new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            temp[i]=arr[i]+arr[i+1];
        }
        System.out.println(Arrays.toString(arr));
         return triagnle(temp);
    }

}