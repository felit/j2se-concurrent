package com.livedrof.j2se.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface TestAnnotation {
    public int id() default -1;

    public String msg() default "Hi";
}
