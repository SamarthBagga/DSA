import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class recursionNew1 {
    public static void main(String[] args) {
//        int arr1[]={1,2,3,4,5,6,7,8};
//        System.out.println(search(arr1,3, arr1.length,0));
//        fun(5);
//        System.out.println(sum(1234));
//        System.out.println(count(100,0));
//        int[] arr1={1,2,2,4,5};
//        System.out.println(linear(arr1,0,2));

//        System.out.println(reverse(-132));
//        int[] arr1={3,2,4,5,1};
//        int[] abc=mergeSort(arr1);
//        System.out.println(Arrays.toString(abc));
//        String sam="sam";
//        subseq("","sam");
//        perm("","abc");
//        System.out.println(letterCombinations("23"));
//    dice("",4);
//        int[] arr={2,1,4,3,5};
//        bubblesort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(digSum(6));
//        System.out.println(fiboo(5));
        System.out.println(climb(3));

    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    static int search(int[] arr,int target,int e,int s){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(target<arr[m]){
            return search(arr,target,m-1,s);
        }
        return search(arr,target,e,m+1);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        fun(n-1);
        System.out.println(n);
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sum(n/10);
    }

    static int count(int n,int c){
        if(n==0){
            return c;
        }
        int rem=n%10;
        if(rem==0){
            return count(n/10,c+1);
        }
        return count(n/10,c);
    }
    public static int numberOfSteps(int num) {
        return helper(num,0);
    }

    private static int helper(int num,int c){
        if(num==0){
            return c;
        }
        if(num%2==0){
            return helper(num/2,c+1);
        }
        return helper(num-1,c+1);
    }
    static boolean checkSort(int[] arr,int n){
        if(n==arr.length-1){
            return true;
        }
        if(arr[n]>arr[n+1]){
            return false;
        }
        return checkSort(arr,n+1);
    }
    static int linear(int[] arr, int index,int target){
        if(arr[index]==target){
            return index;
        }
        if(index==arr.length-1){
            return -1;
        }
        return linear(arr,index+1,target);
    }
    public static int reverse(int x) {
        int digits=(int)(Math.log10(x))+1;
        if(x<0){
            return -helper(-x,digits);

        }
        return helperr(x,digits);


    }
    static int helperr(int num,int digits){
        if(num%10==num){
            return num;
        }
        int rem=num%10;
        return rem*(int)(Math.pow(10,digits-1))+helperr(num/10,digits-1);
    }
    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    private static int[] merge(int[] first,int[] second){
        int[] mix=new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;

        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }

    //quick sort
    static void subseq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }

    static void perm(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            perm(f+ch+s,up.substring(1));
        }
    }

    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            pad(p+ch,up.substring(1));
        }

    }
    public static List<String> letterCombinations(String digits) {
        List<String> list2= new ArrayList<String>();
        list2.addAll(helper2("",digits));
        return list2;




    }

    private static List<String> helper2(String p, String up) {
        if(up.isEmpty()){
            List<String> list=new ArrayList<String>();
            list.add(p);
            return list;
        }
        int digit=up.charAt(0)-'0';
        List<String> list=new ArrayList<String>();
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            list.addAll(helper2(p+ch,up.substring(1)));

        }
        return list;
    }
    static void dice(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=6&& i<=target;i++){
            dice(p+i,target-i);
        }
    }
    static void bubblesort(int[] arr){
        if(arr.length==0){
            return;
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
            }
        }
        bubblesort(Arrays.copyOfRange(arr,0,arr.length-1));
    }
    public static int digSum(int n){
        if(n==0){
            return 0;
        }
        return n+digSum(n-1);

    }
    static int fiboo(int n){
        if(n<2){
            return n;
        }
        return fiboo(n-1)+fiboo(n-2);
    }
    static int count=0;
    static int climb(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        int one = climb(n - 1);
        int two = climb(n - 2);
        return one + two;
    }}




