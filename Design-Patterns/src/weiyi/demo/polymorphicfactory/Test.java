package weiyi.demo.polymorphicfactory;

import weiyi.demo.polymorphicfactory.exportfile.ExportFile;
/**
 * 多态工厂模式 针对的是一个产品等级结构的需求
 * 客户端创建ExportHtmlFactory 对象 调用factory 方法创建出导出对象
 * 一个应用系统是由多人开发的，导出的功能是你实现的，
 * 但是使用者（调用这个方法的人）可能却是其他人。这时候你应该设计的足够灵活并尽可能降低两者之间的耦合度，
 * 当你修改或增加一个新的功能时，使用者不需要修改任何地方。
 * @author weiyi
 */
public class Test {
	
	public static void main(String[] args) {
		String data = "";
		ExportFactory exportFactory = new ExportHtmlFactory();
		ExportFile ef = exportFactory.factory("financial");
		ef.export(data);
	}
}
