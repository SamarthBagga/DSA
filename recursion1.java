public class recursion1 {
    public static void main(String[] args) {
        System.out.println(digSum(520));
    }



    static int factorial(int n){
        if(n<=1){
            return 1;
        }
        return n*factorial(n-1);
    }

    static int digSum(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+digSum(n/10);
    }

    static int sumForRev1=0;
    static int revNum1(int n){
        if(n==0){
            return 0;
        }
        int rem=n%10;
        sumForRev1=sumForRev1*10+rem;
        return revNum1(n /10);


    }

    private int helper(int num,int steps){
        if(num==0) {
            return steps;
        }
        if(num%2==0){
            return helper(num/2,steps+1);
        }
        return helper(num-1,steps+1);
    }
}
