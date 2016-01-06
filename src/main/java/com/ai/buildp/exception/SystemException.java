package com.ai.buildp.exception;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SystemException  extends GenericException {
    
	private static Logger log = LogManager.getLogger(SystemException.class);

    private static final long serialVersionUID = 1L;
    
    public SystemException(String message) {
        super(message);
        this.errorCode = "999999";
        this.errorMessage = message;
        this.writeSysException();
    }
    
    public SystemException(Exception oriEx) {
        super(oriEx);
        this.errOri = oriEx;
        this.errorCode = "999999";
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream p = new PrintStream(os);
        this.errOri.printStackTrace(p);
        this.writeSysException();
    }
    
    public SystemException(String message, Exception oriEx) {
        super(message, oriEx);
        this.errorCode = "999999";
        this.errorMessage = message;
        this.errOri = oriEx;
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream p = new PrintStream(os);
        this.errOri.printStackTrace(p);
        this.writeSysException();
    }
    
    private void writeSysException() { 
        log.error("系统异常编码:" + this.errorCode);
        log.error("系统异常信息:" + this.errorMessage); 
    }

}
