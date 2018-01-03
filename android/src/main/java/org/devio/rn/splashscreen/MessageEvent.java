package org.devio.rn.splashscreen;

/**
 * Created by duypx on 1/3/18.
 */

public class MessageEvent {
    private String message;

    public MessageEvent() {

    }

    public MessageEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
