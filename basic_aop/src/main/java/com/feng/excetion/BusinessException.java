package com.feng.excetion;

/**
 * @desc：业务异常
 * @title：BusinessException
 * @author: tianfengluyao
 * @date: 2019/2/14 17:06
 */
public class BusinessException extends RuntimeException{

    private String resultCode;
    private String resultNode;
    private String description;

    public BusinessException(String resultCode, String resultNode, String description) {
        this.resultCode = resultCode;
        this.resultNode = resultNode;
        this.description = description;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultNode() {
        return resultNode;
    }

    public void setResultNode(String resultNode) {
        this.resultNode = resultNode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
