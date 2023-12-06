package test_videoplayback;

import base.BasePage;
import homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPlayBackFunctionality extends BasePage {
    /* Test Case: Test the video playback functionality.
     *1.Navigate to the ESPN website (espn.com).
     *2.Play a video from the website
     *3.Pause the video
     * 4.Mute the video
     * 5.Verify that the video starts playing smoothly and the controls(play,pause,volume) work correctly.
     */
    @Test(priority=4, groups={"BAT"})
    public void doPlayVideo(){
        HomePage homePage = new HomePage();


        homePage.doPlayVideo();

    }
}