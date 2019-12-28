package com.thunisoft.bamboo.services;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.thunisoft.aap.msg.client.IThunisoftAAPMessage;
import com.thunisoft.aap.msg.client.bean.request.MessageSendParameter;
import com.thunisoft.aap.msg.client.exception.MessagePlatformException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceWrapper {
    /** logger */
    private static final Logger logger
            = LoggerFactory.getLogger(MessageServiceWrapper.class);
    private IThunisoftAAPMessage messageService;

    @Autowired
    public MessageServiceWrapper(IThunisoftAAPMessage messageService) {
        this.messageService = messageService;
    }

    /**
     * 只是使用示例，实例以源码为准
     */
    public boolean sendMessage() {
        MessageSendParameter param = new MessageSendParameter();
        /*
         设置消息接口请求参数
         param.setXxx()
        */
        try {
            String result = messageService.sendMessage(param);
            JSONObject object = JSON.parseObject(result);
            String code = object.getString("code");
            if ("211".equals(code) || "201".equals(code) || "200".equals(code)) {
                logger.info("发送消息成功：{}", result);
                return true;
            } else {
                logger.error("发送消息失败：{}", object.get("message"));
                return false;
            }
        } catch (MessagePlatformException exception) {
            logger.error("", exception);
            return false;
        }
    }
}