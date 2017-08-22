package weiyi.demo.builder.contract;

import java.util.Date;
/**
 * 客户端类
 * 本例中将具体建造者合并到了对象中,并将产品对象的构造函数私有化，防止客户端不使用建造器来构建产品对象。
 * @author weiyi
 */
public class Client {
	
	public static void main(String[] args) {
		//创建构建器对象
		String contractId= "9527";
		long beginDate = 123L;
		long endDate = 245L;
		InsuranceContract.ConcreteBuilder builder = 
				new InsuranceContract.ConcreteBuilder(contractId, beginDate, endDate);
		//设置需要的数据,然后构建保险合同对象
		InsuranceContract contract = builder.setPersonName("小明").setOtherData("test").build();
		//操作保险合同对象的方法
		contract.someOperation();
	}
}
