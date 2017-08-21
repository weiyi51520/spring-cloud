package weiyi.demo.singleton;
//����ʽ������
public class LazySingleton {
	//����ʽ����ʱû��ֱ�Ӵ���ʵ��,�ڵ���getInstanceʱ�Żᴴ��ʵ��
	private static LazySingleton instance = null;
    /**
     * ˽��Ĭ�Ϲ�����
     */
    private LazySingleton(){}
    /**
     * ��̬��������
     * ʹ����synchronized�ؼ��� ��ֹ���̴߳������ʵ��
     */
    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
