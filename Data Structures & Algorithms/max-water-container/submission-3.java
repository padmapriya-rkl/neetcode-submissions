class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r=heights.length-1;
        int maxi=0;
        while(l<r){
            int length=Math.min(heights[l],heights[r]);
            int area=length*(r-l);
            maxi=Math.max(maxi,area);
            if(heights[l]<heights[r]){
                l++;
            }
            else{
                r--;
            }
            

        } return maxi;

        
    }
}
