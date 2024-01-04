import java.util.ArrayList;

public class PairSum1 {
    // Brute force
    // public static boolean pairsum(ArrayList<Integer> list, int target){
    // for(int i=0;i<list.size();i++){
    // for(int j=i+1;j<list.size();j++){
    // if(list.get(i)+list.get(j) == target){
    // return true;
    // }
    // }
    // }
    // return false;
    // }

    // 2pointer Approach
    public static boolean pairsum(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;

        while (lp != rp) {
            if (list.get(lp) + list.get(rp) > target) {
                rp--;
            } else if (list.get(lp) + list.get(rp) < target) {
                lp++;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;
        System.out.println(pairsum(list, target));
    }
}
