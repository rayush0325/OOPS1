import java.util.*;
public class ARRAYLIST {
    public static void main(String[] args){
        //declaring array list
        ArrayList<String> arr=new ArrayList<String>();
        System.out.println(arr);//printing array list
        //adding element
        arr.add("A");
        arr.add("C");//adding at the end
        arr.add(1,"B");//adding at specified index

        arr.set(0,"a");//setting element at 0th index to 0

        arr.remove(1);//at specified index
        arr.remove("B");//remove at first occurence

        System.out.println(arr);

        System.out.println(arr.size());

        String str=arr.get(0);//get element at specified index
        System.out.println(str);
        //in case of primitive type wrapper class would have been used
        // Integer n=arr.get(index);
    }
}
