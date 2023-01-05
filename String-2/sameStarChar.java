public boolean sameStarChar(String str) {
  int i=1;
  while(i<str.length()-1){
  if(str.charAt(i)=='*'){
  if(str.charAt(i-1)!=str.charAt(i+1))
  return false;
  }
  i++;
  
  }
  return true;
  }
