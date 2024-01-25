package OOPS;

public class THIS {
    String name;
    THIS(){
        name="hello1";
        display(this);
    }
    public void display(THIS obj){
        System.out.println(obj.name);
    }

    public static void main(String[] args){
        new THIS();
    }
}
