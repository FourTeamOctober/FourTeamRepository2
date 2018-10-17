package com.jk.controller.channel;


import com.jk.service.channel.ChannelFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChannelController {

    @Autowired
    private ChannelFeignService channelFeignService;
}
