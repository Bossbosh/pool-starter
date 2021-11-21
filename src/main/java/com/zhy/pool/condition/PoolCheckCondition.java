package com.zhy.pool.condition;

import org.springframework.boot.autoconfigure.condition.AllNestedConditions;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.ConfigurationCondition;

public class PoolCheckCondition extends AllNestedConditions {

    public PoolCheckCondition() {
        super(ConfigurationCondition.ConfigurationPhase.PARSE_CONFIGURATION);
    }

    @ConditionalOnProperty(prefix = "spring.datasource",name = "driverClassName")
    static class showDataSource{

    }

    @ConditionalOnProperty(prefix = "spring.datasource",name = "type",havingValue = "xxxx",matchIfMissing = true)
    static class showPool{

    }

}
