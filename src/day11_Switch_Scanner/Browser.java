package day11_Switch_Scanner;

public class Browser {
        public static void main(String[] args) {
            String browserName = "chrome";
            String result = "";
             boolean validbrowser = browserName == "chrome" || browserName == "firefox" || browserName == "opera"
                                || browserName == "safari" || browserName == "edge";
            if(validbrowser){
                if(browserName == "chrome"){
                   result = "Chrome Browser is selected";
                }else if (browserName == "firefox"){
                    result = "Firefox browser is selected";
                }else if (browserName == "Opera") {
                    result =  "Opera browser is selected";
                }else if(browserName == "Safari") {
                    result = "Safari browser is selected";
                }else  {
                    result =  "edge browser is selected";
                }
            } else{
                result = "Invalid Browser";
            }
            System.out.println(result);
        }
    }

