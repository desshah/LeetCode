class Solution {
    public boolean containsDuplicate(int[] nums) {

        //one way of doing O(n^2) using for loop- brute force
        // int len= nums.length;

        // for( int i=0;i<len;i++)
        // {
        //     for(int j=i+1;j<len;j++)
        //     {

        //         if(nums[i]== nums[j])
        //         {
        //             return true;
        //         }

        //     }
        // }
        // return false;

        //efficiant way of doing is hashset-> coz it does not take duplicate
        // problem is we need extra space-> O(n)
        //time complexity -> O(n)
 
        Set<Integer> same= new HashSet<>();

        for ( int num: nums)
        {
            if (same.contains(num))
            {
                return true;
            }
            same.add(num);
        }

        return false;
        
    }
}