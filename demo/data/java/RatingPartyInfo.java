package com.iquantex.ts.cre.data.model;

import com.iquantex.ts.cre.data.process.message.protobuf.REDataRating;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RatingPartyInfo {

    private List<String> ratingPartyList;

    public RatingPartyInfo parserPbBean(REDataRating.RatingPartyInfo bean) {
        RatingPartyInfo value = this;
        value.setRatingPartyList(bean.getRatingPartyListList());
        return value;
    }

}
