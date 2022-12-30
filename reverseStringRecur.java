import java.util.Arrays;

public class reverseStringRecur {
    public static void main(String[] args) {
        char[] str1={'a','b','c'};
        System.out.println(Arrays.toString(reverse(str1,0,0)));

    }

    static char[] reverse(char[] str,int ind,int it){
        if(str.length==1){
            return str;
        }
        if(it==str.length/2){
            return str;
        }
        char temp=str[ind];
        str[ind]=str[str.length-1-it];
        str[str.length-1-it]=temp;

        return reverse(str,ind+1,it+1);






    }
    public void reverseString(char[] s) {
        if(s.length==1||s.length==0){
            System.out.println(s);
        }
        char temp;
        for(int i=0;i<s.length/2;i++){
            temp=s[i];
            s[i]=s[s.length-1-i];
            s[s.length-1-i]=temp;
        }
        System.out.println(s);
    }
}
