package sharpieset;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SharpieSet {
  private ArrayList<Sharpie> sharpieSet;
   public SharpieSet() {
    sharpieSet = new ArrayList<>();
   }

   public void add(Sharpie sharpie) {
     sharpieSet.add(sharpie);
   }
   public int getSize(SharpieSet sharpieSet) {
     return this.sharpieSet.size();
   }

   public void countUsable() {
     int counter = 0;
     int usableSharpies = 0;
     for (int i = 0; i < sharpieSet.size(); i++) {
       if (sharpieSet.get(i).getInkAmount() > 0) {
         counter++;
       }
     }
     System.out.println(counter);
   }
  public void removeTrash() {
    for (int i = 0; i < sharpieSet.size(); i++) {
      if (sharpieSet.get(i).getInkAmount() == 0){
        sharpieSet.remove(sharpieSet.get(i));
      }
    }
    System.out.println(sharpieSet.size());
  }
}
