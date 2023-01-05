public boolean squirrelPlay(int temp, boolean isSummer) {
  if(isSummer == true && temp < 101 && temp > 59){
    return true;
  }else if(isSummer == false && temp < 91 && temp > 59){
    return true;
  }else{
    return false;
  }
}
 