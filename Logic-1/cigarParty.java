public boolean cigarParty(int cigars, boolean isWeekend) {
  if(cigars> 39 && cigars < 61 || isWeekend == true && cigars > 39){
    return true;
  }
  return false;
}


