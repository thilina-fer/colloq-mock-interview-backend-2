package lk.ijse.springbootbackend2.dto.auth;

import lombok.Data;

@Data
public class RegisterDTO {
    private  String username;
    private String password;
    private String email;
    private String role;
}
