class Solution {
    public int maxArea(int[] height) {
      int left=0,right=height.length-1;
      int maxArea=Integer.MIN_VALUE;
      while(left<right){
        int dist=right-left;
        int hei=Math.min(height[left],height[right]);
        int area=hei*dist;
        maxArea=Math.max(maxArea,area);
        if(height[left]<=height[right]){
            left++;
        }
        else{
            right--;
        }
      } 
      return maxArea; 
    }
}