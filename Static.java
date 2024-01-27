import javax.swing.plaf.synth.SynthLookAndFeel;

public class Static {

    static int x=0;//static variable created at class level

    public void m(){
        System.out.println(x);//static variable can be accessed in non-static members of class
    }

    public static void main(String[] args){
        System.out.println("main method");
        x=1;
        Static obj=new Static();
        obj.x=2;
        System.out.println("Static.x :"+Static.x);//static variable are accessible with class name
        System.out.println("x :"+x);//accessing without object
        System.out.println("obj.x :"+obj.x);//accessing with object
        Static obj1 =new Static();
        System.out.println("obj1.x :"+obj1.x);//change in value of static variable x is reflected in all objects
        Static obj2 =new Static();
        obj2.m();
        System.out.println("y :"+Static1.y);//accessing static variable y of class Static1 with its class name
        Static1 obj3=new Static1();
        System.out.println("obj3 :"+obj3.y);

    }
}
class Static1{
    static int y=0;//created at class level

}



