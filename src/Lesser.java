
import java.util.*;

class Solution
{
    public void calculate(int[] array,int n)
    {
        int[] result=new int[n];
        for(int i=0;i<n-1;i++)
        {
            int count=0;
            for(int j=i+1;j<n;j++)
            {
                if(array[j]<array[i])
                {
                    count++;
                }
            }
            result[i]=count;
        }
        System.out.println(Arrays.toString(result));
    }
}

class Lesser
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=scanner.nextInt();
        }
        Solution solution =new Solution();
        solution.calculate(array,n);
    }
}
