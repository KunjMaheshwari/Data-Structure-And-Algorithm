import java.util.ArrayList;

public class Maximum {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        //Initialize Maximum with Integer.min value
        int maximum = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i) >= maximum){
                maximum = list.get(i);
            }
        }
        System.out.println("Maximum element: "+ maximum);
    }
}
