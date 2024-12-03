package org.example.Data.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Document
public class Package {

    private String id;
    private Receiver receiver;
    private List<TrackingLog> trackingLogs;
    private String description;
    private LocalDateTime createdAt;
    private Sender sender;
    private BigDecimal deliveryFee;
    private int quantity;
}
