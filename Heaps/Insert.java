import java.util.*;

public class Insert {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            // Step 1 -> add at that last index
            arr.add(data);

            // Step 2 -> Fix the Heap
            int x = arr.size()-1; // child index

            int par = (x-1)/2; // parent index

            while(arr.get(x) < arr.get(par)){
                // Step 3 - Swapping
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1)/2;
            }
        }
    }
    public static void main(String args[]){
        
    }
}


// Time complexity of this code will be O(logn);