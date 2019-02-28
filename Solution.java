public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        int n = nums.length;
        int min = 99999;
        int closestSum = 0;
        Arrays.sort(nums);
        
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n-1; j++){
                for(int k = j+1; k < n; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    int x = 0;
                    if(target > sum){
                        x = target - sum;
                    }
                    else if( sum > target ){
                        x = sum - target;
                    }
                    if ( x < min){
                         min = x;
                        closestSum = sum;
                    }
                }
            }
        }
        return closestSum;
        
    }
}
