package pack2;
import pack1.*;

public class B {
    public static void main(String[]  args) {
        A obj = new A();
        obj.mA();
    }
    //we are accessing the method mA() of class A of package pack1 in package pack2
    //this time class B is not the subclass of A
    // This access is possible because method mA() is declared as public
}
