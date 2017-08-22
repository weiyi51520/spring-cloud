package weiyi.demo.simplefactory.pc;

import weiyi.demo.simplefactory.pc.cpu.AmdCpu;
import weiyi.demo.simplefactory.pc.cpu.Cpu;
import weiyi.demo.simplefactory.pc.cpu.IntelCpu;
/**
 * CPU工厂类
 * @author Administrator
 *
 */
public class CpuFactory {
	public static Cpu createCpu(int type){
        Cpu cpu = null;
        if(type == 1){
            cpu = new IntelCpu(755);
        }else if(type == 2){
            cpu = new AmdCpu(938);
        }
        return cpu;
    }
}
