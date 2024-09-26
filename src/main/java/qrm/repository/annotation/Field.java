package qrm.repository.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public @Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@interface Field {
    boolean primaryKey() default false;
    String name();
}
