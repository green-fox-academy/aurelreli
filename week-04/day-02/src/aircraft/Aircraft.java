package aircraft;

public class Aircraft {
  private int ammo;
  private int damage;
  private int maxAmmo;

  public Aircraft() {
    ammo = 0;
  }

  public int fight() {
    if (ammo != 0) {
      int damageDealt = ammo * damage;
      setAmmo(0);
      return damageDealt;
    }
    return 0;
  }

  public int refill(int number) {
    if (ammo == maxAmmo) {
      return number;
    } else if (number < maxAmmo-ammo) {
      ammo = ammo + number;
      return 0;
    } else {
      ammo = maxAmmo;
    }
    return number-(maxAmmo-ammo);
  }

  public String getType() {
    return getClass().getSimpleName();
  }

  public void getStatus() {
    System.out.println(
        "Type: " + getType() + ", Ammo: " + ammo + ", Base Damage: " + damage + ", All damage: " +
            ammo * damage);
  }

  public boolean isPriority() {
    return getType().equals("F35");
  }

  public int getAmmo() {
    return ammo;
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public void setAmmo(int ammo) {
    this.ammo = ammo;
  }

  public void setDamage(int damage) {
    this.damage = damage;
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }
}
