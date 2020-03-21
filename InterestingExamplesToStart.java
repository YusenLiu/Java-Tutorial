//These are interesting examples of the introduction to data structures



//This is a method defined in the class Carrot
public void waterCarrots(){
  Carrot current = garden.findNextCarrot();
  while(!waterCan.isEmpty()){
    water(current, waterCan);
    current = garden.findNextCarrot
  }
}

//This is a method defined in the class Carrot
public void eatCarrots(Carrot carrots){
  numOfCarrots = carrots.getNumCarrots();
  for(int i = 0; i < numOfCarrots; i++){
    eatCarrot(carrots.getCarrot(i));
  }
}


//This is a method best illustrates do-while
public void getUserInput(){
  String input;
  do{
    input = getInputString();
    handleInput(input);
  } while(input.length() > 0);
}
