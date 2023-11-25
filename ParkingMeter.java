/**
   The ParkingMeter class stores data about a parking meter
   for the Parking Ticket Simulator programming challenge.
*/


public class ParkingMeter
{
//variables
  private int minPurchased;

   /**
      Constructor
      @param m The number of minutes purchased.
   */

   public ParkingMeter(int m)
   {
    minPurchased = m;
   }

   /**
      setMinutesPurchased method
      @param m The number of minutes purchased.
   */

   public void setMinutesPurchased(int m)
   {
    minPurchased = m;
   }

   /**
      getMinutesPurchased method
      @return The number of minutes purchased.
   */

   public int getMinutesPurchased()
   {
    return minPurchased;
   }
}
