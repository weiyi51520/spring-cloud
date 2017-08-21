package weiyi.demo.builder.contract;

import java.util.Date;
/**
 * �ͻ�����
 * @author weiyi
 */
public class Client {
	
	public static void main(String[] args) {
		//��������������
		String contractId= "9527";
		long beginDate = 123L;
		long endDate = 245L;
		InsuranceContract.ConcreteBuilder builder = 
				new InsuranceContract.ConcreteBuilder(contractId, beginDate, endDate);
		//������Ҫ������,Ȼ�󹹽����պ�ͬ����
		InsuranceContract contract = builder.setPersonName("С��").setOtherData("test").build();
		//�������պ�ͬ����ķ���
		contract.someOperation();
	}
}
