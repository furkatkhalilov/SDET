package day4;

import org.openqa.selenium.By;
import utils.BaseStaticDriver;

public class _03_SelectingByTagAndAttribute extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://formsmarts.com/form/yu?mode=h5");  // this will open the website and wait until full load
        driver.findElement(By.cssSelector("label[for='u_Uj7_4589_1'")).click();
    }
}
