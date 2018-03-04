package com.kodality.messenger.message;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MessageServiceTest {

    private MessageService messageService = new MessageService();

    @Test
    public void getMessages() {
        Assert.assertEquals(1, messageService.getMessages().size());
    }
}