package StackAndQueue.QueueDataStructure;

import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;

public class QueueWithLinkedList {
    public static void main(String[] args) {

        // Queue = FIFO data structure. İlk gelen, ilk çıkar prensibine dayanır.
        //		   Elemanların işlenmeden önce tutulması için tasarlanmış bir koleksiyon
        //		   Linear data structure

        //       add=    queue ekleme = offer()
        //       remove=  queue cıkarma = poll()

        // add,remove,element kullanılmaz genelde çünkü onlar genelde bir exception atar offer ve poll atmaz

        //  nerelerde kullanılır??

        // 1. Keyboard Buffer (Harfler basıldığı sırayla ekranda görünmelidir)
        // 2. Printer Queue (Yazdırma işleri sırayla tamamlanmalıdır)
        // 3. Used in LinkedLists, PriorityQueues, Breadth-first search

        // *****************************************************

        //Queue bir interface olduğu için örnek veremiyoruz bize bir sürü override edilmiş method veriyor ondan dolayı
        //linkedlist yapıyoruz. çünkü o da queue impelemente ediyor.


        Queue<Integer> q=new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            q.add(i);

        }
        System.out.println(q);
        System.out.println("------------------");



        System.out.println(q.size());
        System.out.println("------------------");

        //remove methodu ile queue'dan eleman sileriz lifo olduğu için en baştakini silecektir.
        int removeValue=q.remove();
        System.out.println("silinen deger:"+removeValue);
        System.out.println(q);
        System.out.println("------------------");

        int head=q.peek();
        System.out.println("en bastaki deger:"+head);
        System.out.println("------------------");

        q.add(5);
        System.out.println(q);
        System.out.println("------------------");

        System.out.println("ilk deger:"+q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.contains(2));


        Queue<String> queue=new LinkedList<>();
        System.out.println(queue.peek());





















    }
}
