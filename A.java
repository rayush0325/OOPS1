package pack1;

public class A {
    private void mA(){
        System.out.println("mA A pack1");
    }
    public static void main(String[] args){
        System.out.println("main A pack1");
        new A1();


    }
}
class A1 extends A{

    A1(){
        A obj=new A();
        obj.mA();
        // method mA() has private access in A
    }

}
