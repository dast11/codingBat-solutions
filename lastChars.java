public String lastChars(String a, String b) {
  int len1 = a.length();
  int len2 = b.length();
  String result = null; 
  if(len1 != 0 && len2 != 0){
    String sub1 = a.substring(0,1);
    String sub2 = b.substring(len2-1, len2);
    result = sub1 + sub2;
  }else if(len1 != 0 && len2 == 0){
    String sub3 = a.substring(0,1);
    String sub4 = "@";
    result = sub3 + sub4;
  }else if(len1 == 0 && len2 != 0){
    String sub5 = "@";
    String sub6 = b.substring(len2-1 , len2);
    result = sub5 + sub6;

  }else{
    result = "@@";
  }

return result;
}
