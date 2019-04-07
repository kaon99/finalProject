package utils;

import java.util.ResourceBundle;

public class AttributesResourseManager {
    private AttributesResourseManager(){

    };
  private static   ResourceBundle resourceBundle = ResourceBundle.getBundle("attributes");

    public static String getProperty (String key ){
        return resourceBundle.getString(key);
    }
}
