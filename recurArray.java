import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;

public class recurArray {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        System.out.println(linear(arr,0,5));

    }
    static boolean sorted(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr,index+1);
    }

    static int linear(int[] arr,int index,int num){
        if(arr[index]==num){
            return index;
        }
        return linear(arr,index+1,num);
    }
    static ArrayList<Integer> findAllIndex2(int[] arr,int target,int index){
        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls=findAllIndex2(arr,target,index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }


}
