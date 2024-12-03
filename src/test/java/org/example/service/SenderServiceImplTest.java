package org.example.service;

import org.example.Data.models.Sender;
import org.example.dto.CreateSenderRequest;
import org.example.dto.CreateSenderResponse;
import org.example.exception.SenderAlreadyExistsException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SenderServiceImplTest {
    @Autowired
    private SenderService senderService;

    @Test
    void testThatSenderExist() {
        CreateSenderRequest createSenderRequest = new CreateSenderRequest();
        createSenderRequest.setName("johnson");
        createSenderRequest.setPhoneNumber("123456789");

        CreateSenderResponse createSenderResponse = senderService.createSender(createSenderRequest);
        assertNotNull(createSenderResponse);
        assertEquals("sender created successfully", createSenderResponse.getMessage());
    }

    @Test
    void testThatSenderDoesNotCreateNewSenderIfExisting() {
        CreateSenderRequest createSenderRequest = new CreateSenderRequest();
        createSenderRequest.setName("johnson");
        createSenderRequest.setPhoneNumber("123456789");
        senderService.createSender(createSenderRequest);

        CreateSenderResponse createSenderResponse = senderService.createSender(createSenderRequest);
        createSenderResponse.setId(createSenderRequest.getId());

        assertThrows(SenderAlreadyExistsException.class, () -> {
            senderService.createSender(createSenderRequest);
        });
    }

}