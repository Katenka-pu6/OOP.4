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

