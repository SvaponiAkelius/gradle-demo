package io.github.svaponi.demo;

public class DemoServiceImpl implements DemoService {

    private final String name;

    public DemoServiceImpl() {
        String tmp = System.getProperty("name");
        name = tmp == null || tmp.trim().isEmpty() ? "DEMO" : tmp;
    }

    @Override
    public String getName() {
        return name;
    }
}
