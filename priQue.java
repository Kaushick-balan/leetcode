import java.util.*;
public class priQue {
    public static void main(String[] args){
        PriorityQueue<Integer> minH = new PriorityQueue<>();
        minH.add(50);
        minH.add(10);
        minH.add(25);
        System.out.println("PEEK:" + minH.peek());
        System.out.print("MIN HEAP: ");
        while(!minH.isEmpty()){
            System.out.print(minH.poll() + " ");
        }
        System.out.println();
        PriorityQueue<Integer> maxH = new PriorityQueue<>(Comparator.reverseOrder());
        maxH.add(50);
        maxH.add(10);
        maxH.add(25);
        System.out.println("PEEK: " + maxH.peek());
        System.out.print("MAX HEAP: ");
        while(!maxH.isEmpty()){
            System.out.print(maxH.poll()+" ");
        }
    }


}
