package OOPS;

public class NewOpeartor {

    public static void main(String[] args){
        new Test();
        //this new Test() statement is calling default constructor of class Test
    }
}
class Test{
    Test(){
        System.out.println("New Operator");
    }
}

