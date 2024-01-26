package pack1;

public class A {
     void mA(){
        System.out.println("mA A pack1");
    }
    public static void main(String[] args){
        System.out.println("main A pack1");
        new A1();//calling default constructor of class A1


    }
}
class A1 extends A{

    A1(){
        A obj=new A();
        obj.mA();
        //now the method mA  is accessible in this class since it is declared as default
    }

}
