package com.web.mvc.repository;

import com.web.mvc.entity.PUView;
import com.web.mvc.repository.spec.PUViewDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class PUViewDaoImpl implements PUViewDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Override
    public List<PUView> queryPUView() {
        String sql = "SELECT * FROM PU_VIEW";
        List<PUView> list = jdbcTemplate.query(sql, RM.puViewMapper);
        return list;
    }

    @Override
    public List<PUView> queryPUViewByProductCodeName(String productCodeName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
