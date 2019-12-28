package com.thunisoft.bamboo.services;

public interface IMsgService {
    /**
     * 返回推送消息平台的json数据
     * @return  推送消息平台的json数据
     */
    public String getMessageJson(String message);
}
