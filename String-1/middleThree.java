public String middleThree(String str) {
  int len = str.length();
  int start = len / 2;
  return str.substring(start-1, start+2);
}