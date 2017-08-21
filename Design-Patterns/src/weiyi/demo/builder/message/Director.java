package weiyi.demo.builder.message;
/**
 * ������Director��
 * ������ṩһ��construct()�������˷������ý����ߵĽ��췽����
 * ����buildTo()��buildFrom()��buildSubject()��buildBody()��buildSendDate()�ȣ�
 * �Ӷ�һ����һ���ֵؽ������Ʒ���󣬼�AutoMessage����
 * @author weiyi
 *
 */
public class Director {
	Builder builder;
	/**
	 * ������
	 */
	public Director(Builder builder) {
		// TODO Auto-generated constructor stub
		this.builder = builder;
	}
	/**
     * ��Ʒ���췽����������ø�����Ľ��췽��
     */
    public void construct(String toAddress , String fromAddress){
        this.builder.buildTo(toAddress);
        this.builder.buildFrom(fromAddress);
        this.builder.buildSubject();
        this.builder.buildBody();
        this.builder.buildSendDate();
        this.builder.sendMessage();
    }
}
