package petrolstation;

public class Main {
  public static void main(String[] args) {
    int defGasAmount = 0;
    int defCapacity = 100;
    Car opel = new Car(defGasAmount, defCapacity);
    Station station = new Station(70);
    station.refill(opel);
    System.out.println("cars fuel:" + opel.getGasAmount());
    System.out.println("stations fuel: " + station.getFuelAmount());
  }
}
