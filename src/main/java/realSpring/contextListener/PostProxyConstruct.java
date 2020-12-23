package realSpring.contextListener;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import realSpring.qualifierExample.Config;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@EventListener(ContextRefreshedEvent.class)
public @interface PostProxyConstruct {
}
