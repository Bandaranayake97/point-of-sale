package com.codeware.pointofsale.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StandardResponce {
    private int code;
    private String massage;
    private Object data;
}
