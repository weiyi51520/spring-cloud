package weiyi.demo.polymorphicfactory.exportfile;

public class ExportStandardPdfFile implements ExportFile {

	@Override
	public boolean export(String data) {
		// TODO Auto-generated method stub
		System.out.println("������׼PDF�ļ�");
		return false;
	}

}
