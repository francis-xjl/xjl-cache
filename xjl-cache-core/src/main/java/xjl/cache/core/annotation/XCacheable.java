package xjl.cache.core.annotation;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;
import java.util.concurrent.TimeUnit;

/**
 * Created on 2021/06/25.
 *
 * @author <a href="mailto:francis.xjl@qq.com">francis</a>
 * @since 1.0.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Cacheable
public @interface XCacheable {

    @AliasFor(value = "value", annotation = Cacheable.class)
    String[] value() default {};

    @AliasFor(value = "cacheNames", annotation = Cacheable.class)
    String[] cacheNames() default {};

    @AliasFor(value = "key", annotation = Cacheable.class)
    String key() default "";

    @AliasFor(value = "keyGenerator", annotation = Cacheable.class)
    String keyGenerator() default "";

    @AliasFor(value = "cacheManager", annotation = Cacheable.class)
    String cacheManager() default "";

    @AliasFor(value = "cacheResolver", annotation = Cacheable.class)
    String cacheResolver() default "";

    @AliasFor(value = "condition", annotation = Cacheable.class)
    String condition() default "";

    @AliasFor(value = "unless", annotation = Cacheable.class)
    String unless() default "";

    @AliasFor(value = "sync", annotation = Cacheable.class)
    boolean sync() default false;

    /**
     * The expire time. Use global config if the attribute value is absent,
     * and if the global config is not defined either, use infinity instead.
     * @return the expire time
     */
    int expire() default Integer.MIN_VALUE;

    /**
     * Specify the time unit of expire.
     * @return the time unit of expire time
     */
    TimeUnit timeUnit() default TimeUnit.SECONDS;

    /**
     * Type of the Cache instance.
     * @return cache type of the method cache
     */
    CacheType cacheType() default CacheType.REMOTE;
}
