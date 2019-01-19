package com.example.lolaabudu.appfromscratch.model;

public class MyAndroid {

    private String ver;
    private String name;
    private String api;

    public MyAndroid(String ver, String name, String api) {
        this.ver = ver;
        this.name = name;
        this.api = api;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getVer() {
        return ver;
    }

    public String getName() {
        return name;
    }

    public String getApi() {
        return api;
    }
}
