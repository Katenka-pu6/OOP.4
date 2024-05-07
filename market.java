import java.util.LinkedList;
import java.util.Queue;

interface QueueBehaviour {
    void enqueue(String person);
    String dequeue();
}

interface MarketBehaviour {
    void addPersonToQueue(String person);
    String servePerson();
}

public class market implements QueueBehaviour, MarketBehaviour {
    private Queue<String> queue = new LinkedList<>();

    @Override
    public void enqueue(String person) {
        queue.add(person);
    }
 
    @Override
    public String dequeue() {
        return queue.poll();
    }

    @Override
    public void addPersonToQueue(String person) {
        queue.add(person);
        System.out.println(person + " added to the queue.");
    }

    