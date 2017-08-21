package weiyi.demo.builder.contract;

public class InsuranceContract {
	//���պ�ͬ���
	private String contractId;
	/**
	 * ��������Ա�����ƣ�ͬһ�ݱ��պ�ͬ��Ҫô����Աǩ����Ҫô����˾ǩ��
	 * Ҳ����˵������������Ա���͡������չ�˾�����������ԣ�������ͬʱ��ֵ
	 */
	private String personName;
	//�������˹�˾������
	private String companyName;
	//���տ�ʼ��Ч����
	private long beginDate;
	//����ʧЧ���ڣ�һ������ڱ��տ�ʼ��Ч����
	private long endDate;
	//��������
	private String otherData;
	//˽�й��췽��
	private InsuranceContract(ConcreteBuilder builder){
		this.contractId = builder.contractId;
        this.personName = builder.personName;
        this.companyName = builder.companyName;
        this.beginDate = builder.beginDate;
        this.endDate = builder.endDate;
        this.otherData = builder.otherData;
		
	}
	/**
	 * ���պ�ͬ��һЩ����
	 */
	public void someOperation(){
		System.out.println("��ǰ���ڲ����ı��պ�ͬ���Ϊ��"+this.contractId+"��");
	}
	public static class ConcreteBuilder{
		private String contractId;
		private String personName;
		private String companyName;
		private long beginDate;
		private long endDate;
		private String otherData;
		/**
		 * ���췽��
		 * @param contractId ���պ�ͬ���
		 * @param beginDate ��Чʱ��
		 * @param endDate ʧЧ����
		 */
		public ConcreteBuilder(String contractId,long beginDate,long endDate){
			this.contractId=contractId;
			this.beginDate = beginDate;
			this.endDate = endDate;
		}
		//��������Ա������
		public ConcreteBuilder setPersonName(String personName){
			this.personName= personName;
			return this;
		}
		//�����չ�˾������
		public ConcreteBuilder setCompanyName(String companyName){
			this.companyName= companyName;
			return this;
		}
		//��������
		public ConcreteBuilder setOtherData(String otherData){
			this.otherData= otherData;
			return this;
		}
		/**
		 * ���������Ķ��������
		 * @return �����ı��պ�ͬ����
		 */
		public InsuranceContract build(){
			if(contractId == null || contractId.trim().length()==0){
				throw new IllegalArgumentException("��ͬ��Ų���Ϊ��");
			}
			boolean signPerson = (personName!=null && personName.trim().length()>0);
			boolean signCompany = (companyName!=null && companyName.trim().length()>0);
			if(signPerson&&signCompany){
				throw new IllegalArgumentException("һ�ݱ��պ�ͬ����ͬʱ����˺͹�˾ǩ��");
			}
			if(signPerson==false&&signCompany==false){
				throw new IllegalArgumentException("һ�ݱ��պ�ͬ���ܲ���û��ǩ������");
			}
			if(beginDate<=0){
				throw new IllegalArgumentException("һ�ݱ��պ�ͬ��������Ч����");
			}
			if(endDate<=0){
				throw new IllegalArgumentException("һ�ݱ��պ�ͬ������ʧЧ����");
			}
			if(endDate<beginDate){
				throw new IllegalArgumentException("һ�ݱ��պ�ͬ��ʧЧ���ڱ��������Ч����");
			}
			return new InsuranceContract(this);
		}
	}
}

