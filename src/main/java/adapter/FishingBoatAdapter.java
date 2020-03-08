package adapter;

public class FishingBoatAdapter implements RowingBoat { //implement contract

  private FishingBoat fishingBoat;

  public FishingBoatAdapter() {
    fishingBoat = new FishingBoat(); //create and init object
  }

  public final void row() {
    fishingBoat.sail(); //implement interface method by calling method of object
  }
}
