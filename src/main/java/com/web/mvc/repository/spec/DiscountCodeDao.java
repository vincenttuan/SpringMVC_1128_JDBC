package com.web.mvc.repository.spec;

import com.web.mvc.entity.DiscountCode;
import java.util.List;

public interface DiscountCodeDao {
    // 相關 Discount Code CRUD 方法簽章
    List<DiscountCode> queryDiscountCode();
}
