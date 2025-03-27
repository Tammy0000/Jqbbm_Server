package com.jq.jqbbm_server.Server;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author Tammy
 * @date 2025/3/27 上午10:21
 */
@Aspect
@Component
public class DecimalRoundingAspect {
    @Pointcut("@annotation(RoundDecimal)")  // 匹配带有 @RoundDecimal 注解的方法
    public void roundDecimalMethods() {}

    @AfterReturning(returning = "result", pointcut = "roundDecimalMethods()")
    public Object roundDecimal(Object result) {
        // 如果返回值是 BigDecimal 类型
        if (result instanceof BigDecimal decimalResult) {
            // 保留两位小数
            return decimalResult.setScale(2, RoundingMode.HALF_UP);
        }
        return result;
    }
}
