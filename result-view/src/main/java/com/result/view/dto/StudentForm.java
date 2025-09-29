package com.result.view.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentForm {
    @NotBlank(message = "Name is required!")
    private String name;
    @NotBlank(message = "Roll Number is required !")
    private String rollNumber;
    @Email(message = "invalid Email")
    private String email;
    @NotBlank(message = "Address is required !")
    private String address;
    @NotBlank(message = "School is required !")
    private String schoolName;
    private String photoName;
    @NotBlank(message = "Standard is required !")
    private String standard;
    @NotBlank(message = "DOB is required !")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;
    @NotBlank(message = "Father Name is required !")
    private String fatherName;
    @NotBlank(message = "Gender is required !")
    private String gender;

    private List<MarksForm> marks = new ArrayList<>();
}
