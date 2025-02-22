package JavaPW.oop;
class Aeroplane{
// This is constructor
    Aeroplane(){
        System.out.println("I am constructor");
    }

    public void takeOff(){
        System.out.println("AeroPlane is taking off");
    }
    public void fly(){
        System.out.println("AeroPlane is flying");
    }
}
class CargoPlace extends Aeroplane{

//    here takeOff method is inherited

//    here fly method is Overridden
    @Override
    public void fly() {
        System.out.println("CargoPlane is Flying");
    }
}
class PassengerPlane extends Aeroplane{

    PassengerPlane(){
        System.out.println("constructor of passenger plane");
    }

    @Override
    public void takeOff() {
        super.takeOff();
    }

//    this is called specialised method ,the method which is present in child class not in parent
    public void carryLuggage(){
        System.out.println("Carrying luggage of Customers");
    }
}
public class Inheritance2 {
    public static void main(String[] args) {
        CargoPlace plane1=new CargoPlace();
        PassengerPlane plane2=new PassengerPlane();
        plane1.takeOff();
        plane1.fly();
        plane2.fly();
        plane2.carryLuggage();
    }

}
