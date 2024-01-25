package OOPS;

public class THIS {
    String name;
    THIS(){
        name="hello2";
        this.display(this);
    }
    public void display(THIS obj){
        System.out.println(obj.name);
    }

    public static void main(String[] args){
        new THIS();
    }
}
