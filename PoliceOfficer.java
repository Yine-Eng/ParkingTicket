/**
   The PoliceOfficer class stores data about a police officer
   for the Parking Ticket Simulator programming challenge.
*/


public class PoliceOfficer
{
//variables
private String name;
  private String badgeNumber;
  
//constructor
   /**
      Constructor
      @param n The officer's name.
      @param bn The officer's badge number.
   */

   public PoliceOfficer(String n, String bn)
   {
      name = n;
     badgeNumber = bn;
   }

   /**
      Copy constructor
      @param officer2 The PoliceOfficer object to copy.
   */

   public PoliceOfficer(PoliceOfficer officer2)
   {
      name = officer2.name;
     badgeNumber = officer2.badgeNumber;
   }

   /**
      setName method
      @param n The officer's name.
   */

   public void setName(String n)
   {
      name = n;
   }

   /**
      setBadgeNumber method
      @param n The officer's badge number.
   */

   public void setBadgeNumber(String b)
   {
      badgeNumber = b;
   }

   /**
      getName method
      @return The officer's name.
   */

   public String getName()
   {
      return name;
   }

   /**
      getBadgeNumber method
      @return The officer's badge number
   */

   public String getBadgeNumber()
   {
      return badgeNumber;
   }

   /**
      The patrol method looks at the number of
      minutes a car has been parked and the number
      of minutes purchased. If the minutes parked
      is greater than the minutes purchased, a
      ParkingTicket object is returned. Otherwise
      the method returns null.
      @param car A ParkedCar object.
      @param meter A ParkingMeter object.
      @return A ParkingTicket object if a violation
              occurred, null otherwise.
   */

   public ParkingTicket patrol(ParkedCar car,
                               ParkingMeter meter)
   {
      ParkingTicket ticket = null;
      int carMinutes = car.getMinutesParked();
     int meterMinutes = meter.getMinutesPurchased();
     int violationMinutes = carMinutes - meterMinutes;
     if (violationMinutes > 0)
       ticket = new ParkingTicket(car, this, violationMinutes);
     return ticket;
   }

   /**
      toString method
      @return A string stating the officer's name
              and badge number.
   */

   public String toString()
   {
      String str = "" + name + 
         "\nBadge Number: " + badgeNumber;
     return str;
   }
}
