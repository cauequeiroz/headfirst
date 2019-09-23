import java.util.ArrayList;

class DotCom {
  private ArrayList<String> locationCells;
  private String name;

  public void setLocationCells(ArrayList<String> locations) {
    locationCells = locations;
  }

  public void setName(String value) {
    name = value;
  }

  public String checkYourself(String userGuess) {
    String result = "miss";

    int index = locationCells.indexOf(userGuess);
    if(index >= 0) {
      locationCells.remove(index);

      if (locationCells.isEmpty()) {
        result = "kill";
        System.out.println("Ouch! You sunk " + name);
      } else {
        result = "hit";
      }
    } 

    return result;
  }

}
