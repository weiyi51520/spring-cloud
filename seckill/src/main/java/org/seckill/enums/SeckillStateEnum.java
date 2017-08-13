package org.seckill.enums;

/**
 * 使用枚举表述常量数据字典
 * Created by weiyi on 2017/7/7 0007.
 */
public enum SeckillStateEnum {
    SUCCESS(1,"秒杀成功"),
    END(0,"秒杀结束"),
    REPEAT_KILL(-1,"重复秒杀"),
    INNER_ERROR(-2,"系统异常"),
    DATA_REWRITE(-3,"数据异常");
    private int state;

    private String stateInfo;

    SeckillStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public static SeckillStateEnum stateOf(int index){
        for (SeckillStateEnum stateEnum : values()) {
            if (stateEnum.getState() == index){
                return stateEnum;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "SeckillStateEnum{" +
                "state=" + state +
                ", stateInfo='" + stateInfo + '\'' +
                '}';
    }
}
