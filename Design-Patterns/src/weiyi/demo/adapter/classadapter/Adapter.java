package weiyi.demo.adapter.classadapter;

/**
 * @author weiyi
 *适配器角色Adapter扩展了Adaptee,同时又实现了目标(Target)接口
 */
public class Adapter extends Adaptee implements Target {
	/**
	 * adaptee没有实现sampleOperation2 adapter实现
	 */
	@Override
	public void sampleOperation2() {
		// TODO Auto-generated method stub

	}

}
