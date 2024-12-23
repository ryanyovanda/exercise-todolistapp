package com.backend.todolistapp.adapter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetTodoResponseDTO {
    private Long id;
    private String title;
    private String description;
    private Boolean isCompleted;
}
