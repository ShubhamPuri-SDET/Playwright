package Testcases;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Testcase1 {

    public static void main(String[] args) {
        // Create a Playwright instance
        Playwright pw = Playwright.create();

        // Initialize the Chromium browser type
        pw.chromium();

        // Initialize the browser type to Chromium
        BrowserType bw = pw.chromium();
        // BrowserType bw = pw.webkit();  // for webkit browser
        // BrowserType bw = pw.firefox();  // for firefox browser

        // Launch a new browser instance with headless mode set to false
        // Browser b = bw.launch();  here launching in the headless mode
        Browser b = bw.launch(new BrowserType.LaunchOptions().setHeadless(false));

        // Create a new page in the browser
        Page page = b.newPage();

        // Navigate to the specified URL
        page.navigate("https://playwright.dev/java/docs/intro");

        // Get the title of the page
        String title = page.title();

        // Print the page title to the console
        System.out.println("The page title is " + title);

        // Close the page
        page.close();

        // Close the browser
        b.close();

        // Close the Playwright instance
        pw.close();
    }
}
