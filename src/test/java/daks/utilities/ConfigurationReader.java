package daks.utilities;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    static Properties properties;

    static {

        String path = "configuration.properties";
        FileInputStream file = null;


        try {
            file = new FileInputStream(path);

            properties = new Properties();
            properties.load(file);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }



    public static  String getProperty(String key){
        return  properties.getProperty(key);
    }
}
