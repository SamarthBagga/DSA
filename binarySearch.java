public class binarySearch {
    public static void main(String[] args) {
        int arr[]={3,4,5,7,8,9,10};
        int target=6;
        System.out.println(binarySearch(arr,target));
    }


    static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        int i;
        for(i=0;i<arr.length;i++){

            if(arr[i]>target && arr[i-1]<target){
                break;
            }
        }
        return i;

    }
}
