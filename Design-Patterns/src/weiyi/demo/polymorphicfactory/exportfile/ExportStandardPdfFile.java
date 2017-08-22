package weiyi.demo.polymorphicfactory.exportfile;

public class ExportStandardPdfFile implements ExportFile {

	@Override
	public boolean export(String data) {
		// TODO Auto-generated method stub
		System.out.println("导出标准PDF文件");
		return false;
	}

}
