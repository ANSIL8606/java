
import java.util.ArrayDeque;
import java.util.Deque;
public class DequeOperations {
     public static void main(String[] args)
  {
  //Initializing an deque
  Deque<String>dq=new ArrayDeque<String>();
  //add() method to insert
  dq.add("have");
  dq.addFirst("Welcome");
  dq.add("a");
  dq.add("nice");
  dq.addLast("day");
  System.out.println(dq);
  System.out.println("Pop():"+dq.pop());
  System.out.println("Poll():"+dq.poll());
  
  System.out.println("PollFirst():"+dq.pollFirst());
  System.out.println("PollLast():"+dq.pollLast());
  }
  }