package com.Google;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;

public class Tests extends WebDriverSetting{
    String findWord = "гладиолус";
    String http = String.format("https://www.google.com/search?q=%s&oq=%s&aqs=chrome..69i57.5197j0j4&sourceid=chrome&ie=UTF-8",findWord,findWord);
    @Test
    public void TestCountNews(){
        chromeDriver.get(http);
        Google googleTest = PageFactory.initElements(chromeDriver,Google.class);
        if (googleTest.news.size()>3) System.out.print("Поиск выдал больше 3 записей");
        else System.out.print("Поиск выдал меньше 3 записей");

    }
    @Test
    public void TestFindLink(){
        chromeDriver.get(http);
        Google googleTest = PageFactory.initElements(chromeDriver,Google.class);
        Assertions.assertFalse(
                googleTest.getNews().stream().anyMatch(x->x.getText().contains("Гладиолус - Википедия"))
                , "Заданной ссылки не найдено"
        );
    }
}
