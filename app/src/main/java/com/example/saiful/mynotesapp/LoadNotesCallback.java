package com.example.saiful.mynotesapp;

import com.example.saiful.mynotesapp.Entity.Note;

import java.util.ArrayList;

public interface LoadNotesCallback {
    void preExecute();
    void postExecute(ArrayList<Note> notes);

}
