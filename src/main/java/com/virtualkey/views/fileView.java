package com.virtualkey.views;

import com.virtualkey.entities.filesByUser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class fileView extends Views{

    private HashMap<Integer,String> menu ;

    public fileView () {
        this.menu = this.createMenu();
    }

    @Override
    public HashMap<Integer,String> createMenu(){

        HashMap<Integer,String> options = new HashMap<>();
        options.put(1,"Add a File");
        options.put(2,"Delete a File");
        options.put(3,"Search a File");
        options.put(4,"Return to Main Menu");
        return options;
    }

    // string input from user
    private String getInputString() {
        Scanner in = new Scanner(System.in);
        return(in.nextLine());
    }

    // interacting with user for taking file name as input
    private String interactUser (){
        System.out.print ("Enter the Name of file :");
        String name = this.getInputString();
        return name;
    }

    @Override
    public void showMenu () {
        System.out.println("File Option Menu");
        menu.entrySet().forEach(e-> System.out.println(e.getKey()+"."+e.getValue()));
    }

    @Override
    public void ExecuteMenu (int option) {
        switch ( option ) {

            case 1: // Add File
                filesByUser.addFile(this.interactUser());
                break;

            case 2: // Delete File
                filesByUser.deleteFile(this.interactUser());
                break;

            case 3: // Search File
                filesByUser.searchFile(this.interactUser());
                break;

            case 4: // Return to Menu
                //mainViewController mvc = new mainViewController();
                break;

            default:
                System.out.println("Invalid Option");
                break;
        }
    }

}
