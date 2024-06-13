package com.qascript.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtil {

    public static Properties properties;


    public static Properties loadApplicationProperties() throws IOException,FileNotFoundException {

        properties=new Properties();

        FileInputStream fid= null;


        try {
            fid=new FileInputStream("C:\\Users\\prady\\IdeaProjects\\CucumberFramework\\application.properties");

            properties.load(fid);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
//        catch (FileNotFoundException e){
//            e.printStackTrace();
//        }
        return properties;
    }


    public static Properties loadUserProperties() throws IOException,FileNotFoundException {

        properties=new Properties();

        FileInputStream fid= null;


        try {
            fid=new FileInputStream("C:\\Users\\prady\\IdeaProjects\\CucumberFramework\\user.properties");

            properties.load(fid);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
//        catch (FileNotFoundException e){
//            e.printStackTrace();
//        }
        return properties;
    }


    public static Properties loadFrameworkProperties() throws IOException,FileNotFoundException {

        properties=new Properties();

        FileInputStream fid= null;


        try {
            fid=new FileInputStream("C:\\Users\\prady\\IdeaProjects\\CucumberFramework\\framework.properties");

            properties.load(fid);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
//        catch (FileNotFoundException e){
//            e.printStackTrace();
//        }
        return properties;
    }

}
