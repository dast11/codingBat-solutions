public String repeatEnd(String str, int n) {
  String empty = "";
  String end  = str.substring(str.length()- n, str.length());
  for(int i =  0 ; i< n ;i = i+1){
    empty += end;
  }
  return empty;
  
  
}
