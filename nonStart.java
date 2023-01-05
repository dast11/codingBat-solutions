public String nonStart(String a, String b) {
  int len1 = a.length();
  int len2 = b.length();
  String conc1 = a.substring(1, len1);
  String conc2 = b.substring(1,len2);
  return (conc1 + conc2);
}
