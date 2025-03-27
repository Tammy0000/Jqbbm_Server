package com.jq.jqbbm_server.Server;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Tammy
 * @date 2025/3/27 上午10:20
 */
@Target(ElementType.METHOD)  // 可以用于方法
@Retention(RetentionPolicy.RUNTIME)  // 保留到运行时
public @interface RoundDecimal {
    int scale() default 2;
}
