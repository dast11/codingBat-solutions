public boolean inOrder(int a, int b, int c, boolean bOk) {
  if(b > a && c > b && bOk == false){
    return true; 
  }else if(c > b && bOk == true){
    return true;
  }
  return false;
}
    