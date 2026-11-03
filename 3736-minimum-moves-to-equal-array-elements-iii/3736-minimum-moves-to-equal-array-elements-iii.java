class Solution {
    public int minMoves(int[] nums) {
        int max = -999999;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            ans += max - nums[i];
        }
        // System.out.print(max);
        return ans;
    }
}