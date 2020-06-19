package com.basic.test.service;

import com.basic.test.dao.BasicSQLDao;
import com.basic.test.model.RequestParameter;
import com.basic.test.model.projectname.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 기본 SQL Service Impl.
 * @author yjkim@ntels.com
 */
@Service
public class BasicSQLServiceImpl implements BasicSQLService {
    @Autowired
    BasicSQLDao basicSQLDao;

    @Override
    public List<Member> getMember(RequestParameter requestParameter) {
        return basicSQLDao.getMember(requestParameter);
    }
}
