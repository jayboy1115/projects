package org.example.Data.repositories;

import org.example.Data.models.TrackingLog;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrackingLogRepository extends MongoRepository<TrackingLog, String> {
}
