package pack1;

public class A {
    protected void mA(){
        System.out.println("mA A pack1");
    }
    public static void main(String[] args){
        System.out.println("main A pack1");
        new A1();//calling default constructor of class A1


    }
}
class A1 {

    A1(){
        A obj=new A();
        obj.mA();
        //now the method mA  is accessible in this class since it is declared as protected
        //now the classA1 is not the subclass of A but still methode mA is accessible in A1
    }

}
