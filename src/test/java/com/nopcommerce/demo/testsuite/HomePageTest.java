package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.Homepage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    Homepage homepage = new Homepage();

    @Test
    public void verifyPageNavigation(){

        String actClick = homepage.selectMenu("Computers");
        String expClick = "Computers";
        Assert.assertEquals(actClick,expClick,"Not matching");

    }
}
