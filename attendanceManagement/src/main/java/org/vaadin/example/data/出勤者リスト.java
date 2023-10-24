package org.vaadin.example.data;

import java.io.Serializable;
import java.util.List;

public record 出勤者リスト(
        List<出勤者> values
)implements Serializable {
}
