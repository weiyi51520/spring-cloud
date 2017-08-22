package weiyi.demo.singleton;
//懒汉式单例类
public class LazySingleton {
	//懒汉式上来时没有直接创建实例,在调用getInstance时才会创建实例
	private static LazySingleton instance = null;
    /**
     * 私有默认构造子
     */
    private LazySingleton(){}
    /**
     * 静态工厂方法
     * 使用了synchronized关键字 防止多线程创建多个实例
     */
    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
