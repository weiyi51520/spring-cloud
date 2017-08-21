package weiyi.demo.singleton;
/**
 * 双重检查加锁的方式来实现单例模式
 * 提示：由于volatile关键字可能会屏蔽掉虚拟机中一些必要的代码优化，所以运行效率并不是很高。因此一般建议，没有特别的需要，不要使用。
 * @author weiyi
 *
 */
public class VolatileSingleton {
	//volatile关键字 被volatile修饰的变量的值，将不会被本地线程缓存，所有对该变量的读写都是直接对共享内存操作，从而确保多个线程能正确的处理该变量
	private volatile static VolatileSingleton instance= null;
	
	private VolatileSingleton(){}
	
	public static VolatileSingleton getInstance(){
		 //先检查实例是否存在，如果不存在才进入下面的同步块,不必每次都进入同步块
        if(instance == null){
            //同步块，线程安全的创建实例
            synchronized (VolatileSingleton.class) {
                //再次检查实例是否存在，如果不存在才真正的创建实例
                if(instance == null){
                    instance = new VolatileSingleton();
                }
            }
        }
		return instance;
	}
}
