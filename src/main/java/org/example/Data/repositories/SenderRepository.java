package org.example.Data.repositories;

import org.example.Data.models.Sender;
import org.example.dto.CreateSenderRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SenderRepository extends MongoRepository<Sender, String> {
    CreateSenderRequest findByPhoneNumber(String phoneNumber);
}
