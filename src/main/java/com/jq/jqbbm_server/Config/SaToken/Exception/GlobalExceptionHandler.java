package com.jq.jqbbm_server.Config.SaToken.Exception;

import cn.dev33.satoken.util.SaResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Tammy
 * @date 2025/3/27 下午2:36
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    // 全局异常拦截
    @ExceptionHandler
    public SaResult handlerException(Exception e) {
        String message = e.getMessage();
        var msg = "未知错误,请反馈给管理员!";
        if (message.startsWith("No static resource")) {
            msg = "未找到静态资源,请检查静态资源路径!";
            return SaResult.error().setCode(404).setMsg(msg);
        }
        if (message.startsWith("未能读取到有效 token")) {
            msg = "Token验证失败,请检查Token是否正确!";
            return SaResult.error().setCode(403).setMsg(msg);
        }
        log.error("请留意错误信息:{}", message);
        return SaResult.error().setMsg(msg + "by:Tammy");
    }
}
