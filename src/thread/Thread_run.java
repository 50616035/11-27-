package thread;

public class Thread_run extends Thread{
public void run() {
	for(int i=0;i<10;i++) {
		System.out.println("�X���b�h1����o��:"+i);
		try {
			sleep(500);//���Ԋu�ɂ������\������
		} catch (InterruptedException e) {//catch ��try�ŗ�O�����������ꍇ���s
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
