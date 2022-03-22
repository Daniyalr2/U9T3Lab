public class VechicleTests
{
  public static void main(String[] args)
  {
    Vehicle myVehicle3 = new Vehicle("BB8123", 7.0, 3);
    myVehicle3.printInfo();
    Car myCar3 = new Car("MK4567", 6.75, 4, true);
    myCar3.printInfo();
    Truck myTruck3 = new Truck("TB12MX", 15.50, 2, 4, true);
    myTruck3.printInfo();
    Taxi myTaxi4 = new Taxi("TX1412", 13.75, 4, true, 2.0);
    myTaxi4.printInfo();








  }
}