package com.hunau.myweather.entity;

/**
 * @param $params$
 * @Description:
 * @Return: $returns$
 * @Author: 曹佳怡
 * @单位：湖南农业大学物联网工程专业
 * @Date: $date$ $time$
 * 开发版本：综合练习V0.1
 */

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Weather implements Serializable {



    /**
     * 城市
     */
    private String city;

    /**
     * 空气质量指数
     */
    private String aqi;

    /**
     * 温度
     */
    private String wendu;

    /**
     * 感冒指数
     */
    private String ganmao;

    private Yesterday yesterday;

    private List<Forecast> forecast;
}
