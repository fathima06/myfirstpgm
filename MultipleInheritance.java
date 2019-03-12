interface Parent1{
    default void Car(){
    System.out.println("Audi Car");
}
}
interface Parent2{
    default void Car(){
    System.out.println("BMW Car");
}
}
public class MultipleInheritance implements Parent1,Parent2{
    public void Car(){
        Parent1.super.Car();

    }
    public static void main(String[] args) {
        MultipleInheritance d= new MultipleInheritance();
        d.Car();
    }
}