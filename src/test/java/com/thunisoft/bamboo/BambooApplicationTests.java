package com.thunisoft.bamboo;

import java.io.IOException;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.alibaba.fastjson.JSONObject;
import com.thunisoft.bamboo.services.Impl.MsgServiceImp;
import com.thunisoft.bamboo.utils.HttpConnectionUtils;


@SpringBootTest
public class BambooApplicationTests {

    @Test
    public void test() {
        send();
    }

    void send(){
        MsgServiceImp msgService = new MsgServiceImp();
        String message = msgService.getMessageJson("花红叶瘦，寒风薄凉的温度，不禁嘲笑起曾经的鲜红。彼时，你说，为卿消得冰雪热，我的笑容便瞬间在脸上泛滥如花。");
        String resultMsg = null;
        try {
            resultMsg = HttpConnectionUtils.sendMsg(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
        JSONObject resultJson = JSONObject.parseObject(resultMsg);
        Integer code = resultJson.getInteger("code");
        System.out.println(resultJson.toString());
    }
    void get(){
        try {
            String message = HttpConnectionUtils.getMessage(
                    "http://172.16.34.115:8087/msg-main/api/message/receiver/" +
                            "110000100045199/v1/?&messageGroup=hfdf&"+
                            "startDate=2019-11-01%2000:00:00&endDate=2019-11-02%2000:00:00&" +
                            "limit=6&offset=0&context=凋碎路人囚拜的心灵");
            String message1 = HttpConnectionUtils.getMessage(
                    "http://172.16.34.115:8087/msg-main/api/message/count/receiver/110000100045199/v1?&messageGroup=hfdf");
            StringUtils.isBlank(message);
            System.out.println(message);
            System.out.println(message1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

