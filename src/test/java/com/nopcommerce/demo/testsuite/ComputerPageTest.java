package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerPageTest extends BaseTest {

    ComputerPage  computersPage = new ComputerPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder(){
        computersPage.clickOnComputerAndDesktop();
        computersPage.sortComputerDesktops("6");
        Assert.assertEquals(computersPage.gettingListOfProduct(), computersPage.gettingListBeforeSorting());

    }




    }



