package page;

//import constants.Discord;

import org.javacord.api.DiscordApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BasePage {

    private DiscordApi api;
    private WebDriver driver;
    //DiscordMessageSender discordMessageSender = new DiscordMessageSender();
    protected static final String SOUND = "alarm.mp3";

    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    public BasePage(DiscordApi api, WebDriver driver) {
        this.api = api;
        this.driver = driver;
    }

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean checker(By by, String company, String product, String url, boolean discordAlert) {
        boolean found = false;
        String time = new SimpleDateFormat("hh:mm:ss a").format(new Date());

        try {

            driver.findElement(by);

            System.out.println(ANSI_GREEN_BACKGROUND + ANSI_WHITE + "[" + time + "] IN STOCK! Company: " + company + ", " +
                    "Product: " + product + ", URL: " + url + ANSI_RESET);

            if (discordAlert) {
                try {
                    //discordNotifier(product, product + " is in stock crew!! Beat the scalpers to it!! " + url);
                } catch (Exception e) {
                    System.out.println(e.getStackTrace());
                }
                //discordMessageSender.sendInStockMessage(api, product + " is in stock crew!! Beat the scalpers to it!! " + url, Discord.);
            }

            found = true;
        } catch (Exception e) {
            System.out.print(ANSI_BLUE + "[" + time + " PST] ==> ");
            System.out.print(ANSI_RED + "OUT OF STOCK: ");
            System.out.print(ANSI_BLUE + "[" + product + "] :: ");
            System.out.print(ANSI_PURPLE + "(" + company + ")\n" + ANSI_RESET);
        }

        return found;
    }

    public boolean checkerByWebElementText(By by, String webElementText, String company, String product, String url, boolean discordAlert) {
        boolean found = false;
        String time = new SimpleDateFormat("hh:mm:ss a").format(new Date());

        WebElement element = driver.findElement(by);

        if (element.getText().contains(webElementText)) {
            System.out.print(ANSI_BLUE + "[" + time + " PST] ==> ");
            System.out.print(ANSI_RED + "OUT OF STOCK: ");
            System.out.print(ANSI_BLUE + "[" + product + "] :: ");
            System.out.print(ANSI_PURPLE + "(" + company + ")\n" + ANSI_RESET);
        } else {
            System.out.println(ANSI_GREEN_BACKGROUND + ANSI_WHITE + "[" + time + "] LISTED IN SITE! Company: " + company + ", " +
                    "Product: " + product + ", URL: " + url + ANSI_RESET);
            if (discordAlert) {
                try {
                    //discordNotifier(product, product + " is now appearing in the site crew!! Beat the scalpers to it!! " + url);
                } catch (Exception e) {
                    System.out.println(e.getStackTrace());
                }
                //discordMessageSender.sendInStockMessage(api, product + " is in stock crew!! Beat the scalpers to it!! " + url, Discord.);
            }

            found = true;
        }

        return found;
    }

    public boolean checkerForMultiples(By by, String company, String product, String url, boolean discordAlert) {
        boolean found = false;
        String time = new SimpleDateFormat("hh:mm:ss a").format(new Date());

        try {
            driver.findElement(by);
            System.out.println(ANSI_GREEN_BACKGROUND + ANSI_WHITE + "[" + time + "] IN STOCK! Company: " + company + ", " +
                    "Product: " + product + ", URL: " + url + ANSI_RESET);
            if (discordAlert) {
                //discordNotifier(product, product + " is in stock crew!! Beat the scalpers to it!! " + url);
            }
            found = true;
        } catch (Exception e) {
        }

        return found;
    }

    public boolean checkerForDisabledElement(By by, String company, String product, String url, boolean discordAlert) {
        boolean found = false;
        String time = new SimpleDateFormat("hh:mm:ss a").format(new Date());

        WebElement element = driver.findElement(by);
        if (element.getAttribute("disabled") == null) {
            System.out.println(ANSI_GREEN_BACKGROUND + ANSI_WHITE + "[" + time + "] IN STOCK! Company: " + company + ", " +
                    "Product: " + product + ", URL: " + url + ANSI_RESET);

            if (discordAlert) {
                try {
                    //discordNotifier(product, product + " is in stock crew!! Beat the scalpers to it!! " + url);
                } catch (Exception e) {
                    System.out.println(e.getStackTrace());
                }
                //discordMessageSender.sendInStockMessage(api, product + " is in stock crew!! Beat the scalpers to it!! " + url, Discord.);
            }

            found = true;
        } else {
            System.out.print(ANSI_BLUE + "[" + time + " PST] ==> ");
            System.out.print(ANSI_RED + "OUT OF STOCK: ");
            System.out.print(ANSI_BLUE + "[" + product + "] :: ");
            System.out.print(ANSI_PURPLE + "(" + company + ")\n" + ANSI_RESET);
        }

        return found;
    }

    public boolean reverseChecker(By by, String company, String product, String url, boolean discordAlert) {
        boolean found = false;
        String time = new SimpleDateFormat("hh:mm:ss a").format(new Date());

        try {
            driver.findElement(by);
            System.out.print(ANSI_BLUE + "[" + time + " PST] ==> ");
            System.out.print(ANSI_RED + "OUT OF STOCK: ");
            System.out.print(ANSI_BLUE + "[" + product + "] :: ");
            System.out.print(ANSI_PURPLE + "(" + company + ")\n" + ANSI_RESET);
        } catch (Exception e) {
            found = true;
            System.out.println(ANSI_GREEN_BACKGROUND + ANSI_WHITE + "[" + time + "] IN STOCK! Company: " + company + ", " +
                    "Product: " + product + ", URL: " + url + ANSI_RESET);
            if (discordAlert) {
                //discordNotifier(product, product + " is in stock crew!! Beat the scalpers to it!! " + url);
                //discordMessageSender.sendInStockMessage(api, product + " is in stock crew!! Beat the scalpers to it!! " + url, Discord.);
            }
        }

        return found;
    }

    public boolean reverseCheckerForSonyDirect(By by, String company, String product, String url, boolean discordProductAlert,
                                               boolean discordQueueAlert) {
        boolean found = false;
        String time = new SimpleDateFormat("hh:mm:ss a").format(new Date());

        try {
            driver.findElement(by);
            System.out.print(ANSI_BLUE + "[" + time + " PST] ==> ");
            System.out.print(ANSI_RED + "OUT OF STOCK: ");
            System.out.print(ANSI_BLUE + "[" + product + "] :: ");
            System.out.print(ANSI_PURPLE + "(" + company + ")\n" + ANSI_RESET);

            found = true;
        } catch (Exception e) {
            if (driver.getTitle().contains("Maintenance Page")) {
                found = false;
            } else if (driver.getTitle().contains("Queue-it")) {
                System.out.println(ANSI_GREEN_BACKGROUND + ANSI_WHITE + "[" + time + "] QUEUE OPENED! Company: " + company + ", " +
                        "Product: " + product + ", URL: " + url + ANSI_RESET);
                if (discordQueueAlert) {
                    //discordMessageSender.sendQueueMessage(api, " The queue is open crew!! Beat the scalpers to it!! " + url);
                }
            } else {
                System.out.println(ANSI_GREEN_BACKGROUND + ANSI_WHITE + "[" + time + "] In Stock! Company: " + company + ", " +
                        "Product: " + product + ", URL: " + url + ANSI_RESET);
                if (discordProductAlert) {
                    //discordNotifier(product, product + " is in stock crew!! Beat the scalpers to it!! " + url);
                    //discordMessageSender.sendInStockMessage(api, product + " is in stock crew!! Beat the scalpers to it!! " + url, Discord.);
                }
            }
        }

        return found;
    }
/*
    public void discordNotifier(String product, String message) {
        switch (product) {
            case Products.PS5_DIGITAL: {
                discordMessageSender.sendInStockMessage(api, message, Discord.STOCK_ALERTS_PS5_DIGITAL_CHANNEL_ID);
                break;
            }
            case Products.PS5_DISC: {
                discordMessageSender.sendInStockMessage(api, message, Discord.STOCK_ALERTS_PS5_DISC_CHANNEL_ID);
                break;
            }
            case Products.XBOX_SERIES_X: {
                discordMessageSender.sendInStockMessage(api, message, Discord.STOCK_ALERTS_XBOX_DISC_CHANNEL_ID);
                break;
            }
            case Products.XBOX_SERIES_S: {
                discordMessageSender.sendInStockMessage(api, message, Discord.STOCK_ALERTS_XBOX_DIGITAL_CHANNEL_ID);
                break;
            }
            case Products.PS5_DISC_BUNDLE: {
                discordMessageSender.sendInStockMessage(api, message, Discord.STOCK_ALERTS_PS5_DISC_CHANNEL_ID);
                break;
            }
            case Products.PS5_DIGITAL_BUNDLE: {
                discordMessageSender.sendInStockMessage(api, message, Discord.STOCK_ALERTS_PS5_DIGITAL_CHANNEL_ID);
                break;
            }
            case Products.XBOX_SERIES_X_BUNDLE: {
                discordMessageSender.sendInStockMessage(api, message, Discord.STOCK_ALERTS_XBOX_DISC_CHANNEL_ID);
                break;
            }
            case Products.XBOX_SERIES_S_BUNDLE: {
                discordMessageSender.sendInStockMessage(api, message, Discord.STOCK_ALERTS_XBOX_DIGITAL_CHANNEL_ID);
                break;
            }
        }
    }
*/
}

