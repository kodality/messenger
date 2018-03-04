package com.kodality.messenger.message;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class MessageService {

    public List<Message> getMessages() {
        Message message = new Message();
        message.setId(10L);
        message.setContent("Hello! This is dummy message that is hard-coded in MessageService." +
                " Instead of hard-coding you should fetch messages from real database using MessageRepository.");
        return Collections.singletonList(message);
    }

}
