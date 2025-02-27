package JavaPW.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods
{
    public static void main(String[] args) {
//        program to demonstrate basic method of Arraylist
        List<String> list=new ArrayList<>();
        list.add("first");
        list.add("Second");
        list.add("Third");
        System.out.println("Arraylist : "+list);
        System.out.println("Size of the list = "+list.size());
        System.out.println("Change first to first : "+list.set(0,"First"));
        System.out.println("Index of \"Third\" : "+list.indexOf("Third"));
        System.out.println("Fetching element at second index position = "+list.get(2));
        System.out.println("Checking that Second is present or not : "+list.contains("Second"));
        System.out.println("Removing element @ second position : "+list.remove(1));
        System.out.println("Arraylist : "+list);
        System.out.println("Checking Arraylist is empty or wot : "+list.isEmpty());
        System.out.println(list.containsAll(list));
        System.out.println("Adding string at 2 position");
        list.add(1,"Second");
        System.out.println("Arraylist : "+list);
        System.out.println("Removing String \"Second\" : "+list.remove("Second"));
        System.out.println("Arraylist : "+list);

//        using for loop
        System.out.println("For Loop");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
//using for each loop or enhanced for loop
        System.out.println("Enhanced Foreach ");
        for(String o : list){
            System.out.println(o);
        }
//using streams
        System.out.println("Using Streams");
        list.forEach(System.out::println);


        List<String> list2=new ArrayList<>();
        list2.add("hi");
        list2.add("hello");
        System.out.println(list.addAll(list2));
        System.out.println("adding list2 to list: "+list);

        System.out.println("Remove All Elements : ");
        list.clear();
//        System.out.println("ArrayList + "+list);
        list.clear();
    }
}
