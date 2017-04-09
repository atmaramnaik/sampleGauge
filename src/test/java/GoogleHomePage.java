/**
 * Created by atmaramn on 4/9/17.
 */
public class GoogleHomePage {
    public static void navigate(){
        Driver.get().navigate().to("http://www.google.com");
    }
    public static void exit(){
        Driver.get().quit();
    }
}
