package com.example.test.demos.web;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@RestController
@RequestMapping("/createRandom")
public class RandomController {
    private Long orderId= 561845488L;
    private Long itemId= 1458954797L;
    private String nsProductId= "02C7C0E9C9B14258D9A4FBE0502D";
    private String title= "TrimTech™ - Upplev en nära och bekväm rakning utan irritation";
    private String orderName= "#23116760";
    private String nsOrderNo= "#0765D3C5D198DD5E359925DC";
    private String createdAt= "2023-06-06 07:24:36";
    private static int ID_Length=10;
    private static int Product_ID_Length=5;
    private static int Title_Length=25;
    private static long Time_Stamp=1234567L;


    @GetMapping("/createJson")
    private String createJson(){
        JSONObject json = JSONUtil.createObj()
                .put("orderId", createOrderId())
                .put("itemId", createItemId())
                .put(    "nsProductId",createNsProductId())
                .put("title",createTitle())
                .put("orderName",createOrderName())
                .put("nsOrderNo",createNsOrderNo())
                .put("itemId", createItemId())
                .put("time",createTime());
        return JSONUtil.toJsonStr(json);

    }

    private String getRandomLong(int len) {
        return RandomUtil.randomNumbers(len);
    }

    private String getRandomString(int len) {
        return RandomUtil.randomString(len);
    }
    @GetMapping("/orderId")
    private String createOrderId(){
        return orderId + getRandomLong(ID_Length);

    }

    @GetMapping("/itemId")
    private String createItemId(){
        return orderId + getRandomLong(ID_Length);
    }

    @GetMapping("/nsProductId")
    private String createNsProductId(){
        return getRandomString(Product_ID_Length) + getRandomLong(ID_Length);
    }

    @GetMapping("/title")
    private String createTitle(){
        return getRandomString(Title_Length);

    }
    @GetMapping("/orderName")
    private String createOrderName(){
        return "#"+getRandomLong(ID_Length);
    }
    @GetMapping("/nsOrderNo")
    private String createNsOrderNo(){
        return getRandomString(Product_ID_Length) + getRandomLong(ID_Length);
    }
    @GetMapping("/time")
    private String createTime(){

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //时间格式字符串
        // 转为时间戳
        LocalDateTime parseDate= LocalDateTime.parse(createdAt,formatter);
        // 改变时间
        long timestamp = parseDate.toInstant(ZoneOffset.of("+8")).toEpochMilli()+Time_Stamp;
        // 新时间
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault());
        // 新时间转为String
        return localDateTime.format(formatter);
    }



}
