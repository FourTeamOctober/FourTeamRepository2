package com.jk.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jk.domain.channel.Channel;
import com.jk.mapper.ChannelMapper;
import com.jk.service.channel.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ChannelController implements ChannelService {

    @Autowired
    private ChannelMapper channelMapper;

    /**
     * 查询定制询价单
     * @return
     */
    @Override
    @GetMapping("getChannelList")
    public Map<String, Object> getChannelList(@RequestParam("channel") String channel) {
        //字符串转为json对象
        Channel channel1 = JSON.parseObject(channel, Channel.class);

        Map<String, Object> map = new HashMap<>();
        PageHelper.startPage(channel1.getPage(),channel1.getRows());

        List<Channel> channelList = channelMapper.getChannelList(channel1);
        Page p = (Page) channelList;
        long total = p.getTotal();
        map.put("rows",channelList);
        map.put("total",total);
        return map;
    }
}
