package com.avio.customlogger.internal.model;

import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Summary;


public class ExceptionProperties {


    @Parameter
    @DisplayName("Status Code")
    @Summary("Exception Status Code")
    @Optional
    private String status_code;
    @Parameter
    @DisplayName("Type")
    @Summary("Type of Exception")
    @Optional
    private String type;
    @Parameter
    @DisplayName("Detail")
    @Summary("Exception Detail")
    @Optional
    private String detail;

    public String getStatus_code() {
        return status_code;
    }

    public String getType() {
        return type;
    }

    public String getDetail() {
        return detail;
    }

}
