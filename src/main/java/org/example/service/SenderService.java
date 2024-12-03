package org.example.service;

import org.example.dto.CreateSenderRequest;
import org.example.dto.CreateSenderResponse;

public interface SenderService {
    CreateSenderResponse createSender(CreateSenderRequest createSenderRequest);
}
