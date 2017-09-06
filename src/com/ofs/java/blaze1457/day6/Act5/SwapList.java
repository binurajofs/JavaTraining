import java.util.*;
 
public class SwapList
{
    public static void main(String[] args)
    {
        // Let us create a list with 4 items
        ArrayList<String>  mylist =
                        new ArrayList<String>();
        mylist.add("Hi");
        mylist.add("Hello");
        mylist.add("R");
        mylist.add("Ravivarma");
 
        System.out.println("Original List : \n" + mylist);
 
        // Swap items at indexes 1 and 2
        Collections.swap(mylist, 2, 3);
 
        System.out.println("\nAfter swap(mylist, 1, 2) : \n"
                           + mylist);
 
        // Swap items at indexes 1 and 3
        Collections.swap(mylist, 3, 1);
 
        System.out.println("\nAfter swap(mylist, 3, 1) : \n"
                           + mylist);
    }
}
