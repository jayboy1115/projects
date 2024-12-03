package org.example.Data.models;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter
@Document
public class TrackingLog {
    private String id;
    private String description;
    private String trackingNumber;
    private LocalDateTime trackingDate;

}
