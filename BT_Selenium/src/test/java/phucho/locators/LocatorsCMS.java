package phucho.locators;

public class LocatorsCMS {
    public static String inputEmailLogin = "//input[@id='email']";
    public static String inputPasswordLogin = "//input[@id='password']";
    public static String buttonLogin = "//button[@type='submit']";
    public static String menuProducts = "//span[normalize-space()='Products']";
    public static String menuCategoryInProduct = "//span[normalize-space()='Category']";
    public static String buttonAddNewCategory = "//span[normalize-space()='Add New category']";
    public static String headerCatagoryInfomation = "//div[@class='card-header']//h5";
    public static String inputNameCategory = "//input[@id='name']";
    public static String dropdownParentCategory = "//select[@name='parent_id']";
    public static String inputOrderNumberCategory = "//input[@id='order_level']";
    public static String dropdownTypeCategory = "//select[@name='digital']";
    public static String inputBannerImageCategory = "(//div[contains(text(),'Choose File')])[1]";
    public static String inputIconImageCategory = "(//div[contains(text(),'Choose File')])[1]";
    public static String inputMetaTitleCategory = "//input[@placeholder='Meta Title']";
    public static String inputMataDescriptionCategory = "//textarea[@name='meta_description']";
    public static String dropdownFilterAttributesCategory = "//button[@title='Nothing selected']";
    public static String buttonSaveCategory = "//button[@type='submit']";
    public static String inputSearchBannerImageAddNewCategory = "//input[@placeholder='Search your files']";
    public static String firstItemBannerImageAfterSearch = "(//div[@class='card-body'])[2]";
    public static String inputSearchIconImageAddNewCategory = "//input[@placeholder='Search your files']";
    public static String firstItemIconImageAfterSearch = "(//div[@class='card-body'])[2]";
    public static String buttonAddFilesImageCategory = "//button[normalize-space()='Add Files']";
    public static String headerAllCategories = "(//h1[normalize-space()='All categories'])[1]";
    public static String inputSearchCategory = "//input[@id='search']";
    public static String buttonEditCategory = "//a[@title='Edit']";
    public static String inputSearchAttributes = "//div[@class='dropdown-menu show']//input[@aria-label='Search']";



}
