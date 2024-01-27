import javax.swing.plaf.synth.SynthLookAndFeel;

public class Static {
    static int x=0;
    int y=1;
    public static void m(){
        System.out.println("Static method ");
    }
    public void m1(){
        System.out.println("non-static method ");
    }

    public static void main(String[] args){
        System.out.println("accessing static method");
        m();//static methods are accessible directly within static methods
        Static.m();//static methods are accessible with class name
        Static obj=new Static();//
        obj.m();//static methods are accessible with object reference
        System.out.println(x);//static method (here main()) can only access static variable directly
        System.out.println(obj.y);//non-static methods and variable can be accessed in non-static methods only through object reference
        obj.m1();


    }
}




