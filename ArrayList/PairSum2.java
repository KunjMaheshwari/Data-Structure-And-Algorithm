import java.util.*;

public class PairSum2 {
    public static boolean pairsum(ArrayList<Integer> list, int target){
        int n = list.size();
        int pivot = -1;
        for(int i=0;i<list.size();i++){
            if(list.get(i) > list.get(i+1)){
                pivot = i;
                break;
            }
        }
        int lp = pivot+1;
        int rp = pivot;

        while(lp != rp){
            //case 1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }else if(list.get(lp) + list.get(rp) < target){ //case 2
                lp = (lp+1)%n;
            }else{
                rp = (n+rp-1)%n; // case 3
            }
        }
        return false;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        System.out.println(pairsum(list, target));
    }
}
