package com.example.test;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.example.test.demos.web.RandomController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

@SpringBootTest
class TestApplicationTests {


    @Test
    public void testRomdom() throws ParseException {

//        String orderId = HttpUtil.get("http://localhost:8080/createRandom/orderId");
//        System.out.println("自动生成的"+"orderId："+orderId);
//        String itemId = HttpUtil.get("http://localhost:8080/createRandom/itemId");
//        System.out.println("自动生成的"+"itemId："+itemId);
//        String nsProductId = HttpUtil.get("http://localhost:8080/createRandom/nsProductId");
//        System.out.println("自动生成的"+"nsProductId："+nsProductId);
//        String title = HttpUtil.get("http://localhost:8080/createRandom/title");
//        System.out.println("自动生成的"+"title："+title);
//        String orderName = HttpUtil.get("http://localhost:8080/createRandom/orderName");
//        System.out.println("自动生成的"+"orderName："+orderName);
//
//        String time = HttpUtil.get("http://localhost:8080/createRandom/time");
//        System.out.println("自动生成的"+"time："+time);

    String createJson = HttpUtil.get("http://localhost:8080/createRandom/createJson");
    System.out.println(createJson);
    }
}
