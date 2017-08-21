package weiyi.demo.singleton;
/**
 * ˫�ؼ������ķ�ʽ��ʵ�ֵ���ģʽ
 * ��ʾ������volatile�ؼ��ֿ��ܻ����ε��������һЩ��Ҫ�Ĵ����Ż�����������Ч�ʲ����Ǻܸߡ����һ�㽨�飬û���ر����Ҫ����Ҫʹ�á�
 * @author weiyi
 *
 */
public class VolatileSingleton {
	//volatile�ؼ��� ��volatile���εı�����ֵ�������ᱻ�����̻߳��棬���жԸñ����Ķ�д����ֱ�ӶԹ����ڴ�������Ӷ�ȷ������߳�����ȷ�Ĵ���ñ���
	private volatile static VolatileSingleton instance= null;
	
	private VolatileSingleton(){}
	
	public static VolatileSingleton getInstance(){
		 //�ȼ��ʵ���Ƿ���ڣ���������ڲŽ��������ͬ����,����ÿ�ζ�����ͬ����
        if(instance == null){
            //ͬ���飬�̰߳�ȫ�Ĵ���ʵ��
            synchronized (VolatileSingleton.class) {
                //�ٴμ��ʵ���Ƿ���ڣ���������ڲ������Ĵ���ʵ��
                if(instance == null){
                    instance = new VolatileSingleton();
                }
            }
        }
		return instance;
	}
}
