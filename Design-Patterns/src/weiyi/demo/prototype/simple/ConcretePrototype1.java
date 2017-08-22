package weiyi.demo.prototype.simple;
/**
 * 具体原型角色
 * @author weiyi
 *
 */
public class ConcretePrototype1 implements Prototype {
		
		@Override
		public Object clone() {
			//最简单的克隆,新建一个自身对象
			Prototype prototype = new ConcretePrototype1();
			return prototype;
		}
}
