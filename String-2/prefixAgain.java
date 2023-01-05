public boolean prefixAgain(String str, int n) {
  String prefix = str.substring(0, n); 
  String newString = str.substring(n, str.length());
  if(newString.contains(prefix)){
    return true;
  }else{
    return false;
  }
}
 