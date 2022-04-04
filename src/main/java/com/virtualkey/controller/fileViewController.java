package com.virtualkey.controller;

import com.virtualkey.views.fileView;

public class fileViewController {
    private  fileView fv;
    public fileViewController () {
        fv = new fileView();
        int option;
        // using do while bcz at least it will run once
        do{
            fv.showMenu();
            option = fv.UserInput();
            fv.ExecuteMenu(option);
        }
        while (option!=4);
    }
}
