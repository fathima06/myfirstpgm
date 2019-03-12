interface Parent1{
    
    default void Car(){
    System.out.println("Audi Car");
}
}
class B {
    public void Bike()
    {
        System.out.println("Duke Bike");   
    }}
    class C extends A{
        public void Cycle()
    {
        System.out.println("Ladybird Cycle");   
    }}
      public class Multilevelinheritance{
          public static void main(String[] args) {
              C ob=new C();
ob.Car();
          }
      }