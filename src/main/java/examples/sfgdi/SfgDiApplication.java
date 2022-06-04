package examples.sfgdi;

import examples.sfgdi.controllers.ConstructorInjectedController;
import examples.sfgdi.controllers.MyController;
import examples.sfgdi.controllers.PropertyInjectedController;
import examples.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);
        MyController controller = (MyController) context.getBean("myController");
        System.out.println(controller.helloWorld());

        /*Property Dependency Injection*/
        PropertyInjectedController propController = (PropertyInjectedController)
                context.getBean("propertyInjectedController");
        System.out.println(propController.greet());

        /*Setter Dependency Injection*/
        SetterInjectedController setController = (SetterInjectedController)
                context.getBean("setterInjectedController");
        System.out.println(setController.greet());

        /*Constructor Dependency Injection*/
        ConstructorInjectedController constructedController = (ConstructorInjectedController)
                context.getBean("constructorInjectedController");
        System.out.println(constructedController.greet());

        /*Primary Bean*/
        System.out.println(controller.greet());
    }

}
