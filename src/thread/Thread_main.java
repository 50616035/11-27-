package thread;

public class Thread_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread_run[] th = new Thread_run[10];
		th[0] = new Thread_run();
		th[0].run();//runのほうが呼び出される
		
		Thread_runnable[] th2 = new Thread_runnable[10];
		th2[0] = new Thread_runnable();
		th2[0].run();//runのほうが呼び出される
		
		
		for(int i=0;i<10;i++) {
			try {
				th[0].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("mainから出力:"+i);
			
		}
	}

}
