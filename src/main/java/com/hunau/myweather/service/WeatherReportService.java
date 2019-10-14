package com.hunau.myweather.service;

/**
 * @param $params$
 * @Description:
 * @Return: $returns$
 * @Author: 杨梦蝶
 * @单位：湖南农业大学物联网工程专业
 * @Date: $date$ $time$
 * 开发版本：综合练习V0.1
 */
import com.hunau.myweather.entity.Weather;
import com.hunau.myweather.entity.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class WeatherReportService {

    @Autowired
    private WeatherDataService weatherDataService;


    public Weather getDataByCityId(String cityId) {
        WeatherResponse response = weatherDataService.getDataByCityId(cityId);
        return response.getData();
    }
}
