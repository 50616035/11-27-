package thread;

public class Thread_run extends Thread{
public void run() {
	for(int i=0;i<10;i++) {
		System.out.println("スレッド1から出力:"+i);
		try {
			sleep(500);//等間隔にゆっくり表示する
		} catch (InterruptedException e) {//catch はtryで例外が発生した場合実行
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
