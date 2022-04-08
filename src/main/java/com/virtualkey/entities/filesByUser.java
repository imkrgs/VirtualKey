package com.virtualkey.entities;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class filesByUser {

    // path will not be changed during the life cycle of application
    private final static String path= "D:\\work\\projects\\VirtualKey\\src\\main\\resources\\directory\\";


    // to add a file to directory
    public static void addFile(String name) {

        File f = new File(path+name + ".txt");
        try {
            f.createNewFile();
            System.out.println("File Added Successfully !");
        }catch ( Exception ex ){
            System.out.println("could not add file !");
        }
    }

    // to delete a file from directory
    public static void deleteFile(String name) {

        File f = new File(path+ name + ".txt");
        try {
            if (f.exists())
                System.out.println("File Deleted Successfully ! \nFile Name:"+name+".txt");
            else
                System.out.println(" file not found !");
        }catch ( Exception ex ){
            System.out.println(" file not found !");
        }
    }

    // to search a file from directory
    public static void searchFile (String name) {
        File f = new File(path+ name + ".txt");
        try {
            if (f.exists())
                System.out.println("File Found Successfully ! \nFile Name:"+name+".txt");
            else
                System.out.println(" file not found !");
        }catch ( Exception ex ){
            System.out.println(" file not found !");
        }
    }

    // to return the list of file from directory in sorted order
    public static ArrayList<String> listFile () {
        File f = new File(path);
        ArrayList<String> list = new ArrayList<>();
        try {
            for(String s : f.list()) list.add(s);
            Collections.sort(list);
        }catch ( Exception ex ){
        }
        return list;
    }
}
