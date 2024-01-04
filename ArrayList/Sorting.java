import java.util.*;

public class Sorting {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(3);

        System.out.println(list); //without sorted
        Collections.sort(list); // list will be sorted in ascending order
        System.out.println(list); // with sorted


        //descending
        Collections.sort(list, Collections.reverseOrder()); // Collections.reverseOrder is a comparator - function logic
        System.out.println(list);
    }
}
