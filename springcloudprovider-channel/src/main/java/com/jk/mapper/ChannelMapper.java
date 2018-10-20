package com.jk.mapper;

import com.jk.domain.channel.Channel;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface ChannelMapper {
    /**
     * 查询定制询价单
     * @return
     */
    @Select("<script>"+
            "SELECT " +
            " tp.product_id AS channelId,"+
            " tp.product_name AS channelName,"+
            " tp.state AS state"+
            " FROM t_product tp"+
            " <where>" +
            " <if test='null != channelName and \"\" != channelName'>" +
            " and tp.product_name like concat('%', #{channelName}, '%')" +
            " </if>" +
            " <if test='0 != state and null != state' >" +
            " and tp.state = #{state}" +
            " </if>" +
            " </where>" +
               "</script>")
    List<Channel> getChannelList(Channel channel);
}
