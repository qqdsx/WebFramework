package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//Transaction注解上使用了@Target(ElementType.METHOD)，说明该注解只能使用在方法级别，也就是说，我们需要将该注解使用在
//每个具有事务性的方法上
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Transaction {
}
