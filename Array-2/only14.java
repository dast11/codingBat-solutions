public boolean only14(int[] nums) {
  int length = nums.length;
  int count = 0; 
  for(int i = 0; i < length; i++){
    if(nums[i] == 1  || nums[i] == 4)
      count++;
  }
  return(count == length);
}
    