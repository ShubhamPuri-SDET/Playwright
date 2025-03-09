package Testcases;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Testcase1 {

    public static void main(String[] args) {
        Playwright pw = Playwright.create();
        pw.chromium();
        // BrowserType bw = pw.webkit();
        BrowserType bw = pw.chromium();
        // Browser b = bw.launch();
        Browser b = bw.launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = b.newPage();

        page.navigate("https://playwright.dev/java/docs/intro");

        String title = page.title();

        System.out.println("The page title is " + title);

        page.close();
        b.close();
        pw.close();

    }

}
