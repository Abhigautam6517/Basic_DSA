
class Solution
{
   int max_path_sum(int A[], int B[], int l1, int l2){
int sum1=0,sum2=0,res=0;
       int i=0,j=0;
       while(i<l1 && j<l2)
       {
           
           if(A[i]>B[j])
           {
               sum2+=B[j];
               j++;
           }
           else if(A[i]<B[j])
           {
               sum1+=A[i];
               i++;
           }
           else
           {
               res=res+Math.max(sum1,sum2)+A[i];
               sum1=0;
               sum2=0;
               i++;
               j++;
           }
       }
       while(i<l1)
       {
           sum1+=A[i];
           i++;
       }
       while(j<l2)
       {
           sum2+=B[j];
           j++;
       }
       res=res+Math.max(sum1,sum2);
       return res;
   }

}