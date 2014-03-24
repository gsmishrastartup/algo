package thread;

public class Counter {

  private Long counter = new Long(0);
  
  public static void main(String[] args) {
    Counter c = new Counter();
    System.out.println(c.count());
    System.out.println(c.count());
    System.out.println(c.count());
    System.out.println(c.count());
  }
  public Long count() {
    synchronized(counter) {
      counter = new Long(counter.longValue()+1);
      return counter;
    }
  }
}
