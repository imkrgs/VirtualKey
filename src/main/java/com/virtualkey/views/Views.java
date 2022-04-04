package com.virtualkey.views;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public abstract class Views{
    // to show the menu bcz different menu will have different options
    public abstract void showMenu ();

    // execute different menu
    public abstract void ExecuteMenu(int option);

    // create different menu
    public abstract HashMap<Integer,String> createMenu();

    // taking input from user
    public int UserInput(){
        Scanner sc = new Scanner(System.in);
        int option = 0 ;
        try{
            option = sc.nextInt();
        }
        catch ( Exception ex ){
        }
        return option;
    }
}