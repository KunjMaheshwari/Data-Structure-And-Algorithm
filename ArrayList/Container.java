// import java.util.*;

// //Brute force Approach
// public class Container {
//     public static int storeWater(ArrayList<Integer> height){
//         int maxWater = Integer.MIN_VALUE;
//         for(int i=0;i<height.size();i++){
//             for(int j=0;j<height.size();j++){
//                 int ht = Math.min(height.get(i), height.get(j));
//                 int wd = j-i;
//                 int currWater = ht*wd;
//                 maxWater = Math.max(currWater, maxWater);
//             }
//         } // Time complexity -> O(n2)
//         return maxWater;
//     }
//     public static void main(String args[]) {
//         ArrayList<Integer> height = new ArrayList<>();
//         height.add(1);
//         height.add(8);
//         height.add(6);
//         height.add(2);
//         height.add(5);
//         height.add(4);
//         height.add(8);
//         height.add(3);
//         height.add(7);

//         int result = storeWater(height);
//         System.out.println(result);
//     }
// }

// Optimized Approach

import java.util.*;

public class Container{
    public static int storeWater(ArrayList<Integer> height){
        // Solving using 2 pointer approach
        int maxWater = 0;
        int lp = 0; //left pointer
        int rp = height.size()-1; //right pointer

        while(lp<rp){
            //calculate the water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp;
            int currWater = ht*width;

            maxWater = Math.max(maxWater, currWater);

            //update the pointers
            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }

        } //Time complexity of this code will be O(n);
        return maxWater;
    }
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        int result = storeWater(height);
        System.out.println(result);
    }
}