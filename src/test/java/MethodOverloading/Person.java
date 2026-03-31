package MethodOverloading;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
public class Person {

    public ArrayList<String> getDeviceList(String teamName){
        System.out.println("Team name is : "+ teamName);
        ArrayList<String> devicesList = new ArrayList<String>();
        if(teamName.equals("QA")){
            devicesList.add("iPhone 11");
            devicesList.add("iPhone 12");
            devicesList.add("iPhone 13");
            devicesList.add("iPhone 14");
            devicesList.add("iPhone 15");
        } else if (teamName.equals("Dev")) {
            devicesList.add("Android 8");
            devicesList.add("Android 9");
            devicesList.add("Android 10");
            devicesList.add("Android 11");
            devicesList.add("Android 12");
        }
        else {
            System.out.println("Team name not found : "+ teamName);
        };
        return devicesList;
    }

    public void launchBrowser(String browserName){

        switch (browserName.toLowerCase()){
            case "chrome":
                System.out.println("Launch chrome");
                break;
            case "firefox":
                System.out.println("Launch firefox");
                break;

            case "safari":
                System.out.println("Launch safari");
                break;

            default:
                System.out.println("Please enter correct browser details : "+ browserName);
        }


    }


    //WAF : String param : Student name
    //return static array : name, age, city, phoneNumber, active
}
