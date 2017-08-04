package com.weiyi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by weiyi on 2017/8/3/003.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Girl {
    @Id
    @GeneratedValue
    private Integer id;
    @NotNull(message = "罩杯不能为空")
    private String cupSize;

    @Min(value = 18,message = "未成年少女禁止入内")
    private Integer age;

    public Girl(String cupSize, Integer age) {
        this.cupSize = cupSize;
        this.age = age;
    }

}
