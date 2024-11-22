import java.util.*;

public class ConnectNRopes {
    public static int connectTheRopes(int arr[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }

        int cost = 0;
        
        while(pq.size() > 1){
            int firstMin = pq.remove();
            int secondMin = pq.remove();

            cost += (firstMin + secondMin);
            pq.add(firstMin + secondMin); // important step
        }

        return cost;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(connectTheRopes(arr));



        sc.close();
    }
}

//Approach 2 - Using Greedy Algorithms 
/*
 * If I choose to go with greedy algorithm then in that case I will directly sort the array
 * First combine the 2 initital value 
 * but this approach will not give the MINIMUM COST.
 */