package com.jk.controller.channel;


import com.jk.service.channel.ChannelFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("app/channel")
public class ChannelController {

    @Autowired
    private ChannelFeignService channelFeignService;


    /**
     * 查询定制询价单
     * @return
     */
    @GetMapping("getChannelList")
    public Map<String,Object> getChannelList(@RequestParam(value = "channel") String channel){
        Map<String,Object> map = channelFeignService.getChannelList(channel);
        return map;
    }

    /**
     *
     */
}
