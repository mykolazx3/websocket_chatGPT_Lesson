package com.mykola.websocket_chatgpt_lesson;

//public class Message {
//    private String from;
//    private String text;
//
//    // Геттери і сеттери
//    public String getFrom() {
//        return from;
//    }
//
//    public void setFrom(String from) {
//        this.from = from;
//    }
//
//    public String getText() {
//        return text;
//    }
//
//    public void setText(String text) {
//        this.text = text;
//    }
//}

public class Message {
    private String from;
    private String to;  // Додано поле для одержувача
    private String text;

    // Геттери і сеттери
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
