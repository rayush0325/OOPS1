public class Constructor {
    static int count=0;
    Constructor(){
        count+=1;
        System.out.println("calling constructor "+count);
    }
    public static void main(String[] args){
        new Constructor();// constructor can only be called at the time of object creation and only once
        new Constructor();//to call the constructor again we have to create another object
        new Constructor();
    }
}
