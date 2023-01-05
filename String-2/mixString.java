public String mixString(String a, String b) {
  int lengthA = a.length();
  int lengthB = b.length(); 
  int shorter  = 0; 
  String empty = "";
  if(lengthA <= lengthB){
    shorter = lengthA;
    lengthB= shorter; 
  }else if(lengthB <= lengthA){
    shorter = lengthB;
    lengthA = shorter; 
  }
  
  for(int i = 0; i < shorter   ; i++){
    empty += a.substring(i, i+1);
    empty += b.substring(i, i +1);
  }
  if(b.length() > a.length()){
    empty += b.substring(lengthA);  
}
  if(a.length() > b.length()){
    empty += a.substring(lengthA);  
}

  return empty; 

}
  