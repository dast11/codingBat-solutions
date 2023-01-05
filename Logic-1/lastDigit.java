public boolean lastDigit(int a, int b, int c) {
  int count = 0;
  int rightDig = a % 10;
  int rightDig1 = b % 10;
  int rightDig2 = c % 10;
  if(rightDig == rightDig1){
    count = ++count;
  }
  if(rightDig1 == rightDig2){
    count = ++count;
  }
  if(rightDig2 == rightDig){
    count = ++count;
  }
  if(count < 1){
    return false;
  }else{
    return true;
  }
}
  