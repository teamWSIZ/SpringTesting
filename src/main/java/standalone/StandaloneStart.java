package standalone;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.MathService;

/**
 * standalone-owy tester repozytoriów.
 */
public class StandaloneStart {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("standalone-config.xml");
        MathService mathService = ctx.getBean(MathService.class);
        System.out.println(mathService.getEleven());
        ctx.close();
    }
}
