package weiyi.demo.polymorphicfactory;

import weiyi.demo.polymorphicfactory.exportfile.ExportFile;
/**
 * ��̬����ģʽ ��Ե���һ����Ʒ�ȼ��ṹ������
 * �ͻ��˴���ExportHtmlFactory ���� ����factory ������������������
 * һ��Ӧ��ϵͳ���ɶ��˿����ģ������Ĺ�������ʵ�ֵģ�
 * ����ʹ���ߣ���������������ˣ�����ȴ�������ˡ���ʱ����Ӧ����Ƶ��㹻�������ܽ�������֮�����϶ȣ�
 * �����޸Ļ�����һ���µĹ���ʱ��ʹ���߲���Ҫ�޸��κεط���
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
