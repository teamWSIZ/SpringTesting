package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component
public class MathService {
    int add(int a, int b) {
        return a + b;
    }
    int sub(int a, int b) {
        return a - b;
    }

    public int getEleven() {
        return eleven.getX();
    }

    @Resource(name = "eleven")
    Liczba eleven;
}
