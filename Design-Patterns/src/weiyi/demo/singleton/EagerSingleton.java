package weiyi.demo.singleton;

//恶汉式单例类

public class EagerSingleton {
	//饿汉式是典型的空间换时间，当类装载的时候就会创建类的实例，不管你用不用，先创建出来 
	private static EagerSingleton instance = new EagerSingleton();
	/**
	 * 默认私有构造方法
	 */
	private EagerSingleton() {}
	/**
	 * 静态工厂方法
	 * @return
	 */
	public static EagerSingleton getInstance(){
		return instance;
	}
}
