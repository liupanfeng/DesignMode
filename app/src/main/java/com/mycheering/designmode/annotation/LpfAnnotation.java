package com.mycheering.designmode.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by lpf on 2016/11/22.
 * 元注解 元信息 元数据
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})  //作用域
public @interface LpfAnnotation {
    String color() default "blue"; //添加属性 为注解   default为添加默认值
    String value();
}
