package utils;

import java.util.ResourceBundle;

public class QueriesResourseManager {

        private static ResourceBundle resourceBundle = ResourceBundle.getBundle("queries");

        public static String getProperty(String key) {
            return resourceBundle.getString(key);
        }
    }

