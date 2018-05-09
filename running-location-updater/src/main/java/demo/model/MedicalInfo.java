package demo.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class MedicalInfo {

    private String bandMake;
    private String medCode;
    private String medicalInfoId;
    private String medicalInfoClassification;
    private String description;
    private String aidInstructions;
    private String fmi;
    private String bfr;

}