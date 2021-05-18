package com.example.demodatabasecrud;

import java.io.Serializable;

public class Note implements Serializable {

    private int id;
    private String noteContent;

    public Note (int id, String content) {
        this.id = id;
        this.noteContent = content;
    }

    //----------Getter/Setter-----------
    public int getId() {
        return id;
    }
    public String getNoteContent() {
        return noteContent;
    }
    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }
    //----------Getter/Setter-----------


    @Override
    public String toString() {
        return "ID:" + id + ", " + noteContent;
    }

}
