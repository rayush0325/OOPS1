package pack2;
import pack1.*;

public class B extends A{
    public static void main(String[]  args) {
        B obj = new B();
        obj.mA();
    }
    //we are accessing the method mA() of class A of package pack1 in package pack2 through inheritance.
    // This access is possible because method mA() is declared as protected
}
