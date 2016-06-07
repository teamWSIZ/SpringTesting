package standalone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * standalone-owy tester repozytoriów.
 */
public class StandaloneStart {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("standalone-config.xml");
        ctx.close();
    }
}
