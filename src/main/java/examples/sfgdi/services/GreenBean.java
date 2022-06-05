package examples.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class GreenBean implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware {

    public GreenBean() {
        System.out.println("1. New green bean is being constructed\t\t\t\t0%");
    }

    @Override
    public void setBeanName(String name) {
        System.out.printf("2. Green bean name has been set to '%s'\t\t25%%\n", name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("3. A green bean factory has been created\t\t\t50%");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("4. The green bean application context has been set\t75%");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("5. The green bean has finished being constructed!\t100%");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("6. Green bean properties have been set!");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("7. Mayday! Mayday! Green bean is being eaten!");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("8. Green bean has been eaten...");
    }
}
