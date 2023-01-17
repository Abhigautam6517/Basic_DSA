import java.util.ArrayList;

class factorialLargeNumber {
    static ArrayList<Integer> factorial(int N){
        int c = 0;  
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0,1); 
        int val = 2;  
        while(val <= N){
            for(int i = list.size()-1; i >= 0; i--){
				int temp= list.get(i)*val+c;  
               	list.set(i,temp%10);  
                c = temp/10;
            }
            while(c != 0){
                list.add(0, c%10);
                c = c/10;
            }
            val++;
        }
        return list;
    }
    public static void main(String[] args) {
        int a = 158;
        System.out.println(factorial(a));
    }
}


