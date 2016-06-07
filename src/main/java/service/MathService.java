package service;

import org.springframework.stereotype.Component;


@Component
public class MathService {
    int add(int a, int b) {
        return a + b;
    }
    int sub(int a, int b) {
        return a - b;
    }
}
