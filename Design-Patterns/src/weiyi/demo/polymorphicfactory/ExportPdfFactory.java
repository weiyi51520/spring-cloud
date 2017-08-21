package weiyi.demo.polymorphicfactory;

import weiyi.demo.polymorphicfactory.exportfile.ExportFile;
import weiyi.demo.polymorphicfactory.exportfile.ExportFinancialPdfFile;
import weiyi.demo.polymorphicfactory.exportfile.ExportStandardPdfFile;
/**
 * pdf���幤����ɫ
 * @author Administrator
 *
 */
public class ExportPdfFactory implements ExportFactory {

	@Override
	public ExportFile factory(String type) {
		// TODO Auto-generated method stub
		if("standard".equals(type)){
			return new ExportStandardPdfFile();
		}else if("financial".equals(type)){
			return new ExportFinancialPdfFile();
		}else {
			throw new RuntimeException();
		}
	}

}
