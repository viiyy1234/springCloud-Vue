package com.example.springcloudcommon.base.base.domain;

import com.example.springcloudcommon.base.constants.StringConstant;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

/**
 * <p>className: DataMsg</p>
 * <p>description: 数据响应对象</p>
 *
 * @author tengfei
 * @version 1.0
 * @date 2019-10-30 13:45
 */
public class DataMsg<T> implements Serializable{

    private String message;

    private String success = StringConstant.TRUE;

    private T data;

    public DataMsg() {
    }

    public DataMsg(String message, String success, T data) {
        this.message = message;
        this.success = success;
        this.data = data;
    }


    public DataMsg(String message, String success) {
        this.message = message;
        this.success = success;
    }

    public static DataMsg successMsg(String message) {
        return new DataMsg(StringUtils.isEmpty(message) ? "成功" : message,StringConstant.TRUE);
    }

    public static DataMsg failMsg(String message) {
        return new DataMsg(StringUtils.isEmpty(message) ? "失败" : message, StringConstant.FALSE);
    }

    public void fail(String errorMessage) {
        this.success = StringConstant.FALSE;
        this.message = errorMessage;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
