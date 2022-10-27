package com.ventoss.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Date:2022/8/10
 * Author:Vent
 * Description:
 **/
@ResponseStatus(value = HttpStatus.FORBIDDEN,reason = "用户数量太多了")
public class UserTooManyException extends RuntimeException{
    public UserTooManyException(){

    }

    public  UserTooManyException(String message){
        super(message);
    }

}
