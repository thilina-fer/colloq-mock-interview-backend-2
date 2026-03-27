package lk.ijse.springbootbackend2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class APIResponse {
    private int statusCode;
    private String message;
    private Object data;
}
