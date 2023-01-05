public String oneTwo(String str) {
 String empty = ""; 
 int len = str.length(); 
 if(len > 3 && len % 3 != 0){
  str = str.substring(0, len - len % 3);
 }
 for(int i= 0; i < len - 2; i++){
  if(str.length() == 3){
    empty += str.charAt(i+1);
    empty += str.charAt(i+2);
    empty += str.charAt(i);    
  }
}
 for(int i= 0; i < len - 2; i = i + 3){
  if(len > 3){
    empty += str.charAt(i+1);
    empty += str.charAt(i+2);
    empty += str.charAt(i);    
}
   
}

 return empty;
}
      