public class Solution {
    public int[] twoSum(int[] arr, int target) 
    {
        int k=0;
        int[] temp=new int[2];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    temp[k++]=i;
                    temp[k]=j;
                    return temp;
                }
            }
        }
        return temp;

        
    }
}