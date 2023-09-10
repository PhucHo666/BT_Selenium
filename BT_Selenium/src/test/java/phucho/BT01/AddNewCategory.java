package phucho.BT01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import phucho.common.BaseTest;
import phucho.locators.LocatorsCMS;

public class AddNewCategory extends BaseTest {
    @Test
    public void testAddNewCategory(){

        String name = "PPP2";
        driver.get("http://cms.anhtester.com/login");
        loginCMS();

        driver.findElement(By.xpath(LocatorsCMS.menuProducts)).click();
        sleep(1);
        driver.findElement(By.xpath(LocatorsCMS.menuCategoryInProduct)).click();
        sleep(1);
        Assert.assertTrue(driver.findElement(By.xpath(LocatorsCMS.headerAllCategories)).isDisplayed(),"Not All Categories Page");
        driver.findElement(By.xpath(LocatorsCMS.buttonAddNewCategory)).click();
        sleep(1);
        Assert.assertTrue(driver.findElement(By.xpath(LocatorsCMS.headerCatagoryInfomation)).isDisplayed(),"Not Add New Category table");
        sleep(1);
        driver.findElement(By.xpath(LocatorsCMS.inputNameCategory)).sendKeys(name);

        Select select1 = new Select(driver.findElement(By.xpath(LocatorsCMS.dropdownParentCategory)));
        select1.selectByVisibleText("---- ĐỒNG HỒ");

        driver.findElement(By.xpath(LocatorsCMS.inputOrderNumberCategory)).sendKeys(name);

        Select select2 = new Select(driver.findElement(By.xpath(LocatorsCMS.dropdownTypeCategory)));
        select2.selectByVisibleText("Digital");

        driver.findElement(By.xpath(LocatorsCMS.inputBannerImageCategory)).click();
        sleep(1);
        driver.findElement(By.xpath(LocatorsCMS.inputSearchBannerImageAddNewCategory)).sendKeys("cosy");
        sleep(1);
        driver.findElement(By.xpath(LocatorsCMS.firstItemBannerImageAfterSearch)).click();
        driver.findElement(By.xpath(LocatorsCMS.buttonAddFilesImageCategory)).click();
        sleep(1);

        driver.findElement(By.xpath(LocatorsCMS.inputIconImageCategory)).click();
        sleep(1);
        driver.findElement(By.xpath(LocatorsCMS.inputSearchIconImageAddNewCategory)).sendKeys("cosy");
        sleep(1);
        driver.findElement(By.xpath(LocatorsCMS.firstItemIconImageAfterSearch)).click();
        driver.findElement(By.xpath(LocatorsCMS.buttonAddFilesImageCategory)).click();
        driver.findElement(By.xpath(LocatorsCMS.inputMetaTitleCategory)).sendKeys("Category " + name);
        driver.findElement(By.xpath(LocatorsCMS.inputMataDescriptionCategory)).sendKeys(name + " Discription");
        sleep(1);
//        Select select3 = new Select(driver.findElement(By.xpath(LocatorsCMS.dropdownFilterAttributesCategory)));
//        select3.selectByVisibleText("Size");
        driver.findElement(By.xpath(LocatorsCMS.dropdownFilterAttributesCategory)).click();
        driver.findElement(By.xpath(LocatorsCMS.inputSearchAttributes)).sendKeys("size");
        driver.findElement(By.xpath(LocatorsCMS.inputSearchAttributes)).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath(LocatorsCMS.inputSearchAttributes)).sendKeys(Keys.ESCAPE);
        sleep(1);
        driver.findElement(By.xpath(LocatorsCMS.buttonSaveCategory)).click();
        Assert.assertTrue(driver.findElement(By.xpath(LocatorsCMS.headerAllCategories)).isDisplayed(),"Not All Categories Page");
        sleep(1);
        driver.findElement(By.xpath(LocatorsCMS.inputSearchCategory)).sendKeys(name);
        sleep(1);
        driver.findElement(By.xpath(LocatorsCMS.inputSearchCategory)).sendKeys(Keys.ENTER);
        sleep(1);
        driver.findElement(By.xpath(LocatorsCMS.buttonEditCategory)).click();
        Assert.assertEquals(driver.findElement(By.xpath(LocatorsCMS.inputNameCategory)).getAttribute("value"),name,"Category Name is not matched !!!");


    }
}
