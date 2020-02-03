package com.startdown.ways.models.base;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
public class SingleResponse <T> extends BaseResponse {
    T result;
}
