package service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;

/*
 * Simple tests using full spring context.
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:standalone-config.xml")
public class MathServiceTest {
    @Autowired
    Repo repo;
    @Autowired
    MathService service;

    @Test
    public void shouldComputeLength() {
        assertThat(repo.provide().length()).isEqualTo(12);
    }

    @Test
    public void shouldAddFiveAndFive() throws Exception {
        assertThat(service.add(5, 5)).isEqualTo(10);

    }
}
