package ru.vtb.task5.model;

import lombok.*;

@Getter
@Setter
public class CreateProductRegisterRequest {
    @NonNull
    final public Integer instanceId         = 0;
    final public String registryTypeCode    = "";
    final public String currencyCode        = "";
    final public String branchCode          = "";
    final public String priorityCode        = "";
    final public String mdmCode             = "";
}
