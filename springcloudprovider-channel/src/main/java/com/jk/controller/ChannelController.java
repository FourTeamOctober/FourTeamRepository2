package com.jk.controller;

import com.jk.mapper.ChannelMapper;
import com.jk.service.channel.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChannelController implements ChannelService {
    @Autowired
    private ChannelMapper channelMapper;
}
