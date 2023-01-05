public boolean endOther(String a, String b){
 a = a.toLowerCase(); 
 b = b.toLowerCase(); 
 String greater = a;
 String smaller = b;
 int aLen = a.length();
 int bLen = b.length(); 
 if(bLen > aLen){
  greater = b;
  smaller = a;
}
  String newStr = greater.substring(greater.length()- smaller.length(), greater.length());
  if(newStr.equals(smaller)){
    return true;
  }
  return false;
}
 