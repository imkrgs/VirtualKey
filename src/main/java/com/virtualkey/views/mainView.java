package com.virtualkey.views;

import com.virtualkey.controller.fileViewController;
import com.virtualkey.entities.filesByUser;

import java.util.ArrayList;
import java.util.HashMap;

public class mainView extends Views{

    private final String applicationName = "***********VirtualKey***********";
    private final String developerDetails = "***********Developed By Amar***********";
    private HashMap<Integer,String> menu ;

    public mainView () {
        this.menu = createMenu();
    }

    // create menu
    @Override
    public HashMap<Integer,String> createMenu(){

        HashMap<Integer,String> options = new HashMap<>();
        options.put(1,"Show File");
        options.put(2,"Show File Option Menu");
        options.put(3,"Exit");
        return options;
    }

    // details of app and developer
    public void showDetails(){

        System.out.println(applicationName);
        System.out.println(developerDetails);
    }

    // display the menu
    @Override
    public void showMenu () {
        System.out.println("Main Menu");
        menu.entrySet().forEach(e-> System.out.println(e.getKey()+"."+e.getValue()));
    }

    // display the files in directory
    public void showFiles () {
        ArrayList<String> file = filesByUser.listFile();
        file.forEach(e-> System.out.println(e));
    }

    @Override
    public void ExecuteMenu ( int option) {
        //this.showMenu();
        switch (option) {

            case 1: // Show Files in Directory
                this.showFiles();
                break;

            case 2: // Show File Options menu
                fileViewController fv = new fileViewController();
                break;

            case 3: // Show exit greetings
                System.out.println("Thanks for using the App !");
                break;

            default:
                System.out.println("Invalid Option");
                break;
        }

    }

}
