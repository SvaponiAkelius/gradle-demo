package io.github.svaponi.demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DemoServiceTest {

    private DemoService service;

    @Before
    public void init() {
        service = DemoServiceFactory.getInstance();
        Assert.assertNotNull("DemoService is null", service);
    }

    @Test
    public void test_getName() {
        Assert.assertEquals("DemoService.getName() failed", "DEMO", service.getName());
    }
}
