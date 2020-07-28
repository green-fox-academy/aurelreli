package petrolstation;

public class Car {
  private int gasAmount;
  private int capacity;



  public Car(int gasAmount, int capacity) {
    this.gasAmount = gasAmount;
    this.capacity = capacity;
  }

  public int getCapacity() {
    return capacity;
  }
  public int getGasAmount() {
    return gasAmount;
  }
  public void setGasAmount(int gasAmount) {
    this.gasAmount = gasAmount;
  }
}
