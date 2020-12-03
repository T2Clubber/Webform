package com.example.springboot;

public class Response {

    private String message;
    private String username;
    private int id;

    public Response(String message, String username, int id) {
        this.message = message;
        this.username = username;
        this.id = id;
    }
    public String getMessage() {
        return new String(this.message);
    }

    public String getUsername() {
        return new String (this.username);
    }

    public int getID() {
        return this.id;
    }
}
