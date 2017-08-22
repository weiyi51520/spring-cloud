package weiyi.demo.adapter.objectadapter;
/**
 * @author weiyi
 * 目标角色
 * 这个角色是以一个JAVA接口的形式实现的。
 * 可以看出，这个接口声明了两个方法：sampleOperation1()和sampleOperation2()。
 */
public interface Target {
	/**
     * 这是源类Adaptee也有的方法
     */
    public void sampleOperation1(); 
    /**
     * 这是源类Adapteee没有的方法
     */
    public void sampleOperation2();
}
