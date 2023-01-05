public int countHi(String str) {
  int count = 0;
  if(str.length() < 2){
    return 0;
  }else{
  for(int i =  0 ; i< str.length() ; i = i+1){
    if(str.charAt(i) == 'h' && str.charAt(i+1) == 'i'){
      count++;
    } 
  }
  return count;
}}
