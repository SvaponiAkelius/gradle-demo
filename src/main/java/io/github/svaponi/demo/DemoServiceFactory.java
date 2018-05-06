package io.github.svaponi.demo;

public class DemoServiceFactory {

    public static DemoService getInstance() {
        return new DemoServiceImpl();
    }
}
