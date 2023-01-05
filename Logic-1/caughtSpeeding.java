public int caughtSpeeding(int speed, boolean isBirthday) {
  if(isBirthday == true){
    if(speed-5 <= 60){
      return 0; 
    }
    else if(speed-5 > 81){
      return 2; 
    }
    else{
      return 1; 
    }
  }
  else{
    if(speed <= 60){
      return 0; 
    }
    else if(speed > 81){
      return 2; 
    }
    else{
      return 1; 
    }

  }
}
