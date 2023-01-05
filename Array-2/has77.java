public boolean has77(int[] nums) {
  int count = 0;
  for(int i = 0; i < nums.length - 1; i++){
    if(nums[i] == 7 && nums[i+1] == 7){
      count++;
    }
  }
    for(int i = 0; i < nums.length - 2; i++){
    if(nums[i] == 7 && nums[i+2] == 7){
      count++;
    }
  }
  return(count > 0);
}
   