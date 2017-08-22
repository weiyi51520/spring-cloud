package weiyi.demo.prototype.simple;
/**
 * 抽象原型角色
 * @author weiyi
 *
 */
public interface Prototype {
	/**
	 * 克隆自身的方法
	 * @return 一个自身克隆出来的对象
	 */
	public Object clone();
}
