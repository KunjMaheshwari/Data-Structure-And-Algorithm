import java.util.*;

public class SlidingWindowMaximum {
    static class Pair implements Comparable<Pair>{
        int number;
        int index;

        public Pair(int number, int index){
            this.number = number;
            this.index = index;
        }

        @Override
        public int compareTo(Pair p2){
            // descending order mai sort kr diye hai.
            return p2.number - this.number;
        }
    }
    public static void main(String args[]){
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k = 3; // window size
        int res[] = new int[arr.length-k+1]; // result array size i.e. n-k+1

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        // Step 1 - Store the values of 1 element.
        for(int i=0;i<k;i++){
            pq.add(new Pair(arr[i], i));
        }

        // Step 2 - Store the maximum value in the Result Array
        res[0] = pq.peek().number;

        // Step 3 - this is for the new window.
        for(int i=k;i<arr.length;i++){
            while(pq.size() > 0 && pq.peek().index <= (i-k)){ // remove the elements from Priority Queue which are present before the defined index.
                pq.remove();
            } 

            pq.add(new Pair(arr[i], i));
            res[i-k+1] = pq.peek().number;
        }

        //Print the Result
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();

    }
}
