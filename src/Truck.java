public class Truck extends Vehicle
{
  private int axles;
  private boolean hasTrailer;
  
  public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer)
  {
    super(licensePlate, tollFee, passengers);
    this.axles = axles;
    this.hasTrailer = hasTrailer;
  }

  public boolean validateLicensePlate()
  {
    if (!hasTrailer)
    {
      return true;
    }
    else
    {
      if(axles > 4 && getLicensePlate().substring(getLicensePlate().length() - 2).equals("MX"))
      {
        return true;
      }
      else if(axles <= 4 && getLicensePlate().substring(getLicensePlate().length() - 2).equals("LX"))
      {
        return true;
      }
      else
      {
        return false;
      }
    }
  }

  @Override
  public void printInfo()
  {
    super.printInfo();
    System.out.println("Axles: " + axles + "\nHas Trailer: " + hasTrailer);
  }

  @Override
  public double calculateTollPrice()
  {
    if (hasTrailer)
    {
      return getTollFee() * axles * 2;
    }
    return getTollFee() * axles;
  }
}