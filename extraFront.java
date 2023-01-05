// TANAY PERIOD 4 CODE 
public String extraFront(String str) {
  int len = str.length(); 
  String result = null;
  if (len >= 2){
      String substring = str.substring(0,2);
      result = substring+substring+substring;
  }else{
    result = str+str+str;
  }
  return result;
}
  