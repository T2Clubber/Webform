package com.example.springboot;

import java.sql.*;
import java.io.File;

public class cobdd {
    private Connection connect;

    public cobdd(String path) {
        if (!new File(path).exists()) {
            String URL="jdbc:sqlite:" + path;
            try{
                this.connect = DriverManager.getConnection(URL);
            } catch(Exception e) {
                System.err.println(e.getMessage());
            }
        } else {
            String URL="jdbc:sqlite:" + path;
            try{
                this.connect = DriverManager.getConnection(URL);
            } catch(Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
    public void addUser(String username, String password) {
        // coder l'insert dans User dans la BDD, avec des insert en langage jdbc (voir google)
        //se renseigner sur le "cors" pour permettre les post (remplacer les get par des post)
    }
}
