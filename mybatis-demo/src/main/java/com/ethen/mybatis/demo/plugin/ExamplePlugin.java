package com.ethen.mybatis.demo.plugin;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.util.Properties;

/**
 * mysql插件demo
 *
 * @author ethenyang@126.com
 * @since 2022/11/06
 */
@Intercepts({@Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class})})
public class ExamplePlugin implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.err.println("###ExamplePlugin.intercept() 执行中...");
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        System.err.println("###ExamplePlugin.plugin 执行中...");
        return Plugin.wrap(target,this);
    }

    @Override
    public void setProperties(Properties properties) {
        System.err.println("###ExamplePlugin.setProperties 执行中...");
    }
}
