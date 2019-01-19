package com.example.lolaabudu.appfromscratch.model;

import java.util.List;

//this is the outside object
public class AndroidList {

    private List<MyAndroid> android;

    public AndroidList(List<MyAndroid> android) {
        this.android = android;
    }

    public List<MyAndroid> getAndroidList() {
        return android;
    }

    public void setMyAndroid(List<MyAndroid> android) {
        this.android = android;
    }
}
