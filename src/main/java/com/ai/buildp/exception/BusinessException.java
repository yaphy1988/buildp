package com.ai.buildp.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BusinessException extends GenericException {

    private static final long serialVersionUID = 1L;
    private static Logger log = LogManager.getLogger(BusinessException.class);

    public BusinessException(String errorCode) {
        super(errorCode);
        this.errorCode = errorCode;
        this.writeBusinessException();
    }

    public BusinessException(String errorCode, String[] keyInfos) {
        super(errorCode);
        this.errorCode = errorCode;
        this.writeBusinessException();
    }

    public BusinessException(String errorCode, String keyInfo) {
        super(errorCode, keyInfo);
        this.errorCode = errorCode;
        this.writeBusinessException();
    }

    public BusinessException(String errorCode, String errorMessage, boolean notransfer) {
        super(errorCode);
        this.errorCode = errorCode;
        this.writeBusinessException();
    }

    private void writeBusinessException() {
    	log.error("业务异常编码：" + this.getErrorCode());
        log.error("业务异常信息：" + this.getErrorMessage());
    }
}
