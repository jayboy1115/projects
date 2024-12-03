package org.example.Data.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class Sender {
    private String id;
    private String name;
    private String phoneNumber;

}
