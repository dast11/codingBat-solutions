public boolean either24(int[] nums) {
  int twos = 0;
  int fours = 0;
  for(int i = 0; i < nums.length - 1; i++){
    if(nums[i] == 2 && nums[i+1] == 2)
      twos++;
    if(nums[i] == 4 && nums[i+1] == 4)
      fours++;
  }
  
  return((twos > 0 || fours > 0) && twos != fours);
}
