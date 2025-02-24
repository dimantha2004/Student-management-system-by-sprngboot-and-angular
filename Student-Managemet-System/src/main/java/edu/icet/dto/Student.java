package edu.icet.dto;

import edu.icet.util.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Student {

    private Integer id;
    private String name;
    private String address;
    private String age;
    private Gender gender;

}
