package lk.ijse.springbootbackend2.dto.auth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoogleAuthDTO {
    private String idToken;
    private String role;
}