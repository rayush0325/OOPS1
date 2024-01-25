package OOPS;

public class THIS {
    String name;
    THIS(){
        name="hello";
    }
    THIS return_object(){
        return this;
    }
    public void display(){
        System.out.println(name);
    }
    public static void main(String[] args){
        (new THIS()).return_object().display();
    }
}
