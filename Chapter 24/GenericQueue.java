import java.util.LinkedList;

public class GenericQueue<E> extends LinkedList<E>{
    public static void main(String[] args) {
      GenericQueue<String> myQueue = new GenericQueue<>();
      myQueue.enqueue("Matthew");
      myQueue.enqueue("Lillian");
      myQueue.enqueue("Gigi");
      myQueue.enqueue("Papa");

      System.out.println("The list before: " + myQueue);
      myQueue.enqueue("Mom");
      System.out.println("The list after enqueue: " + myQueue);

      System.out.println("The list before: " + myQueue);
      myQueue.dequeue();
      System.out.println("The list after dequeue: " + myQueue);
  }      
    public void enqueue(E e) {
        this.addLast(e);
 }
                     
    public E dequeue() {
        return this.removeFirst();
    }
    public int getSize() {
    return this.size();
 }
                    
  }