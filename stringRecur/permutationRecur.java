package stringRecur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permutationRecur {
    public static void main(String[] args) {
        permutations("","abc");
        String samarth="samarth";
        int arr[]={1,6,5,6,6};
        System.out.println(countOcc(arr,6));
        ArrayList<Integer> list = new ArrayList<>();
        putOcc(list,arr,6,0);
        System.out.println(list);
        char[] s={'s','a','m'};
        reverseString(s);





    }
    static void permutations(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);

        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            permutations(f+ch+s,up.substring(1));
        }

    }

    static int countOcc(int[] arr,int n){
        if(arr.length==0){
            return 0;
        }
        if(arr[0]==n){
            return 1+countOcc(Arrays.copyOfRange(arr,1,arr.length),n);
        }
        return countOcc(Arrays.copyOfRange(arr,1,arr.length),n);
    }
    static ArrayList putOcc(ArrayList list,int arr[],int n,int ind){
        if(arr.length==0){
            return list;
        }
        if(arr[0]==n){
            list.add(ind);
        }
        return putOcc(list,Arrays.copyOfRange(arr,1,arr.length),n,ind+1);
    }
    public static void reverseString(char[] s) {
        char temp;
        for(int i=0;i<s.length/2;i++){
            temp=s[i];
            s[i]=s[s.length-1-i];
            s[s.length-1-i]=temp;
    }


}
    public boolean isPowerOfTwo(int n) {
        if (n==1){
            return true;
        }
        else if(n%3!=0||n==0){
            return false;
        }else {
            return isPowerOfTwo(n/3);
        }

    }


}

