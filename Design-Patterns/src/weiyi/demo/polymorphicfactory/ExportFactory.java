package weiyi.demo.polymorphicfactory;

import weiyi.demo.polymorphicfactory.exportfile.ExportFile;

/**
 * ���󹤳���ɫExportFactory
 * ��̬����ģʽ�ĺ���
 * @author Administrator
 */
public interface ExportFactory {
	/**
	 * ����һ����������,���幤����ɫȥ����typeʵ�־���ҵ��
	 * @param type
	 * @return
	 */
	public ExportFile factory(String type);
}
