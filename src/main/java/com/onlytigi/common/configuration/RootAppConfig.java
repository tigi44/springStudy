package com.onlytigi.common.configuration;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Service;

/**
 * root-context.xml 대체 
 * @author onlytigi
 */
@Configuration
@Import({PropertiesConfig.class, DataSourceConfig.class, SecurityConfig.class})
@ComponentScan(
basePackages = {"com.onlytigi.common.security"}, 
includeFilters = @Filter(type = FilterType.ANNOTATION, value = {Service.class}))

public class RootAppConfig implements InitializingBean {    
    @Override
    public void afterPropertiesSet() throws Exception {

    }

}
