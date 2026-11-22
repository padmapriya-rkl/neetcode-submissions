class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[]res=new int[nums.length];
        int prefix=1;
        res[0]=1;
        for(int i=1;i<nums.length;i++){
            res[i]=prefix*nums[i-1];
            prefix=res[i];
        }
        int post=1;
        for(int i=nums.length-1;i>=0;i--){
            res[i]=res[i]*post;
            post=post*nums[i];


        }return res;
        
    }
}  
