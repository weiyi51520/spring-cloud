package weiyi.demo.simplefactory.login;
/**
 * ������
 * @author Administrator
 *
 */
public class LoginManager {
	public static Login factory(String type){
		if(type.equals("password")){
			return new PasswordLogin();
		}else if(type.equals("Domain")){
			return new DomainLogin();
		}else{
			/**
			 * ������׳��Զ����쳣
			 */
			throw new RuntimeException("û���ҵ���¼����");
		}
	}
	
	
}
