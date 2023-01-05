public int teenSum(int a, int b) {
  if(a < 13 && b < 13 || a > 19 && b < 13 || b > 19 && a < 13 ){
    return(a+b);
  }else{
    return 19;
  }
}
   