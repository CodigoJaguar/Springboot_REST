package com.fundamentosPlatzi.springboot.fundamentos.bean;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

public class MyOwnBeanImplement implements MyOwnBean{
    //private final Log LOGGER = LogFactory.getLog(FundamentosApplication.class);
    private final Log LOGGER = LogFactory.getLog(MyOwnBeanImplement.class);
    @Override
    public void printMyMessage() {
        try{
            // error
            int value = 10/0;
            LOGGER.debug("Mi valor de value: "+value);
        }catch (Exception e){
            LOGGER.error("Esto es un error al dividir por cero dentro de MyOwnBeanImplement: "+ e.getMessage());
        }finally {
            System.out.println("I have a dream, My data scientist job come true");
        }

    }
}
