package weiyi.demo.polymorphicfactory.exportfile;

public class ExportFinancialHtmlFile implements ExportFile {

	@Override
	public boolean export(String data) {
		// TODO Auto-generated method stub
		/**
		 * ҵ���߼�
		 */
		System.out.println("���������HTML�ļ�");
		return true;
	}
}
