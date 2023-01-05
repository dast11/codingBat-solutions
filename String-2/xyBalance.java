public boolean xyBalance(String str) {
  int length = str.length();  
  int count  = 0; 
  int counter  = 0; 
  for(int i = 0; i < length; i++){
    if(str.charAt(i) == 'x' && str.substring(i).contains("y")){
      count ++; 
    }
  }
    for(int i = 0; i < length; i++){
    if(str.charAt(i) == 'x'){
      counter++; 
    }
  }
  if(count == counter){
    return true;
  }
  else{
    return false;
  }
}

  