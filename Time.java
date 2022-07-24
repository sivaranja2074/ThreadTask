package Thread;
import java.util.Timer;
import java.util.TimerTask;
import java.time.LocalTime;
//
//public class Time implements Runnable {
//
//	public void run() {
//		for(int i=1;i<10;i++)
//		{
//		System.out.println(LocalTime.now());
//		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
//		}
//	}
//
//	public static void main(String[] args) {
//
//		Time time = new Time();
//
//		Thread t1 = new Thread(time);
//		t1.start();
//
//	}
//}


 
class Time
{
    public static void main(String[] args) throws InterruptedException
    {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Running: " +LocalTime.now());
            }
        }, 0, 2000);

    }
	

}