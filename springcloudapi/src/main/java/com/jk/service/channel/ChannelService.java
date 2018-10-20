package com.jk.service.channel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@RequestMapping("channel")
public interface ChannelService {

    /**
     * 查询定制询价单
     * @return
     */
    @GetMapping("getChannelList")
    Map<String, Object> getChannelList(@RequestParam(value = "channel") String channel);
}
