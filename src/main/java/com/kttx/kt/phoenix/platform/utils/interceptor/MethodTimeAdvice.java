package com.kttx.kt.phoenix.platform.utils.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.StopWatch;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/***
 *
 *          ┌─┐       ┌─┐
 *       ┌──┘ ┴───────┘ ┴──┐
 *       │                 │
 *       │       ───       │
 *       │  ─┬┘       └┬─  │
 *       │                 │
 *       │       ─┴─       │
 *       │                 │
 *       └───┐         ┌───┘
 *           │         │
 *           │         │
 *           │         │
 *           │         └──────────────┐
 *           │                        │
 *           │                        ├─┐
 *           │                        ┌─┘
 *           │                        │
 *           └─┐  ┐  ┌───────┬──┐  ┌──┘
 *             │ ─┤ ─┤       │ ─┤ ─┤
 *             └──┴──┘       └──┴──┘
 *               神兽保佑  代码无BUG!
 *
 *
 * @author : wangjia
 * @date 2019-05-30 17:29
 * 文件描述:
 *
 */
@Aspect
@Component
public class MethodTimeAdvice implements MethodInterceptor {

    /**
     * 日志 <br>
     */
    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Logger logger = LoggerFactory.getLogger(invocation.getThis().getClass());

        // 用 commons-lang 提供的 StopWatch 计时
        StopWatch clock = null;
        if (logger.isDebugEnabled()) {
            clock = new StopWatch();
            clock.start(); // 计时开始
        }

        Object result = invocation.proceed();
        if (!logger.isDebugEnabled()) {
            return result;
        }

        clock.stop(); // 计时结束

        // 方法参数类型，转换成简单类型
        Class[] params = invocation.getMethod().getParameterTypes();
        String[] simpleParams = new String[params.length];
        for (int i = 0; i < params.length; i++) {
            simpleParams[i] = params[i].getSimpleName();
        }
        Object[] args = invocation.getArguments();

        logger.error("Takes:" + clock.getTime() + " ms ["
            + invocation.getThis().getClass().getName() + "."
            + invocation.getMethod().getName() + "("
            + StringUtils.join(simpleParams, ",") + ")("
            + StringUtils.join(args, ",") + ")] ");
        return result;
    }
}
