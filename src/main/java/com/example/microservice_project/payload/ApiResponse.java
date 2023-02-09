package com.example.microservice_project.payload;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.net.http.HttpClient;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ApiResponse {
    public String message;
    private boolean success;
    private HttpStatus status;
}
