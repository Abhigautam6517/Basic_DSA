public class factorial{
    public static int factorialNumber(int n,int sum){
       
       if(n==0){
        return sum;
       }
       sum = sum*n;
       return factorialNumber(n-1,sum);


    }

    public static void main(String[] args) {
        int n = 5;
        int sum = 1;
       System.out.println(factorialNumber(n, sum));
    }
}