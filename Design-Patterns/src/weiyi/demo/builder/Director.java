package weiyi.demo.builder;

public class Director {
	/**
	 * ��Ҫʹ�õĽ�����
	 */
	private Builder builder;
	/**
	 * ���뽨��������
	 * @param builder
	 */
	public Director(Builder builder) {
		// TODO Auto-generated constructor stub
		this.builder = builder;
	}
	/**
	 * ָ����Ĳ�Ʒ���췽��,���𰴲������������췽��������Ʒ
	 */
	public void construct(){
		builder.buildPart1();
		builder.buildPart2();
	}
}
