package Heaps;
import java.util.*;

public class WeakestSol{
    static class Row implements Comparable<Row>{
        int index,solCount;

        Row(int index,int solCount){
            this.index = index;
            this.solCount= solCount;
        }
        @Override
        public int compareTo(Row r2){
            if(this.solCount == r2.solCount){
                return this.index-r2.index;
            }else{
                return this.solCount - r2.solCount;
            }
        }

    }
    
    public static void main(String[] args) {
        int army[][] = {{1,0,0,0},
                        {1,1,1,1},
                        {1,0,0,0},
                        {1,0,0,0}};

        int k=2;//find first k weak soldiers
        PriorityQueue<Row> r = new PriorityQueue<>();

        for(int i=0;i<army.length-1;i++){
            int solcount = 0;
            for(int j=0;j<army[i].length-1;j++){
                if(army[i][j]==1){
                    solcount++;
                }
            }
            r.add(new Row(i, solcount));
        }
        while(k>0){
            System.out.println("row "+r.poll().index);
            k--;
        }
    }
}