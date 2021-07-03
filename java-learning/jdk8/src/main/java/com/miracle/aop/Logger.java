package com.miracle.aop;

import java.lang.annotation.*;

@Target({ElementType.METHOD,ElementType.TYPE,ElementType.FIELD,ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Logger {
}
