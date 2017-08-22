package weiyi.demo.builder.message;

public class WelcomeBuilder extends Builder {
	
	public WelcomeBuilder() {
		// TODO Auto-generated constructor stub
		msg = new WelcomeMessage();
	}
	
	@Override
	public void buildSubject() {
		// TODO Auto-generated method stub
		msg.setBody("欢迎内容");
	}

	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		msg.setSubject("欢迎标题");
	}

}
