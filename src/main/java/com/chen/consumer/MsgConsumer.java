package com.chen.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @Auther: hemingyang
 * @Date: 2021/10/14 15:18
 * @Description:
 */
@Component
public class MsgConsumer {


    /**
     * Description:  消费广播形式
     * @auther: hemingyang
     * @param: [content]
     * @return: void
     * @date: 2021/10/14 15:24
     */
    @KafkaListener(topics = {"topic-1","flight-events"})
    public void processMessage(String content) {

        System.out.println("消息被消费"+content);
    }



}