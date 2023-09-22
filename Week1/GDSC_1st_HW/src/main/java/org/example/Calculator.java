package org.example;

public interface Calculator {
    int plus(int a, int b); // a + b 값 반환
    int minus(int a, int b); // a - b 값 반환
    int mul(int a, int b); // a * b 값 반환
    int div(int a, int b); // a / b 값 반환
}

class cal implements Calculator{

    @Override
    public int plus(int a, int b) {
        return a+b;
    }

    @Override
    public int minus(int a, int b) {
        return a-b;
    }
    @Override
    public int mul(int a, int b) {
        return a*b;
    }

    @Override
    public int div(int a, int b) {
        return a/b;
    }
}
