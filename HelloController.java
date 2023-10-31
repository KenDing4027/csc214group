package com.example.demo2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public static class Person {


        public String Name;
        public int Age;
        public long Height;
        public String Sex;

        public String getName() {
            return Name;
        }
        public void setName(String name) {
            Name = name;
        }
        public int getAge() {
            return Age;
        }
        public void setAge(int age) {
            Age = age;
        }
        public long getHeight() {
            return Height + 100 ;
        }
        public void setHeight(long height) {
            Height = height;
        }


        public boolean Speak()
        {
            if(Age  > 80) {


                //System.out.println("I am too old to speak!");

                return false;

            }
            else {

                return true;

                //System.out.println("I am speaking!");
            }
        }


        public void Sleep(int howlong ) {

            System.out.println("I slept " + howlong +  "days");


        }

        public String toString() {

            return Name;


        }

    }
}