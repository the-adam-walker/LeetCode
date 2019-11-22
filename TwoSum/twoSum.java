class Solution {
    public int[] twoSum(int[] nums, int target) {
      for(int firstPass = 0; firstPass < nums.length; firstPass++) {
        for(int secondPass = firstPass + 1; secondPass <  nums.length; secondPass++) {
          if(nums[firstPass] + nums[secondPass] == target) {
            return new int[] {firstPass, secondPass};
          }
        }
      }
      return null;
    }
}
