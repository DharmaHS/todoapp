package org.tsinghua.todoapp;


import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Todo {
    private int number = 0;
    private String content = "";
    SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    String createAt = "00:00:00";

    public Todo(int number, String content, String createAt) {
        this.number = number;
        this.content = content;
        this.createAt = createAt;
    }


    public int getNumber() {
        return number;
    }

    public String getContent() {
        return content;
    }

    public String getCreateAt(){
        return createAt;
    }
}
