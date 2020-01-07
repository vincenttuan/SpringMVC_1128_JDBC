package com.web.mvc.repository;

import com.web.mvc.entity.DiscountCode;
import com.web.mvc.entity.MicroMarket;
import java.sql.ResultSet;
import org.springframework.jdbc.core.RowMapper;

public class RM {
    static RowMapper<DiscountCode> discountCode = (rs, i) -> {
        DiscountCode dc = new DiscountCode();
        dc.setDiscountCode(rs.getString("DISCOUNT_CODE"));
        dc.setRate(rs.getDouble("RATE"));
        return dc;
    };
    
    static RowMapper<MicroMarket> microMarketMapper = (ResultSet rs, int rowNum) -> {
        MicroMarket mm = new MicroMarket();
        mm.setZipCode(rs.getString("ZIP_CODE"));
        mm.setRadius(rs.getDouble("RADIUS"));
        mm.setAreaLength(rs.getDouble("AREA_LENGTH"));
        mm.setAreaWidth(rs.getDouble("AREA_WIDTH"));
        return mm;
    };
    
}
