package com.jk.service.channel;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("service-channel")
public interface ChannelFeignService extends ChannelService{
}
