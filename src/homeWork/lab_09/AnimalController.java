package homeWork.lab_09;

import java.util.List;

public class AnimalController {

    public static Animal getWinner(List<Animal> animalList) {
        Animal winner = animalList.get(0);
        for (Animal animal : animalList) {
          if(!animal.isHasWing()){
            if (animal.getSpeed() > winner.getSpeed())
              winner = animal;
          }
        }
        return winner;
      }
}
