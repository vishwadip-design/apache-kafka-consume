package com.enduser;

import com.enduser.constants.AppConstant;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

    @KafkaListener(topics =AppConstant.LOCATION_TOPIC_NAME,groupId = AppConstant.GROUP_ID)
    public void updateLocation(String value){
        System.out.println(value);
    }
}
