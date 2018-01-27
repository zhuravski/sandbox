package com.sandbox.utils;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebScraperTest {
    @BeforeMethod
    public void setUp() throws Exception {

    }

    @Test
    public void testGetUrl() {
        WebScraper webScraper = new WebScraper();
        String urlCode = "";

        try {
            urlCode = webScraper.getUrl("http://www.google.com");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        Assert.assertNotEquals(urlCode, "");
    }
}