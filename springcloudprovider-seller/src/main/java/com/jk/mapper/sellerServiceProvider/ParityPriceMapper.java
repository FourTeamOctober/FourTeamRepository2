package com.jk.mapper.sellerServiceProvider;

import com.jk.domain.sellerServiceProvider.ParityPrice;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ParityPriceMapper {
    @Select("<script>" +
            "select ty.inquiry_sheet_id as ratiopriceId ," +
            "ty.product_id as ratiopriceNumber ," +
            "tp.product_id as ratiopriceCoding ," +
            "tp.product_name as ratiopriceName ," +
            "ty.channle_id as ratiopriceChannel ," +
            "tr.range_id as ratiopriceChannelNumber ," +
            "tr.range_name as ratiopriceChannelName ," +
            "ts.inquiry_sheet_id as ratiopriceMapId ," +
            "date_format(ts.create_time, '%Y-%m-%d') as ratiopriceStartTime ," +
            "date_format(ts.end_time, '%Y-%m-%d') as ratiopriceEndTime ," +
            "ty.t_status as ratiopriceState " +
            "from t_inquiry ty " +
            "left join t_product tp on ty.product_id = tp.product_id "+
            "left join t_range tr on ty.channle_id = tr.range_id "+
            "left join t_inquiry_sheet ts on ty.inquiry_sheet_id = ts.inquiry_sheet_id "+
            " <where>"+
            " <if test='null != ratiopriceName and \"\" != ratiopriceName'>"+
            " and tp.product_name like concat('%', #{ratiopriceName}, '%')"+
            " </if>"+
            " <if test='-1 != ratiopriceChannel' >"+
            " and ty.channle_id = #{ratiopriceChannel}"+
            " </if>"+
            " <if test='-1 != ratiopriceState' >"+
            " and ty.t_status = #{ratiopriceState}"+
            " </if>"+
            " <if test='null != ratiopriceStartTime and \"\" != ratiopriceStartTime'>"+
            " and date_format(ts.create_time, '%Y-%m-%d') = date_format(#{ratiopriceStartTime}, '%Y-%m-%d')"+
            " </if>"+
            " <if test='null != ratiopriceEndTime and \"\" != ratiopriceEndTime'>"+
            " and date_format(ts.end_time, '%Y-%m-%d') = date_format(#{ratiopriceEndTime}, '%Y-%m-%d')"+
            " </if>"+
            " </where>"+
            " </script>" )
    List<ParityPrice> parityPriceList(ParityPrice parityPrice1);

    @Update("UPDATE t_inquiry SET t_status= 2 WHERE inquiry_sheet_id=#{ratiopriceId}")
    void parityPriceById(ParityPrice parityPrice);
}
