import java.util.ArrayList;
import java.util.Arrays;

public class StockBuySell {
        ArrayList<ArrayList<Integer> > stockBuySell(int arr[], int n) {
            ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            for(int i=1;i<=n;i++){
                try
                {
                    if(arr[i]>arr[i-1])
                    {
                        ans.add(new ArrayList<Integer>(Arrays.asList(i-1,i)));
                    }    
                }
                catch(Exception e){}
            }
         
            return list;
        }
    }
    

