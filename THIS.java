package OOPS;

public class THIS {
    THIS(){
       this("ABCD");
    }
    THIS(String str){
        System.out.println("String is "+str);
    }
    public static void main(String[] args){
        new THIS();
    }
}
