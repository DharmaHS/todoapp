package org.tsinghua.todoapp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class TodoList {
    private ArrayList<Todo> data = new ArrayList<>();
    private int count = 0;
    SimpleDateFormat dateFormat = new SimpleDateFormat("HH,mm,ss");
    public TodoList(ArrayList<String> contents) {
        for (int i = 0; i < contents.size(); i++) {
            data.add(new Todo(i, contents.get(i), dateFormat.format(Calendar.getInstance().getTime())));
            count++;
        }
    }

    public TodoList() {
    }

    public void insert(String content) {
        data.add(new Todo(count, content, dateFormat.format(Calendar.getInstance().getTime())));
        count++;
    }

    public void delete(int number) {
        // Reverse order
        data.remove(data.size() - number - 1);
        count--;
    }

    public Todo get(int index) {
        return data.get(index);
    }

    public int size() {
        return data.size();
    }
}
