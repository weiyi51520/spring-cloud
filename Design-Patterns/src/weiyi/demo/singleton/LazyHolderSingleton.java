package weiyi.demo.singleton;

/**
 * �����༶�ڲ����JVM�ڲ�ͬ��ʵ�ֵ���ģʽ
 * ���ģʽ�������� getInstance������û�б�ͬ��,����ֻ��ִ��һ����ķ���,�ӳٳ�ʼ����û�����ӷ��ʳɱ�
 * @author weiyi
 *
 */
public class LazyHolderSingleton {
	
	private LazyHolderSingleton(){}
	
	/**
	 * �༶�ڲ���,������ʱ�Ż���أ������ⲿ��ʵ��
	 * ʲô���༶�ڲ��ָࣿstatic���ε��ڲ���,�൱���ⲿ���static��Ա
	 * ,���Ķ���ʵ���Ƕ�����,���������ⲿ��,ֻ���ڵ�һ��ʹ�õ�ʱ��Żᱻװ��
	 * @author Administrator
	 *
	 */
	private static class SingletonHolder{
		/**
		 * ���߳�ȱʡͬ��֪ʶ
		 * ��ĳЩ��� JVM�ڲ�ִ����ͬ��,�����Լ���ʹ��������ͬ������
		 * 1.�ɾ�̬��ʼ�������ھ�̬�ֶ��ϻ�static{}���еĳ�ʼ��������ʼ������ʱ
		 * 2.����final�ֶ�ʱ
		 * 3.�ڴ����߳�֮ǰ��������ʱ???
		 * 4.�߳̿��Կ�������Ҫ����Ķ���ʱ??? ��������ûŪ��ɶ��˼
		 * ������1�����,��JVM��֤�̰߳�ȫ
		 */
		private static LazyHolderSingleton instance = new LazyHolderSingleton();
	}
	/**
	 * getInstanced��һ�α�����ʱ,����SingletonHolder�ڲ���ʱʵ�����ڲ�������ⲿ��ʵ��instance
	 * @return
	 */
	public static LazyHolderSingleton getInstance(){
        return SingletonHolder.instance;
    }
}
