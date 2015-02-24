package com.mangofactory.documentation.swagger2.annotations;

import com.mangofactory.documentation.swagger2.configuration.Swagger2DocumentationConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Indicates that Swagger support should be enabled.
 *
 * This should be applied to a Spring java config and should have an accompanying '@Configuration' annotation.
 *
 * Loads all required beans defined in @see SpringSwaggerConfig
 *
 * @see com.mangofactory.documentation.spring.web.plugins.DocumentationConfigurer
 */
@Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
@Target(value = {java.lang.annotation.ElementType.TYPE})
@Documented
@Import(Swagger2DocumentationConfiguration.class)
public @interface EnableSwagger2 {
}
