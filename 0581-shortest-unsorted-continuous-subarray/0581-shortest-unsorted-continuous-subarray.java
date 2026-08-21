class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;

        int left = -1;
        int right = -1;

        
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;

        int i = 0;
        int j = n-1;

        while(i<n){
            if(nums[i] < maxVal){
                right = i;
            } else {
                maxVal = nums[i];
            }

            if(nums[j] > minVal){
                left = j;
            } else {
                minVal = nums[j];
            }

            i++;
            j--;
        }
        if(left == -1)
          return 0;

          return right - left + 1;
    }
};