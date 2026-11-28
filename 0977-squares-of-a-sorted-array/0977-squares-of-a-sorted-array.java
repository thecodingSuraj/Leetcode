class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[]result = new int[n];
        int sunakshi = 0;
        int suraj = n-1;
        int index = n-1;
        while(sunakshi<=suraj){
            if(Math.abs(nums[sunakshi]) > Math.abs(nums[suraj])){
                result[index] = nums[sunakshi] * nums[sunakshi];
                sunakshi++;
            } else{
                result[index] = nums[suraj] * nums[suraj];
                suraj--;
            }
            index--;
        }
        return result;
    }
}