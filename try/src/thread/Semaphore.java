package thread;

public class Semaphore {

  private boolean signal = false;
  
  public static void main(String[] args) throws Exception {
    Semaphore s = new Semaphore();
    SendingThread st = new SendingThread(s);
    st.setName("ST");
    ReceivingThread rt = new ReceivingThread(s);
    rt.setName("RT");
    
    st.start();
    rt.start();
  }
  public synchronized void take() {
    this.signal = true;
    notify();
  }
  public synchronized void release() throws InterruptedException {
    while(!this.signal) wait();
    this.signal = false;
  }
  
  private static class SendingThread extends Thread{
    private Semaphore s;
    public SendingThread(Semaphore s) {
      this.s = s;
    }
    public void run() {
      while(true) {
        for(int i=0; i < 10000; i++) {
          System.out.println(Thread.currentThread().getName() + ": " +i);
        }
        s.take();
        break;
      }
    }
   }
  private static class ReceivingThread extends Thread {
    private Semaphore s;
    public ReceivingThread(Semaphore s) {
      this.s = s;
    }
    public void run()  {
      while(true) {
        try {
          s.release();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        for(int i=10000; i > 0; i--) {
          System.out.println(Thread.currentThread().getName() + ": " +i);
        }
        break;
      }
    }
   }
}
