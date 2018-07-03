package uc.entities;

import io.swagger.model.Message.MessagetypeEnum;

public class Message {

    private MessagetypeEnum messagetype;
    private String text;

    public Message() {
    }

    public MessagetypeEnum getMessagetype() {
        return messagetype;
    }
    public void setMessagetype(MessagetypeEnum messagetype) {
        this.messagetype = messagetype;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public static Message fromSwaggerObject(io.swagger.model.Message input)
    {
        Message message = new Message();
        message.setMessagetype(input.getMessagetype());
        message.setText(input.getText());
        return message;
    }

    public io.swagger.model.Message toSwaggerObject() {
        io.swagger.model.Message result = new io.swagger.model.Message();
        result.setMessagetype(getMessagetype());
        result.setText(getText());
        return result;
    }
}