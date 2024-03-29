package com.cybertek.dto;

import com.cybertek.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class UserDTO {
    private String firstName;
    private String lastName;
    private String userName;
    private String Password;
    private boolean enabled;
    private String phone;
    private RoleDTO role;
    private Gender gender;

}
