package weiyi.demo.singleton;

//��ʽ������

public class EagerSingleton {
	//����ʽ�ǵ��͵Ŀռ任ʱ�䣬����װ�ص�ʱ��ͻᴴ�����ʵ�����������ò��ã��ȴ������� 
	private static EagerSingleton instance = new EagerSingleton();
	/**
	 * Ĭ��˽�й��췽��
	 */
	private EagerSingleton() {}
	/**
	 * ��̬��������
	 * @return
	 */
	public static EagerSingleton getInstance(){
		return instance;
	}
}
