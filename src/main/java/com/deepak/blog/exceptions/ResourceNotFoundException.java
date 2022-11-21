package com.deepak.blog.exceptions;

import lombok.Getter;
import lombok.Setter;
import net.bytebuddy.implementation.bind.annotation.Super;
@Getter
@Setter
public class ResourceNotFoundException extends RuntimeException{
    String resourceName;
    String fieldName;
    long fieldValue;
    public ResourceNotFoundException(String resourceName,String fieldName,long fieldValue){
        super(String.format("%s not found with %s : %s ",resourceName,fieldName,fieldValue));
        this.fieldName=fieldName;
        this.resourceName=resourceName;
        this.fieldValue=fieldValue;
    }

}
