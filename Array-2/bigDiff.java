public int bigDiff(int[] nums) {
  int max = nums[0];
  int min = nums[0];
  for(int i = 0; i < nums.length; i++){if(nums[i] > max){max = nums[i];}}
  for(int j = 0; j < nums.length; j++){if(nums[j] < min){min = nums[j];}}
  return max - min; 
}
  