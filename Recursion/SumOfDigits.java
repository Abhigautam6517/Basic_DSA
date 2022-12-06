public class SumOfDigits {
    public static int Digits(int stop, int start,int sum) {
        if(start==stop+1){
            return sum;
        }
        sum = sum+start;
        return Digits(stop, start+1, sum);


    }
    
    public static void main(String[] args) {
        int stop = 5;
        int start = 1;
        int sum = 0;
        System.out.println(Digits(stop,start,sum));    
    }

 
    
}
