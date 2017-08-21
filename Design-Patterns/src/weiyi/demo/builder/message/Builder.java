package weiyi.demo.builder.message;

import java.util.Date;

public abstract class Builder {
	protected AutoMessage msg;
    //��������Ľ��췽��
	 public abstract void buildSubject();
	    //��������Ľ��췽��
	 public abstract void buildBody();
	    //�ռ�������Ľ��췽��
	 public void buildTo(String to){
	        msg.setTo(to);
	    }
	    //����������Ľ��췽��
	 public void buildFrom(String from){
	        msg.setFrom(from);
	    }
	    //����ʱ������Ľ��췽��
	 public void buildSendDate(){
	        msg.setSendDate(new Date());
	    }
	    /**
	     * �ʼ���Ʒ��ɺ��ô˷��������ʼ�
	     * �˷����൱�ڲ�Ʒ��������
	     */
	    public void sendMessage(){
	        msg.send();
	    }
}
