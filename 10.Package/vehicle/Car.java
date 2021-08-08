 package vehicle;
 public class Car extends Vehicle
 {
    public Car(String make,String model)
   {
       setVehicleData(4,make,model);
   }
   public void putCarInfo()
   {
        putVehicleData();
   }
 }