public int sum13(int[] nums) {
  int sum = 0; 
  if(nums.length == 0){sum = 0;}
  else{
    for(int i = 0; i < nums.length; i++){
      sum += nums[i];
      if(nums[i] == 13 && i != nums.length - 1){sum -= 13; sum -= nums[i+1];}
      if(nums[i] == 13 && i == nums.length - 1){sum -= 13;}

    }
  }
  if(sum < 0)
    sum = 0;
  return sum;
}
  