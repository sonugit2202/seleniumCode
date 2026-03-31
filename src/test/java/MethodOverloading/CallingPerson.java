package MethodOverloading;

import java.util.ArrayList;

public class CallingPerson {

    public static void main(String[] args) {
        Person team = new Person();
        ArrayList<String> QADevicesList =  team.getDeviceList("QA");
        System.out.println(QADevicesList);
        ArrayList<String> DevDeviceLists = team.getDeviceList("Dev");
        System.out.println(DevDeviceLists);
        if(QADevicesList.contains("iPhone 12")){
            System.out.println("yes device present ");
        }
        else {
            System.out.println("No device not present");
        }
        team.launchBrowser("chrome");
    }

}
