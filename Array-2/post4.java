public int[] post4(int[] nums) {
  int j = 0; 
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 4)
      j = i; 
  }
  int n = nums.length  - j -1;
  int[] a = new int[n];
  for(int y = 0; y < a.length; y++){
    a[y] = nums[j+y+1];
  }
  return a;
}
   