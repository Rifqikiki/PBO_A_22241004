package com.tutorial;

class user {
    private String username;
    private String password;

    // membuat konstruktor
    user(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // method getter
    public String getusername() {
        return this.username;
    }

    public String getpassword() {
        return this.password;
    }

    public void setpassword(String password) {
        this.password = password;
    }
}

public class Main {
    public static void main(String[] args) {
        // instansiasi objek
        user person_1 = new user("nill", "nihil");

        // panggil method getter
        System.out.println(person_1.getusername());
        System.out.println(person_1.getpassword());

        // setter
        person_1.setpassword("12345678");
        System.out.println("new password" + person_1.getpassword());
    }

}
