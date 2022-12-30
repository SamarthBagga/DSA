package stringRecur;
import java.util.ArrayList;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<List<Integer>> ans=subset(arr);
        for(List<Integer> list:ans){
            System.out.println(list);
        }
        List<Integer> samarth=new ArrayList<>(1);
        System.out.println(samarth);


    }
    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1));
        }else{
            skip(p+ch,up.substring(1));
        }

    }
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer=new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num:arr){
            int n=outer.size();
            for(int i=0;i<n;i++){
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;

    }
}
