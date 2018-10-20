package com.jk.domain.channel;

import com.jk.util.PageUtil;
import lombok.Data;

import java.io.Serializable;

/**
 * 定制询价单
 */
@Data
@lombok.ToString
public class Channel extends PageUtil implements Serializable {
    private static final long serialVersionUID = -8448275737828376837L;
    /**
     * 项目编码
     */
    private String channelId;
    /**
     * 项目名称
     */

    private String channelName;
    /**
     * 采购商名称
     */
    private String purchaser;
    /**
     * 参与数/总数
     */
    private String amount;
    /**
     * 平均结算价
      */
    private String avgSettlement;
    /**
     * 成交结算价
      */
    private String settlement;
    /**
     * 平均交易价
     */
    private String avgTrading;
    /**
     * 成交交易价
      */
    private String trading;
    /**
     * 发布时间
      */
    private String releaseTime;
    /**
     * 项目状态
      */
    private String state;



}
