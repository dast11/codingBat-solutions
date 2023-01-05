public int redTicket(int a, int b, int c) {
  if(a == b && a == c && b == c  && a == 2){
    return 10;
  }else if(a == b && a == c && b == c  && a != 2){

    return 5;
  }else if(a != b && a != c){
    return 1;
  }else{
    return 0;
  }
}
   