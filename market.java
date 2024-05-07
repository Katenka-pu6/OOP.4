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

    