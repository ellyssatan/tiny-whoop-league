package vttp_paf.drone.models;

public enum NumLap {
   //Constants with values
   THREE(3),
   FIVE(5);


   private final int lapValue;

   NumLap(int lapValue) {
       this.lapValue = lapValue;
   }
   
   public int getLevelCode() {
       return this.lapValue;
   }

   
}

