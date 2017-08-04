package com.weiyi.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by weiyi on 2017/8/3/003.
 */
@ConfigurationProperties(prefix = "girl")
@Data
@Component
public class GirlProperties {

    private String cupSize;

    private Integer age;

}
