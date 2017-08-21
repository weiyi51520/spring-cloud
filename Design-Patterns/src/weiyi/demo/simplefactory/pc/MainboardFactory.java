package weiyi.demo.simplefactory.pc;

import weiyi.demo.simplefactory.pc.mainboard.AmdMainboard;
import weiyi.demo.simplefactory.pc.mainboard.IntelMainboard;
import weiyi.demo.simplefactory.pc.mainboard.Mainboard;
/**
 * 主板工厂类
 * @author Administrator
 *
 */
public class MainboardFactory {
	public static Mainboard createMainboard(int type){
        Mainboard mainboard = null;
        if(type == 1){
            mainboard = new IntelMainboard(755);
        }else if(type == 2){
            mainboard = new AmdMainboard(938);
        }
        return mainboard;
    }
}
