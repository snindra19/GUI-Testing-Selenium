package com.example.selenium;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class GuiTestCasesV2Test {

    private WebDriver driver;

    @BeforeAll
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
    }

    private void goToPage1Html() {
        String path = System.getProperty("user.dir") + "/../GUI Version 2/pages/page1.html";
        path = "file:///" + path.replace("\\", "/");
        driver.get(path);
    }
    private void goToPage2Html() {
        String path = System.getProperty("user.dir") + "/../GUI Version 2/pages/page2.html";
        path = "file:///" + path.replace("\\", "/");
        driver.get(path);
    }
    private void goToPage3Html() {
        String path = System.getProperty("user.dir") + "/../GUI Version 2/pages/page3.html";
        path = "file:///" + path.replace("\\", "/");
        driver.get(path);
    }
    private void goToPage4Html() {
        String path = System.getProperty("user.dir") + "/../GUI Version 2/pages/page4.html";
        path = "file:///" + path.replace("\\", "/");
        driver.get(path);
    }
    private void goToPage6Html() {
        String path = System.getProperty("user.dir") + "/../GUI Version 2/pages/page6.html";
        path = "file:///" + path.replace("\\", "/");
        driver.get(path);
    }

    // Image Test Cases
    @Test
    void testImageExists1() {
        goToPage1Html();
        WebElement image = driver.findElement(By.tagName("img"));
        assertNotNull(image);
        assertTrue(image.isDisplayed());
    }

    @Test
    void testImageLoc1() {
        goToPage1Html();
        WebElement image = driver.findElement(By.tagName("img"));
        Point location = image.getLocation();
        assertTrue(location.getX() == 135 && location.getY() == 98);
    }

    @Test
    void testImageSize1() {
        goToPage1Html();
        WebElement image = driver.findElement(By.tagName("img"));
        Dimension size = image.getSize();
        assertTrue(size.getWidth() > 0 && size.getHeight() > 0);
    }

    @Test
    void testImageContent1() {
        goToPage1Html();
        WebElement image = driver.findElement(By.tagName("img"));
        assertEquals("Quiz Banner", image.getAttribute("alt"));
    }
    @Test
    void testImageExists2() {
        goToPage2Html();
        WebElement image = driver.findElement(By.tagName("img"));
        assertNotNull(image);
        assertTrue(image.isDisplayed());
    }
    @Test
    void testImageLoc2() {
        goToPage2Html();
        WebElement image = driver.findElement(By.tagName("img"));
        Point location = image.getLocation();
        assertTrue(location.getX() == 410 && location.getY() == 87);

    }

    @Test
    void testImageSize2() {
        goToPage2Html();
        WebElement image = driver.findElement(By.tagName("img"));
        Dimension size = image.getSize();
        assertTrue(size.getWidth() > 0 && size.getHeight() > 0);
    }
    @Test void testImageContent2() {
        goToPage2Html();
        WebElement image = driver.findElement(By.tagName("img"));
        String altText = image.getAttribute("alt").toLowerCase();
        Assertions.assertTrue(altText.contains("easy"));
    }
    @Test
    void testImageExists3() {
        goToPage3Html();
        WebElement image = driver.findElement(By.tagName("img"));
        assertNotNull(image);
        assertTrue(image.isDisplayed());
    }
    @Test
    void testImageLoc3() {
        goToPage3Html();
        WebElement image = driver.findElement(By.tagName("img"));
        Point location = image.getLocation();
        assertTrue(location.getX() == 410 && location.getY() == 87);
    }

    @Test
    void testImageSize3() {
        goToPage3Html();
        WebElement image = driver.findElement(By.tagName("img"));
        Dimension size = image.getSize();
        assertTrue(size.getWidth() > 0 && size.getHeight() > 0);
    }
    @Test void testImageContent3() {
        goToPage3Html();
        WebElement image = driver.findElement(By.tagName("img"));
        String altText = image.getAttribute("alt").toLowerCase();
        Assertions.assertTrue(altText.contains("medium"));
    }
    @Test
    void testImageExists4() {
        goToPage4Html();
        WebElement image = driver.findElement(By.tagName("img"));
        assertNotNull(image);
        assertTrue(image.isDisplayed());
    }
    @Test
    void testImageLoc4() {
        goToPage4Html();
        WebElement image = driver.findElement(By.tagName("img"));
        Point location = image.getLocation();
        assertTrue(location.getX() == 418 && location.getY() == 87);
    }

    @Test
    void testImageSize4() {
        goToPage4Html();
        WebElement image = driver.findElement(By.tagName("img"));
        Dimension size = image.getSize();
        assertTrue(size.getWidth() > 0 && size.getHeight() > 0);
    }
    @Test void testImageContent4() {
        goToPage4Html();
        WebElement image = driver.findElement(By.tagName("img"));
        String altText = image.getAttribute("alt").toLowerCase();
        Assertions.assertTrue(altText.contains("hard"));
    }
    @Test
    void testImageExists6() {
        goToPage4Html();
        WebElement image = driver.findElement(By.tagName("img"));
        assertNotNull(image);
        assertTrue(image.isDisplayed());
    }
    @Test
    void testImageLoc6() {
        goToPage6Html();
        WebElement image = driver.findElement(By.tagName("img"));
        Point location = image.getLocation();
        assertTrue(location.getX() == 418 && location.getY() == 87);
    }

    @Test
    void testImageSize6() {
        goToPage6Html();
        WebElement image = driver.findElement(By.tagName("img"));
        Dimension size = image.getSize();
        assertTrue(size.getWidth() > 0 && size.getHeight() > 0);
    }
    @Test void testImageContent6() {
        goToPage6Html();
        WebElement image = driver.findElement(By.tagName("img"));
        String altText = image.getAttribute("alt").toLowerCase();
        Assertions.assertTrue(altText.contains("thanks"));
    }

    // TextBox Test Cases
    @Test
    void testTextboxExists1() {
        goToPage1Html();
        WebElement textbox = driver.findElement(By.id("username"));
        assertNotNull(textbox);
        assertTrue(textbox.isDisplayed());
    }

    @Test
    void testTextboxLoc1() {
        goToPage1Html();
        WebElement textbox = driver.findElement(By.id("username"));
        Point location = textbox.getLocation();
        assertTrue(location.getX() == 425 && location.getY() == 600);
    }

    @Test
    void testTextboxSize1() {
        goToPage1Html();
        WebElement textbox = driver.findElement(By.id("username"));
        Dimension size = textbox.getSize();
        assertTrue(size.getWidth() > 0 && size.getHeight() > 0);
    }

    @Test
    void testTextboxContent1() {
        goToPage1Html();
        WebElement textbox = driver.findElement(By.id("username"));
        assertEquals("Your name", textbox.getAttribute("placeholder"));
    }
    @Test
    void testTextboxExists2() {
        goToPage2Html();
        WebElement textbox = driver.findElement(By.id("bonus2"));
        assertNotNull(textbox);
        assertTrue(textbox.isDisplayed());
    }

    @Test
    void testTextboxLoc2() {
        goToPage2Html();
        WebElement textbox = driver.findElement(By.id("bonus2"));
        Point location = textbox.getLocation();
        assertTrue(location.getX() > 0 && location.getY() == 555);
    }

    @Test
    void testTextboxSize2() {
        goToPage2Html();
        WebElement textbox = driver.findElement(By.id("bonus2"));
        Dimension size = textbox.getSize();
        assertTrue(size.getWidth() > 0 && size.getHeight() > 0);
    }

    @Test
    void testTextboxContent2() {
        goToPage2Html();
        WebElement textbox = driver.findElement(By.id("bonus2"));
        assertEquals("", textbox.getAttribute("value"));
    }
    @Test
    void testTextboxExists3() {
        goToPage3Html();
        WebElement textbox = driver.findElement(By.id("bonus3"));
        assertNotNull(textbox);
        assertTrue(textbox.isDisplayed());
    }

    @Test
    void testTextboxLoc3() {
        goToPage3Html();
        WebElement textbox = driver.findElement(By.id("bonus3"));
        Point location = textbox.getLocation();
        assertTrue(location.getX() > 0 && location.getY() == 569);
    }

    @Test
    void testTextboxSize3() {
        goToPage3Html();
        WebElement textbox = driver.findElement(By.id("bonus3"));
        Dimension size = textbox.getSize();
        assertTrue(size.getWidth() > 0 && size.getHeight() > 0);
    }

    @Test
    void testTextboxContent3() {
        goToPage3Html();
        WebElement textbox = driver.findElement(By.id("bonus3"));
        assertEquals("", textbox.getAttribute("value"));
    }
    @Test
    void testTextboxExists4() {
        goToPage4Html();
        WebElement textbox = driver.findElement(By.id("bonus4"));
        assertNotNull(textbox);
        assertTrue(textbox.isDisplayed());
    }

    @Test
    void testTextboxLoc4() {
        goToPage4Html();
        WebElement textbox = driver.findElement(By.id("bonus4"));
        Point location = textbox.getLocation();
        assertTrue(location.getX() == 433 && location.getY() == 398);
    }

    @Test
    void testTextboxSize4() {
        goToPage4Html();
        WebElement textbox = driver.findElement(By.id("bonus4"));
        Dimension size = textbox.getSize();
        assertTrue(size.getWidth() > 0 && size.getHeight() > 0);
    }

    @Test
    void testTextboxContent4() {
        goToPage4Html();
        WebElement textbox = driver.findElement(By.id("bonus4"));
        assertEquals("", textbox.getAttribute("value"));
    }

    // Radio Button Test Cases
    @Test
    void testRadioButtonsExists1() {
        goToPage1Html();
        java.util.List<WebElement> radioButtons = driver.findElements(By.name("experience"));
        assertEquals(3, radioButtons.size());
        for (WebElement radio : radioButtons) {
            assertNotNull(radio);
            assertTrue(radio.isDisplayed());
        }
    }

    @Test
    void testRadioButtonsLocAndSize1() {
        goToPage1Html();
        for (WebElement radio : driver.findElements(By.name("experience"))) {
            Point location = radio.getLocation();
            Dimension size = radio.getSize();
            int x = location.getX();
            int y = location.getY();
            assertTrue((x == 470 || x == 458 || x == 479) && y == 693 || y == 713 || y == 733);
            assertTrue(size.getWidth() > 0 && size.getHeight() > 0);
        }
    }

    @Test
    void testRadioButtonsContent1() {
        goToPage1Html();
        String[] values = { "Beginner", "Intermediate", "Expert" };
        for (String val : values) {
            WebElement radio = driver.findElement(By.xpath("//input[@type='radio' and @value='" + val + "']"));
            assertEquals(val, radio.getAttribute("value"));
        }
    }

    @Test
    void testRadioButtonsExists2q1() {
        goToPage2Html();
        java.util.List<WebElement> radioButtons = driver.findElements(By.name("q1"));
        assertEquals(3, radioButtons.size());
        for (WebElement radio : radioButtons) {
            assertNotNull(radio);
            assertTrue(radio.isDisplayed());
        }
    }

    @Test
    void testRadioButtonsExists2q2() {
        goToPage2Html();
        java.util.List<WebElement> radioButtons = driver.findElements(By.name("q2"));
        assertEquals(3, radioButtons.size());
        for (WebElement radio : radioButtons) {
            assertNotNull(radio);
            assertTrue(radio.isDisplayed());
        }
    }

    @Test
    void testRadioButtonsLocAndSize2q1() {
        goToPage2Html();
        for (WebElement radio : driver.findElements(By.name("q1"))) {
            Point location = radio.getLocation();
            Dimension size = radio.getSize();
            int x = location.getX();
            int y = location.getY();
            assertTrue((x == 492 || x == 484 || x == 489) && y == 262 || y == 282 || y == 302);
            assertTrue(size.getWidth() > 0 && size.getHeight() > 0);
        }
    }

    @Test
    void testRadioButtonsLocAndSize2q2() {
        goToPage2Html();
        for (WebElement radio : driver.findElements(By.name("q2"))) {
            Point location = radio.getLocation();
            Dimension size = radio.getSize();
            int x = location.getX();
            int y = location.getY();
            assertTrue((x == 481 || x == 483 || x == 477) && y == 401 || y == 421 || y == 441);
            assertTrue(size.getWidth() > 0 && size.getHeight() > 0);
        }
    }

    @Test
    void testRadioButtonsContent2q1() {
        goToPage2Html();
        String[] values = { "Paris", "London", "Berlin" };
        for (String val : values) {
            WebElement radio = driver.findElement(By.xpath("//input[@type='radio' and @value='" + val + "']"));
            assertEquals(val, radio.getAttribute("value"));
        }
    }

    @Test
    void testRadioButtonsContent2q2() {
        goToPage2Html();
        String[] values = { "Rome", "Milan", "Naples" };
        for (String val : values) {
            WebElement radio = driver.findElement(By.xpath("//input[@type='radio' and @value='" + val + "']"));
            assertEquals(val, radio.getAttribute("value"));
        }
    }
    @Test
    void testRadioButtonsExists3q3() {
        goToPage3Html();
        java.util.List<WebElement> radioButtons = driver.findElements(By.name("q3"));
        assertEquals(3, radioButtons.size());
        for (WebElement radio : radioButtons) {
            assertNotNull(radio);
            assertTrue(radio.isDisplayed());
        }
    }

    @Test
    void testRadioButtonsExists3q4() {
        goToPage3Html();
        java.util.List<WebElement> radioButtons = driver.findElements(By.name("q4"));
        assertEquals(3, radioButtons.size());
        for (WebElement radio : radioButtons) {
            assertNotNull(radio);
            assertTrue(radio.isDisplayed());
        }
    }

    @Test
    void testRadioButtonsLocAndSize3q3() {
        goToPage3Html();
        for (WebElement radio : driver.findElements(By.name("q3"))) {
            Point location = radio.getLocation();
            Dimension size = radio.getSize();
            int x = location.getX();
            int y = location.getY();
            assertTrue((x == 484 || x == 483 || x == 477) && y == 277 || y == 297 || y == 317);
            assertTrue(size.getWidth() > 0 && size.getHeight() > 0);
        }
    }

    @Test
    void testRadioButtonsLocAndSize3q4() {
        goToPage3Html();
        for (WebElement radio : driver.findElements(By.name("q4"))) {
            Point location = radio.getLocation();
            Dimension size = radio.getSize();
            int x = location.getX();
            int y = location.getY();
            assertTrue((x >0) && y == 456 || y == 436 || y == 416);
            assertTrue(size.getWidth() > 0 && size.getHeight() > 0);
        }
    }

    @Test
    void testRadioButtonsContent3q3() {
        goToPage3Html();
        String[] values = { "Ottawa", "Toronto", "Vancouver" };
        for (String val : values) {
            WebElement radio = driver.findElement(By.xpath("//input[@type='radio' and @value='" + val + "']"));
            assertEquals(val, radio.getAttribute("value"));
        }
    }

    @Test
    void testRadioButtonsContent3q4() {
        goToPage3Html();
        String[] values = { "Canberra", "Sydney", "Melbourne" };
        for (String val : values) {
            WebElement radio = driver.findElement(By.xpath("//input[@type='radio' and @value='" + val + "']"));
            assertEquals(val, radio.getAttribute("value"));
        }
    }

    @Test
    void testRadioButtonsExists4() {
        goToPage4Html();
        java.util.List<WebElement> radioButtons = driver.findElements(By.name("q5"));
        assertEquals(3, radioButtons.size());
        for (WebElement radio : radioButtons) {
            assertNotNull(radio);
            assertTrue(radio.isDisplayed());
        }
    }

    @Test
    void testRadioButtonsLocAndSize4() {
        goToPage4Html();
        for (WebElement radio : driver.findElements(By.name("q5"))) {
            Point location = radio.getLocation();
            Dimension size = radio.getSize();
            int x = location.getX();
            int y = location.getY();
            assertTrue((x == 490 || x == 488 || x == 491) && y == 244 || y == 264 || y == 284);
            assertTrue(size.getWidth() > 0 && size.getHeight() > 0);
        }
    }

    @Test
    void testRadioButtonsContent4() {
        goToPage4Html();
        String[] values = { "Abuja", "Lagos", "Kano" };
        for (String val : values) {
            WebElement radio = driver.findElement(By.xpath("//input[@type='radio' and @value='" + val + "']"));
            assertEquals(val, radio.getAttribute("value"));
        }
    }

    @Test
    void testRadioButtonsExists6() {
        goToPage6Html();
        java.util.List<WebElement> radioButtons = driver.findElements(By.name("rating"));
        assertEquals(3, radioButtons.size());
        for (WebElement radio : radioButtons) {
            assertNotNull(radio);
            assertTrue(radio.isDisplayed());
        }
    }

    @Test
    void testRadioButtonsLocAndSize6() {
        goToPage6Html();
        for (WebElement radio : driver.findElements(By.name("rating"))) {
            Point location = radio.getLocation();
            Dimension size = radio.getSize();
            int x = location.getX();
            int y = location.getY();
            assertTrue((x == 479 || x == 468 || x == 482) && y == 283 || y == 303 || y == 323);
            assertTrue(size.getWidth() > 0 && size.getHeight() > 0);
        }
    }

    @Test
    void testRadioButtonsContent6() {
        goToPage6Html();
        String[] values = { "Satisfied", "Satisfactory", "Horrible" };
        for (String val : values) {
            WebElement radio = driver.findElement(By.xpath("//input[@type='radio' and @value='" + val + "']"));
            assertEquals(val, radio.getAttribute("value"));
        }
    }

    // Checkbox Test Cases
    @Test
    void testCheckboxExists1() {
        goToPage1Html();
        WebElement checkbox = driver.findElement(By.id("honorCheckbox"));
        assertNotNull(checkbox);
        assertTrue(checkbox.isDisplayed());
    }

    @Test
    void testCheckboxLocAndSize1() {
        goToPage1Html();
        WebElement checkbox = driver.findElement(By.id("honorCheckbox"));
        Point location = checkbox.getLocation();
        Dimension size = checkbox.getSize();
        assertTrue(location.getX() == 297 && location.getY() == 771);
        assertTrue(size.getWidth() > 0 && size.getHeight() > 0);
    }

    @Test
    void testCheckboxContent1() {
        goToPage1Html();
        WebElement checkbox = driver.findElement(By.id("honorCheckbox"));
        WebElement label = checkbox.findElement(By.xpath(".."));
        assertTrue(label.getText().contains("This quiz is being taken only by me"));
    }

    @Test
    void testCheckboxExists2() {
        goToPage2Html();
        WebElement checkbox = driver.findElement(By.id("confirm2"));
        assertNotNull(checkbox);
        assertTrue(checkbox.isDisplayed());
    }

    @Test
    void testCheckboxLocAndSize2() {
        goToPage2Html();
        WebElement checkbox = driver.findElement(By.id("confirm2"));
        Point location = checkbox.getLocation();
        Dimension size = checkbox.getSize();
        assertTrue(location.getX() > 0 && location.getY() == 597);
        assertTrue(size.getWidth() > 0 && size.getHeight() > 0);
    }

    @Test
    void testCheckboxContent2() {
        goToPage2Html();
        WebElement checkbox = driver.findElement(By.id("confirm2"));
        WebElement label = checkbox.findElement(By.xpath(".."));
        assertTrue(label.getText().contains("Confirm"));
    }

    @Test
    void testCheckboxExists3() {
        goToPage3Html();
        WebElement checkbox = driver.findElement(By.id("confirm3"));
        assertNotNull(checkbox);
        assertTrue(checkbox.isDisplayed());
    }

    @Test
    void testCheckboxLocAndSize3() {
        goToPage3Html();
        WebElement checkbox = driver.findElement(By.id("confirm3"));
        Point location = checkbox.getLocation();
        Dimension size = checkbox.getSize();
        assertTrue(location.getX() > 0 && location.getY() == 612);
        assertTrue(size.getWidth() > 0 && size.getHeight() > 0);
    }

    @Test
    void testCheckboxContent3() {
        goToPage3Html();
        WebElement checkbox = driver.findElement(By.id("confirm3"));
        WebElement label = checkbox.findElement(By.xpath(".."));
        assertTrue(label.getText().contains("Confirm"));
    }

    @Test
    void testCheckboxExists4() {
        goToPage4Html();
        WebElement checkbox = driver.findElement(By.id("confirm4"));
        assertNotNull(checkbox);
        assertTrue(checkbox.isDisplayed());
    }

    @Test
    void testCheckboxLocAndSize4() {
        goToPage4Html();
        WebElement checkbox = driver.findElement(By.id("confirm4"));
        Point location = checkbox.getLocation();
        Dimension size = checkbox.getSize();
        assertTrue(location.getX() == 481 && location.getY() == 440);
        assertTrue(size.getWidth() > 0 && size.getHeight() > 0);
    }

    @Test
    void testCheckboxContent4() {
        goToPage4Html();
        WebElement checkbox = driver.findElement(By.id("confirm4"));
        WebElement label = checkbox.findElement(By.xpath(".."));
        assertTrue(label.getText().contains("Confirm"));
    }

    @Test
    void testCheckboxExists6() {
        goToPage6Html();
        WebElement checkbox = driver.findElement(By.id("subscribe"));
        assertNotNull(checkbox);
        assertTrue(checkbox.isDisplayed());
    }

    @Test
    void testCheckboxLocAndSize6() {
        goToPage6Html();
        WebElement checkbox = driver.findElement(By.id("subscribe"));
        Point location = checkbox.getLocation();
        Dimension size = checkbox.getSize();
        assertTrue(location.getX() == 434 && location.getY() == 431);
        assertTrue(size.getWidth() > 0 && size.getHeight() > 0);
    }

    @Test
    void testCheckboxContent6() {
        goToPage6Html();
        WebElement checkbox = driver.findElement(By.id("subscribe"));
        WebElement label = checkbox.findElement(By.xpath(".."));
        assertTrue(label.getText().contains("Subscribe to updates"));
    }

    // Button Test Cases
    @Test
    void testButtonExists1() {
        goToPage1Html();
        WebElement button = driver.findElement(By.id("startButton"));
        assertNotNull(button);
        assertTrue(button.isDisplayed());
    }

    @Test
    void testButtonLocAndSize1() {
        goToPage1Html();
        WebElement button = driver.findElement(By.id("startButton"));
        Point location = button.getLocation();
        Dimension size = button.getSize();
        assertTrue(location.getX() == 473 && location.getY() == 806);
        assertTrue(size.getWidth() > 0 && size.getHeight() > 0);
    }

    @Test
    void testButtonContent1() {
        goToPage1Html();
        WebElement button = driver.findElement(By.id("startButton"));
        assertEquals("Start Quiz", button.getText());
    }

    @Test
    void testButtonExists2() {
        goToPage2Html();
        WebElement button = driver.findElement(By.id("next3"));
        assertNotNull(button);
        assertTrue(button.isDisplayed());
    }

    @Test
    void testButtonLocAndSize2() {
        goToPage2Html();
        WebElement button = driver.findElement(By.id("next3"));
        Point location = button.getLocation();
        Dimension size = button.getSize();
        assertTrue(location.getX() == 489 && location.getY() == 634);
        assertTrue(size.getWidth() > 0 && size.getHeight() > 0);
    }

    @Test
    void testButtonContent2() {
        goToPage2Html();
        WebElement button = driver.findElement(By.id("next3"));
        assertEquals("Next", button.getText());
    }

    @Test
    void testButtonExists3() {
        goToPage3Html();
        WebElement button = driver.findElement(By.id("next4"));
        assertNotNull(button);
        assertTrue(button.isDisplayed());
    }

    @Test
    void testButtonLocAndSize3() {
        goToPage3Html();
        WebElement button = driver.findElement(By.id("next4"));
        Point location = button.getLocation();
        Dimension size = button.getSize();
        assertTrue(location.getX() == 489 && location.getY() == 649);
        assertTrue(size.getWidth() > 0 && size.getHeight() > 0);
    }

    @Test
    void testButtonContent3() {
        goToPage3Html();
        WebElement button = driver.findElement(By.id("next4"));
        assertEquals("Next", button.getText());
    }

    @Test
    void testButtonExists4() {
        goToPage4Html();
        WebElement button = driver.findElement(By.id("next6"));
        assertNotNull(button);
        assertTrue(button.isDisplayed());
    }

    @Test
    void testButtonLocAndSize4() {
        goToPage4Html();
        WebElement button = driver.findElement(By.id("next6"));
        Point location = button.getLocation();
        Dimension size = button.getSize();
        assertTrue(location.getX() == 489 && location.getY() == 477);
        assertTrue(size.getWidth() > 0 && size.getHeight() > 0);
    }

    @Test
    void testButtonContent4() {
        goToPage4Html();
        WebElement button = driver.findElement(By.id("next6"));
        assertEquals("Submit", button.getText());
    }

    @Test
    void testButtonExists6b1() {
        goToPage6Html();
        WebElement button = driver.findElement(By.id("finish"));
        assertNotNull(button);
        assertTrue(button.isDisplayed());
    }

    @Test
    void testButtonLocAndSize6b1() {
        goToPage6Html();
        WebElement button = driver.findElement(By.id("finish"));
        Point location = button.getLocation();
        Dimension size = button.getSize();
        assertTrue(location.getX() == 454 && location.getY() == 467);
        assertTrue(size.getWidth() > 0 && size.getHeight() > 0);
    }

    @Test
    void testButtonContent6b1() {
        goToPage6Html();
        WebElement button = driver.findElement(By.id("finish"));
        assertEquals("Finish", button.getText());
    }

    @Test
    void testButtonExists6b2() {
        goToPage6Html();
        WebElement button = driver.findElement(By.id("restart"));
        assertNotNull(button);
        assertTrue(button.isDisplayed());
    }

    @Test
    void testButtonLocAndSize6b2() {
        goToPage6Html();
        WebElement button = driver.findElement(By.id("restart"));
        Point location = button.getLocation();
        Dimension size = button.getSize();
        assertTrue(location.getX() == 510 && location.getY() == 467);
        assertTrue(size.getWidth() > 0 && size.getHeight() > 0);
    }

    @Test
    void testButtonContent6b2() {
        goToPage6Html();
        WebElement button = driver.findElement(By.id("restart"));
        assertEquals("Try Again", button.getText());
    }

    // Navigation Flow Test Cases
    @Test
    void testPage1ToPage2Navigation(){
        goToPage1Html();

        driver.findElement(By.id("username")).sendKeys("TestUser");
        driver.findElement(By.name("experience")).click();
        driver.findElement(By.id("honorCheckbox")).click();

        WebElement startButton = driver.findElement(By.id("startButton"));
        startButton.click();
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.endsWith("page2.html") || currentUrl.contains("page2.html"),
                "Expected navigation to page2.html, but got: " + currentUrl);
    }
    @Test
    void testPage2ToPage3Navigation(){
        goToPage2Html();
        driver.findElement(By.id("confirm2")).click();

        WebElement next3Button = driver.findElement(By.id("next3"));
        next3Button.click();
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.endsWith("page3.html") || currentUrl.contains("page3.html"),
                "Expected navigation to page3.html, but got: " + currentUrl);
    }
    @Test
    void testPage3ToPage4Navigation(){
        goToPage3Html();
        driver.findElement(By.id("confirm3")).click();

        WebElement next4Button = driver.findElement(By.id("next4"));
        next4Button.click();
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.endsWith("page4.html") || currentUrl.contains("page4.html"),
                "Expected navigation to page4.html, but got: " + currentUrl);
    }
    @Test
    void testPage4ToPage6Navigation(){
        goToPage4Html();
        driver.findElement(By.id("confirm4")).click();

        WebElement next6Button = driver.findElement(By.id("next6"));
        next6Button.click();
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.endsWith("page6.html") || currentUrl.contains("page6.html"),
                "Expected navigation to page6.html, but got: " + currentUrl);
    }
    @Test
    void testPage6ToPage1Navigation(){
        goToPage6Html();
        WebElement restartButton = driver.findElement(By.id("restart"));
        restartButton.click();
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.endsWith("page1.html") || currentUrl.contains("page1.html"),
                "Expected navigation to page1.html, but got: " + currentUrl);
    }
    @AfterAll
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
