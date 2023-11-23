package StackAndQueue.QueueDataStructure;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue=new CustomQueue(5);
        queue.insert(12);
        queue.insert(6);
        queue.insert(88);
        queue.insert(1);
        queue.insert(15);
        queue.display();
        queue.remove();
        queue.display();

        System.out.println("------------");

        CircularQueue queue2=new CircularQueue();
        queue2.insert(3);
        queue2.insert(6);
        queue2.insert(5);
        queue2.insert(19);
        queue2.insert(1);
        queue2.display();
        queue2.remove();
        queue2.display();
        queue2.insert(133);
        queue2.display();
        queue2.remove();
        queue2.display();
        queue2.insert(99);
        queue2.display();
    }
}
