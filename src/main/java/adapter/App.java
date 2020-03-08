package adapter;

public class App {

  public static void main(String[] args) {
    Captain captain = new Captain(new FishingBoatAdapter());
    captain.row();
  }
}

//An object adapter can adapt the interface of its parent class.
//most of the applications using third party libraries use adapters as a middle layer
//between the application and the 3rd party library to decouple the application from the library.
//If another library has to be used only an adapter for the new library is required without having to change the application code.
