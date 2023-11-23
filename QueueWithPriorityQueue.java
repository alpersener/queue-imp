package StackAndQueue.QueueDataStructure;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueWithPriorityQueue {
    public static void main(String[] args) {
       Queue<Integer> pq=new PriorityQueue<>();
       pq.add(5);
       pq.add(3);
       pq.add(0);
       pq.add(1);
        while (!pq.isEmpty()) {
            int element = pq.poll();
            System.out.println("Eleman: " + element);
        }
        System.out.println();

        Queue<String> pq2=new PriorityQueue<>();
        pq2.add("alper");
        pq2.add("for");
        pq2.add("sener");
        System.out.println(pq2);
        System.out.println("---------------------");


        //öncelik alper'de olduğu için alperi silecektir.
        pq2.remove();
        System.out.println(pq2);

        System.out.println("---------------------");


        pq2.add("alper");

        Iterator iterator=pq2.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next()+" ");














    }




}
