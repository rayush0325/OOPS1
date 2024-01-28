public class Constructor {
    //program to demonstrate copy constructor
    static String name;
    //parameterised constructor
    Constructor(String str){
        this.name=str;
    }
    //copy constructor
    Constructor(Constructor obj){
        this.name=obj.name+"DEF";
    }
    public static void main(String[] args){
        System.out.println("first object");
        Constructor obj1=new Constructor("ABC");//calling parameterised constructor ,passing string value as parameter to initialise attributes of current object
        System.out.println("obj1.name :"+obj1.name);
        System.out.println("second object");
        Constructor obj2=new Constructor(obj1);//calling copy constructor, passing previous object as parameter to initialise attributes of current object
        System.out.println("obj2.name :"+obj2.name);
    }
}
