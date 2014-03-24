package thread;

public class WaitNotify {

  public static void main(String[] args) {
    WaitNotify wn = new WaitNotify();
    Thread1 t1 = new Thread1(wn);
    Thread2 t2 = new Thread2(wn);
    
    t1.start();
    t2.start();
  }
  private Object obj = new Object();
  private boolean wasSignalled = false;
  
  public void doWait() {
    synchronized(obj) {
      while (!wasSignalled) {
        try {
          obj.wait();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      wasSignalled = false;
    }
  }
  
  public void doNotify() {
    synchronized(obj) {
      wasSignalled = true;
      obj.notify();
    }
  }
  
  private static class Thread1 extends Thread {
    private WaitNotify wn;
    public Thread1(WaitNotify wn) {
      this.wn = wn;
    }
    @Override
    public void run() {
      System.out.println("Inside T1");
      try {
        Thread.sleep(10000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      wn.doNotify();
    }
  }

  private static class Thread2 extends Thread {
    private WaitNotify wn;
    public Thread2(WaitNotify wn) {
      this.wn = wn;
    }
    @Override
    public void run() {
      wn.doWait();
      System.out.println("Inside T2");
      
    }
  }
}
