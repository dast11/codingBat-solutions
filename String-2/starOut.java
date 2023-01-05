public String starOut(String str) {
  int end = str.length(); 
  String empty = ""; 
  if(end > 1){
  if(str.charAt(0) != '*' && str.charAt(1) != '*')
    empty += str.substring(0,1);
  for(int i = 1; i < str.length() - 1 ; i++){
  if(str.charAt(i) != '*' && str.charAt(i+1) != '*' && str.charAt(i-1) != '*')
    empty += str.substring(i, i+1);
  }
  if(str.charAt(end - 1) != '*' && str.charAt(end - 2) != '*')   
    empty += str.substring(end - 1);
  return empty;
  }else{
    if(end == 0 || str.charAt(0) == '*')
      return ""; 
    else
      return str; 
  }
}
