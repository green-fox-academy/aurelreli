package petrolstation;

public class Station {
  private int fuelAmount;

  public Station(int fuelAmount) {
    this.fuelAmount = fuelAmount;
  }
  public void refill(Car car) {
    if (fuelAmount > car.getCapacity()-car.getGasAmount()) {
      car.setGasAmount(car.getCapacity());
      fuelAmount = fuelAmount - car.getCapacity();
    } else {
      car.setGasAmount(getFuelAmount());
      setFuelAmount(0);
    }
  }

  public void setFuelAmount(int fuelAmount) {
    this.fuelAmount = fuelAmount;
  }

  public int getFuelAmount() {
    return fuelAmount;
  }
}
