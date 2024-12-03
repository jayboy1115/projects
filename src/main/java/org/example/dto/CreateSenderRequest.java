package org.example.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateSenderRequest {

    private String id;
    private String name;
    private String phoneNumber;
}
