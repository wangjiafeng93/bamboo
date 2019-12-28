package com.thunisoft.bamboo.services.Impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.thunisoft.bamboo.services.IMsgService;

@Service
public class MsgServiceImp implements IMsgService {

    private static final String SENDMODE = "sendMode";
    private static final String SENDER = "sender";
    private static final String USERID = "userId";
    private static final String RECEIVERS = "receivers";
    /**
     * 返回推送消息平台的json数据
     * @return  推送消息平台的json数据
     */
    public String getMessageJson(String message) {
        Map<String, Object> map = new HashMap<String, Object>();
        //消息发送者
        map.put(SENDER, "110000100044883");
        //消息来源单位id---
        map.put("corpId", 1001);
		map.put("sendMode", "1");//发送方式    例如 ： 1站内消息2cocall等 支持1;2
        map.put("msgConfigId", "hfdf");//消息标识
        map.put("message", message);//消息主体
        //消息发送方式为1的消息接受者

//        List<Map<String, Object>> receiversList = new ArrayList<>();
//        Map<String,Object> cell = new HashMap<String,Object>();
//        cell.put(USERID, "110000100045199");
//        receiversList.add(cell);
        List<Map<String, Object>> toWeb = new ArrayList<Map<String,Object>>();
        Map<String,Object> tempMap = new HashMap<String,Object>();
        tempMap.put(USERID, "110000100045199");
        toWeb.add(tempMap);

        JSONObject json = null;
        if (!CollectionUtils.isEmpty(toWeb)) {
            Map<String, Object> toWebMap = new HashMap<String, Object>(map);
            toWebMap.put(RECEIVERS, toWeb);
            toWebMap.put(SENDMODE, "1");
            json = new JSONObject(toWebMap);
        }
        //根据消息表示推送所有的海淀院人员
        return json.toJSONString();
    }
}
