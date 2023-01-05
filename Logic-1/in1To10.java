public boolean in1To10(int n, boolean outsideMode) {
  if(outsideMode == false){
    if(n < 11 && n > 0){
      return true;
    }
  }else{
    if(n < 2 || n > 9){
      return true;
    }
  }
  return false;  
}
   