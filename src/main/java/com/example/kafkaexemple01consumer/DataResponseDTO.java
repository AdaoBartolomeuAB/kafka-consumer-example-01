package com.example.kafkaexemple01consumer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataResponseDTO {
    private String type;
    private Object data;
}
