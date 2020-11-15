package com.commu.backend.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommonResponse<T> {
    Boolean success = true;
    Boolean message = null;
    T result = null;

    CommonResponse() {}
    CommonResponse(T result){this.result = result;}
    public static CommonResponse<Void> success() { return new CommonResponse<>(); }
    public static <T> CommonResponse<T> of(T result) {
        return new CommonResponse<>(result);
    }
}