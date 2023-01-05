//TANAY's CODE P4
public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  if(isAsleep == true){
    return false;
  }else{
    if(isMorning == true && isMom == true){
      return true;
    }else if(isMorning == true && isMom == false){
      return false;
    }else{
      return true;
    }
  }
}
    