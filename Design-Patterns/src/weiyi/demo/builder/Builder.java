package weiyi.demo.builder;
/**
 * ����������Builder
 * һ����˵��Ʒ��������������뽨�췽������Ŀ���
 * @author weiyi
 */
public interface Builder {
	
	public void buildPart1();
	
	public void buildPart2();
	
	public Product retrieveResult();
}
