import java.util.*;

public class WeakestSoldier {
    public static class Row implements Comparable<Row> {
        int soldiers;
        int index;

        public Row(int soldiers, int index){
            this.soldiers = soldiers;
            this.index = index;
        }

        @Override
        public int compareTo(Row r2){ // compareTo is used to compare two objects in java
            if(this.soldiers == r2.soldiers){
                return this.index - r2.index; // if the value of soldiers is equal then we will compare on the basis of index.
            }else{
                return this.soldiers - r2.soldiers;
            }
        }
    }
    public static void main(String args[]){
        int army[][] = {{1,0,0,0},
                        {1,1,1,1},
                        {1,0,0,0},
                        {1,0,0,0}};
        int k = 2;

        PriorityQueue<Row> pq = new PriorityQueue<>();
        
        for(int i=0;i<army.length;i++){
            int count = 0;
            for(int j=0;j<army[0].length;j++){
                count += army[i][j] == 1 ? 1 : 0;
            }
            pq.add(new Row(count, i));
        }

        for(int i=0;i<k;i++){
            System.out.println(pq.remove().index);
        }
    }


}
