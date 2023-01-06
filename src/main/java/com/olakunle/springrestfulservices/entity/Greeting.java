package com.olakunle.springrestfulservices.entity;

public class Greeting {

    private final Long id;
    private final String content;

    public Greeting(Long id, String content) {
        this.id = id;
        this.content = content;
    }



//    public void setId(Long id) {
//        this.id = id;
//    }
//    public void setContent(String content) {
//        this.content = content;
//    }

    public Long getId () {
        return this.id;
    }


    public String getContent() {
        return this.content;
    }


}
