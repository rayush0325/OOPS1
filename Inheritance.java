import java.net.SocketOption;

public class Inheritance {
    public static void main(String[] args){
        Parent obj1=new Parent();
        obj1.m1();//when referenced with the object of super class initial method(prior to overriding) is being called up

        Child1 obj=new Child1("RED","BLUE");//on calling parent constructor, child constructor get called up implicitly
        obj.m1();//using method of super class in subclass
        obj.m2();
        obj.m3();
        Child1.m3();//static method of super class used by reference of subclass
        System.out.println(obj.a+" "+obj.b);

    }
}
class Parent{
    Parent(){
        System.out.println("Parent constructor");
    }
    public String a;
    public void m1(){
        System.out.println("method 1");
    }
    public static void m3(){
        System.out.println("method 3");
    }
}
class Child1 extends Parent{
    public String b;
    Child1(String str1, String str2){
        super();
        System.out.println("child constructor");

        a=str1;//using variable of super class without declaring it in subclass
        b=str2;
    }
    public void m2(){
        System.out.println("method 2");
    }
    @Override public void m1(){
        System.out.println("method 1 overriden");//using method of super class after overriding it
    }
}
