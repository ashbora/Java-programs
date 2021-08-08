 package vehicle;
 public class Vehicle
 {
     int wheels;
     String make,model;
     public void setVehicleData(int wheels,String make,String model) 
     {
        this.wheels = wheels;
        this.make = make;
        this.model = model; 
     }
     public void putVehicleData()
     {
         System.out.println("Number of wheels     :"+wheels);
         System.out.println("Make                        :"+make);
         System.out.println("Model                       :"+model);
     }
 }