package weiyi.demo.polymorphicfactory;

import weiyi.demo.polymorphicfactory.exportfile.ExportFile;
import weiyi.demo.polymorphicfactory.exportfile.ExportStandardHtmlFile;
import weiyi.demo.polymorphicfactory.exportfile.ExportStandardPdfFile;

/**
 * html���幤����ɫ,ʵ�־���ҵ���߼�
 * @author Administrator
 *
 */
public class ExportHtmlFactory implements ExportFactory {

	@Override
	public ExportFile factory(String type) {
		// TODO Auto-generated method stub
		if("standard".equals(type)){
			return new ExportStandardHtmlFile();
		}else if("financial".equals(type)){
			return new ExportStandardPdfFile();
		}else {
			throw new RuntimeException("û���ҵ�����");
		}
	}

}
