// TANAY'S CODE
public boolean endsLy(String str) {
  if (str.length() > 1){
  int len = str.length();
  String sub = str.substring(len-2, len);
  if (sub.equals("ly")) return true;

  }
  return false;
}




