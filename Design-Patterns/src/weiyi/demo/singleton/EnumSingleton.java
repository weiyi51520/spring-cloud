package weiyi.demo.singleton;
/**
 * 使用枚举实现单例 
 * @author Administrator
 *
 */
public enum EnumSingleton {
	/**
	 * 枚举元素,代表了一个实例
	 */
	uniqueInstance;
	
	/**
	 * 单例可以有自己的操作
	 */
	public void singletonOperation(){
		//功能处理
	}
}
