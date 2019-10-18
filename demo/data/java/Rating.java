package com.iquantex.ts.cre.data.model;

import com.iquantex.ts.cre.data.process.message.protobuf.REDataCommon;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Rating {

    public final static String NULL_RATING = "NULL";

    /**
     * 评级发布时间
     */
    private Date time;

    /**
     * 评级结果
     */
    private String rating;

    /**
     * 评级结果权重（用于比较评级结果）
     */
    private Integer weight;

    public Rating parserPbBean(REDataCommon.Rating bean) {
        Rating value = this;
        value.setTime(new Date(bean.getTime()));
        value.setRating(bean.getRating());
        value.setWeight(bean.getWeight());
        return value;
    }

}
