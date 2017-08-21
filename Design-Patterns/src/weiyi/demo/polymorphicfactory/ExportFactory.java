package weiyi.demo.polymorphicfactory;

import weiyi.demo.polymorphicfactory.exportfile.ExportFile;

/**
 * 抽象工厂角色ExportFactory
 * 多态工厂模式的核心
 * @author Administrator
 */
public interface ExportFactory {
	/**
	 * 声明一个工厂方法,具体工厂角色去根据type实现具体业务
	 * @param type
	 * @return
	 */
	public ExportFile factory(String type);
}
