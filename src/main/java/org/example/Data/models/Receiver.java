package org.example.Data.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class Receiver {
    private String id;
    private String fullName;
    private String address;
    private String phone;
}
