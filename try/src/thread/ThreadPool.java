package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ThreadPool {

  private BlockingQueue queue;
  List<Thread> threadPool = new ArrayList<Thread>();
  
  public ThreadPool(int poolSize, int maxNumTasks) {
    queue = new LinkedBlockingQueue(maxNumTasks);
    for (int i=0; i < poolSize; i ++) {
      threadPool.add(new PoolThread(queue));
    }
    for (Thread thread: threadPool) {
      thread.start();
    }
  }
  
  public synchronized void execute(Runnable task) {
   queue.add(task);
  }
  
  private static class PoolThread extends Thread {
    BlockingQueue queue;
    public PoolThread(BlockingQueue queue) {
      this.queue = queue;
    }
    
    public void run() {
      
    }
  }
}
