package MethodOverloading;

public class MethodOverLoadingConcept {
    //with the same name
    //Method overloading can be achieved in same class
    //Method name is same but parameter should be diffed,
    //methods return only one return type


    public void login(){
        System.out.println("Login Method");

    }
    public void login(String username){
        System.out.println(username + "Test");
    }
    public void login(String username, String password){
        System.out.println(username + "Test" + password + "pass");
    }

    public static void main(String[] args) {

    }
}
