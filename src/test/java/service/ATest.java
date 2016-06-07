package service;

import org.junit.Before;
import org.junit.Test;
import service.A;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by mareckip on 07.06.16.
 */
public class ATest {
    A testee;


    @Before
    public void setUp() {
        testee = new A();
    }

    @Test
    public void shouldAddZero() {
        assertThat(testee.aPlusB(1, 0)).isEqualTo(1);
    }

    @Test
    public void shouldAddWell() {
        assertThat(testee.aPlusB(1, 5)).isEqualTo(6);
    }
}
