package weiyi.demo.polymorphicfactory.exportfile;

public class ExportStandardHtmlFile implements ExportFile {

	@Override
	public boolean export(String data) {
		// TODO Auto-generated method stub
		System.out.println("������׼HTML�ļ�");
		return true;
	}

}
