package homeWork.lab_09;

import java.util.List;

public class AnimalController {

    public static AnimalBuilder getWinner(List<AnimalBuilder> animalBuilderList) {
        AnimalBuilder winner = animalBuilderList.get(0);
        for (AnimalBuilder animalBuilder : animalBuilderList) {
          if(!animalBuilder.isHasWing()){
            if (animalBuilder.getSpeed() > winner.getSpeed())
              winner = animalBuilder;
          }
        }
        return winner;
      }
}
