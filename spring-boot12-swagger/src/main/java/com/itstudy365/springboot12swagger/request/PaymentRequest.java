package com.itstudy365.springboot12swagger.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class PaymentRequest {
    @Schema(description = "Payment amount", example = "100.00")
    private double amount;

    @Schema(description = "Payment method", example = "card")
    private String method;
}
