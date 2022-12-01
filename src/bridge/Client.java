package bridge;

public class Client {

    public static void main(String[] args) {
        FifoCollection<Integer> collection = new Queue<>(new SinglyLinkedList<>());
        collection.offer(10);
        collection.offer(20);
        collection.offer(30);
        collection.offer(40);
        collection.offer(50);

        System.out.println(collection.poll());
    }

}
