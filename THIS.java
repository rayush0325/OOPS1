package OOPS;

public class THIS {
    String name;

    public String get_name(){
        return name;
    }
    public void set_Name(String str){
        name=str;
    }
    public void display(){
        System.out.println(name);
    }
    public static void main(String[] args){
        THIS obj=new THIS();
        obj.set_Name("ABC");
        System.out.println(obj.get_name());
        
    }
}
