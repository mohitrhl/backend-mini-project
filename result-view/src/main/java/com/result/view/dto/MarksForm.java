package com.result.view.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MarksForm {
    private String subjectName;
    private Double marks;
    private Double maxMarks;
    private String feedback;
    private String grade;

    private StudentForm student;

}
