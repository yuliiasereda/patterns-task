package adapter;

// The Captain uses RowingBoat to sail. <br> This is the client in the pattern.
public final class Captain {

  private RowingBoat rowingBoat; //call objects throw interface

  public Captain(RowingBoat rowingBoat) {
    this.rowingBoat = rowingBoat;
  }

  void row() {
    rowingBoat.row();
  }
}
