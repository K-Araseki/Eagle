package org.vaadin.example.data;

import java.io.Serializable;

public record 出勤者(
        AccountId accountId,
        LastName lastName,
        FirstName firstName
)implements Serializable {
}
