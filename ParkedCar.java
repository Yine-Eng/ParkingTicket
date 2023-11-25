/**
   The ParkedCar class stores data about a parked car
   for the Parking Ticket Simulator programming challenge.
*/

public class ParkedCar
{
//variables
  private String make;
  private String model;
  private String color;
  private String license;
  private int minParked;

   /**
      Constructor
      @param mk The car's make.
      @param mod The car's model.
      @param col The car's color.
      @param lic The car's license number.
      @param min The number of minutes parked.
   */

   public ParkedCar(String mk, String mod, String col,
                    String lic, int min)
   {
    make = mk;
    model = mod;
    color = col;
    license = lic;
    minParked = min; 
   }

   /**
      Copy constructor
      @param car2 A reference to a ParkedCar object to copy.
   */

   public ParkedCar(ParkedCar car2)
   {
      this.make = car2.make;
     this.model = car2.model;
     this.color = car2.color;
     this.license = car2.license;
     this.minParked = car2.minParked;
     
   }

   /**
      setMake method
      @m The car's make.
   */

   public void setMake(String m)
   {
    make = m;
   }

   /**
      setModel method
      @m The car's model.
   */

   public void setModel(String m)
   {
    model = m;
   }

   /**
      setColor method
      @c The car's color.
   */

   public void setColor(String c)
   {
    color = c;
   }

   /**
      setLicenseNumber method
      @lic The car's license number.
   */

   public void setLicenseNumber(String lic)
   {
    license = lic;
   }

   /**
      setMinutesParked method
      @m The number of minutes parked.
   */

   public void setMinutesParked(int m)
   {
    minParked = m;
   }

   /**
      getMake method
      @return The car's make.
   */

   public String getMake()
   {
    return make;
   }

   /**
      getModel method
      @return The car's model.
   */

   public String getModel()
   {
    return model;
   }

   /**
      getColor method
      @return The car's color.
   */

   public String getColor()
   {
    return color;
   }

   /**
      getLicenseNumber method
      @return The car's license number.
   */

   public String getLicenseNumber()
   {
    return license;
   }

   /**
      getMinutesParked method
      @return The number of minutes parked.
   */

   public int getMinutesParked()
   {
    return minParked;
   }

   /**
      toString method
      @return A string stating the car's make, model,
              color, license number, and minutes parked.
   */

   public String toString()
   {
     String str = "" + make + "\n"
       + "Car's Model: " + model + "\n"
       + "Car's Color: " + color + "\n"
       + "License Number: " + license + "\n"
       + "Minutes Parked: " + minParked;
     return str;
   }
}
