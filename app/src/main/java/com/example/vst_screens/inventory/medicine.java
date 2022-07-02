package com.example.vst_screens.inventory;

import java.io.Serializable;

public class medicine implements Serializable {
    private String name;

    public medicine(){
        //
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    //can do same for image
}

