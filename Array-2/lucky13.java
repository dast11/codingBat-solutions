public boolean lucky13(int[] nums) {
  boolean no = true; 
  for(int i = 0;  i < nums.length; i++){if(nums[i] == 3 || nums[i] == 1){no = false;}}
  return no;
}
   