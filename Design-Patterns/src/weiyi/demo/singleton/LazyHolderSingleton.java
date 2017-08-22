package weiyi.demo.singleton;

/**
 * 利用类级内部类和JVM内部同步实现单例模式
 * 这个模式优势在于 getInstance方法并没有被同步,并且只是执行一个域的访问,延迟初始化并没有增加访问成本
 * @author weiyi
 *
 */
public class LazyHolderSingleton {
	
	private LazyHolderSingleton(){}
	
	/**
	 * 类级内部类,被调用时才会加载，生成外部类实例
	 * 什么是类级内部类？指static修饰的内部类,相当于外部类的static成员
	 * ,它的对象实例是独立的,不依赖于外部类,只有在第一次使用的时候才会被装载
	 * @author Administrator
	 *
	 */
	private static class SingletonHolder{
		/**
		 * 多线程缺省同步知识
		 * 在某些情况 JVM内部执行了同步,不用自己在使用锁进行同步控制
		 * 1.由静态初始化器（在静态字段上或static{}块中的初始化器）初始化数据时
		 * 2.访问final字段时
		 * 3.在创建线程之前创建对象时???
		 * 4.线程可以看见它将要处理的对象时??? 后面两个没弄懂啥意思
		 * 这里是1的情况,由JVM保证线程安全
		 */
		private static LazyHolderSingleton instance = new LazyHolderSingleton();
	}
	/**
	 * getInstanced第一次被调用时,加载SingletonHolder内部类时实例化内部类里的外部类实例instance
	 * @return
	 */
	public static LazyHolderSingleton getInstance(){
        return SingletonHolder.instance;
    }
}
