package com.workflow.entity.activiti.exception;

import java.util.Map;

public class ConflictingRequestException extends BaseModelerRestException {

    private static final long serialVersionUID = 1L;

    public ConflictingRequestException(String s) {
        super(s);
    }

    public ConflictingRequestException(String message, String messageKey) {
        this(message);
        setMessageKey(messageKey);
    }

    public ConflictingRequestException(String message, String messageKey, Map<String, Object> customData) {
        this(message, messageKey);
        this.customData = customData;
    }

}
