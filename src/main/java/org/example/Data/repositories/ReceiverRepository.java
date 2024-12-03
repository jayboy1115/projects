package org.example.Data.repositories;

import org.example.Data.models.Receiver;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReceiverRepository extends MongoRepository<Receiver, String> {

}
