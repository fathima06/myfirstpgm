class A{
    public void Car(){
    System.out.println("Audi Car");
}
}
class B extends A{
    public void Bike()
    {
        System.out.println("Duke Bike");   
    }}
      public class Inheritance{
          public static void main(String[] args) {
              B ob=new B();
ob.Car();
ob.Bike();
          }
      }