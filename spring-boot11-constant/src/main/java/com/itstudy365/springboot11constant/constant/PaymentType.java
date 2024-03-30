package com.itstudy365.springboot11constant.constant;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum PaymentType {
    CARD((short)1, "card"),
    BANK((short)2, "bank"),
    OTHER((short)9, "other");
    private final short type;
    private final String name;
    @Nonnull
    public static PaymentType getType(@Nullable Short paymentType) {
        if (paymentType != null) {
            for (PaymentType type : PaymentType.values()) {
                if (type.getType() == paymentType) {
                    return type;
                }
            }
        }
        return OTHER; // Default to OTHER if paymentType is null or not found
    }
}
