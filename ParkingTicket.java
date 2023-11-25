/**
   The ParkingTicket class stores data about a parking ticket
   for the Parking Ticket Simulator programming challenge.
*/


public class ParkingTicket
{
//variables
  private ParkedCar car;
  private PoliceOfficer officer;
  private double fine;
  private int minutes;
  private double baseFine = 25.0;
  private int hourlyFine = 10;
  private int minOverHour = 60;
  private int minOverMin = 1;
  private int minOverHourMin = minOverHour * minOverMin;
   /**
      Constructor
      @param aCar A ParkedCar object.
      @param anOfficer A PoliceOfficer object.
      @param min Minutes illegally parked.
   */

   public ParkingTicket(ParkedCar aCar,
                        PoliceOfficer anOfficer,
                        int min)
   {
    car = new ParkedCar(aCar);
    officer = new PoliceOfficer(anOfficer);
    minutes = min;
    calculateFine();
   }

   /**
      Copy constructor
      @param ticket2 A ParkingTicket object to copy.
   */

   public ParkingTicket(ParkingTicket ticket2)
   {
      car = ticket2.car;
   }

   /**
      calculateFine method
      This method calculates the amount of the parking fine.
   */

   private void calculateFine()
   {
      int hours = minutes / minOverHourMin;
      fine = baseFine + (hours * hourlyFine);
   }

   /**
      setCar method
      @param c A ParkedCar object.
   */

   public void setCar(ParkedCar c)
   {
    car = c;
   }

   /**
      setOfficer method
      @param o A PoliceOfficer object.
   */

   public void setOfficer(PoliceOfficer o)
   {
    officer = o;
   }

   /**
      getCar method
      @return A copy of this object's car field.
   */

   public ParkedCar getCar()
   {
    return new ParkedCar(car);
   }

   /**
      getFine method
      @return The amount of the fine.
   */

   public double getFine()
   {
    return fine;
   }

   /**
      getOfficer method
      @return A copy of this object's officer field.
   */

   public PoliceOfficer getOfficer()
   {
    return officer;
   }

   /**
      toString method
      @return A string stating data about the car, the
              police officer, and the parking violation.
   */

   public String toString()
   {
      String str = "Car: " + car + "\n"
         + "Officer: " + officer + "\n"
         + "Minutes Illegally Parked: " + minutes + "\n"
        + "Fines: $" + fine;
     return str;
   }
}
