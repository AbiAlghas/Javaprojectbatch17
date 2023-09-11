package Class20;

import org.openqa.selenium.edge.EdgeDriver;

public class E5Selenium {
    public static void main(String[] args) throws InterruptedException {
        /*ChromeDriver chrome=new ChromeDriver();
        chrome.manage().window().maximize();
        Thread.sleep(2000);
        chrome.navigate().to("https://google.com");
        System.out.println(chrome.getTitle());
        Thread.sleep(2000);
        chrome.navigate().to("https://facebook.com");
        System.out.println(chrome.getTitle());
        Thread.sleep(2000);
        chrome.navigate().to("https://amazon.com");
        System.out.println(chrome.getTitle());
        Thread.sleep(2000);
        chrome.navigate().back();
        chrome.close();*/

        EdgeDriver Edge=new EdgeDriver();
        Edge.manage().window().maximize();
        Thread.sleep(2000);
        Edge.navigate().to("https://google.com");
        System.out.println(Edge.getTitle());
        Thread.sleep(2000);
        Edge.navigate().to("https://facebook.com");
        System.out.println(Edge.getTitle());
        Thread.sleep(2000);
        Edge.navigate().to("https://amazon.com");
        System.out.println(Edge.getTitle());
        Thread.sleep(2000);
        Edge.navigate().back();
        Edge.close();
    }
}
