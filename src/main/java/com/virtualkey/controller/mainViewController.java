package com.virtualkey.controller;

import com.virtualkey.views.mainView;

public class mainViewController {
    private static mainView mv;
    // using static block bcz developer details and app details will be displayed only once
    static {
        mv = new mainView();
        mv.showDetails();
    }
    public mainViewController () {

        int option;
        // using do while bcz at least it will run once
        do{
            mv.showMenu();
            option = mv.UserInput();
            mv.ExecuteMenu(option);
        }
        while (option!=3);
    }
}
