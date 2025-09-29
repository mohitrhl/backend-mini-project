package com.result.view.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestResultForm {
    @NotBlank(message = "Enter rollnumber !!")
    private String rollNumber;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;
}