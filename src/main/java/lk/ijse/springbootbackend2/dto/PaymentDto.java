package lk.ijse.springbootbackend2.dto;

import lombok.Data;

@Data
public class PaymentDto {
    private Double amount;
    private String paymentMethod;
    private String transactionId;
    private Long bookingId;
}