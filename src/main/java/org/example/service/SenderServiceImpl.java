package org.example.service;

import lombok.AllArgsConstructor;
import org.example.Data.models.Sender;
import org.example.Data.repositories.SenderRepository;
import org.example.dto.CreateSenderRequest;
import org.example.dto.CreateSenderResponse;
import org.example.exception.SenderAlreadyExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class SenderServiceImpl implements SenderService {


    private final SenderRepository senderRepository;


    @Override
    public CreateSenderResponse createSender(CreateSenderRequest createSenderRequest) {
        Sender sender = new Sender();
        senderRepository.findById(createSenderRequest.getId());
        if (sender != null) throw new SenderAlreadyExistsException("Sender with id " + createSenderRequest.getId() + " already exists");

        sender.setName(createSenderRequest.getName());
        sender.setPhoneNumber(createSenderRequest.getPhoneNumber());
        senderRepository.save(sender);

        CreateSenderResponse createSenderResponse = new CreateSenderResponse();
        createSenderResponse.setMessage("sender created successfully");
        createSenderResponse.setId(sender.getId());
        return createSenderResponse;

    }
}
