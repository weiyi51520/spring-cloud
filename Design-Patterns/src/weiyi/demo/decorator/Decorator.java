package weiyi.demo.decorator;
/**
 * 装饰角色
 * @author weiyi
 */
public class Decorator implements Component {
	private Component component;
	
	public Decorator(Component component) {
		// TODO Auto-generated constructor stub
		this.component = component;
	}
	@Override
	public void sampleOperation() {
		// 委派给构件
		component.sampleOperation();
	}

}
