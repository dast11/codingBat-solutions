public String seeColor(String str) {
  String result = ""; 
  if(str.length() >= 3){
    String red = str.substring(0,3);
    if(red.equals("red")){
      result = "red";
    }
  }
  if(str.length() >= 4){
String blue = str.substring(0,4);
if(blue.equals("blue")){
      result = "blue";
    }
}
  
  
  
  return result; 
}

