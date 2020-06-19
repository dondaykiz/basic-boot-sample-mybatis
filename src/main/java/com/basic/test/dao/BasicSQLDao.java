package com.basic.test.dao;

import com.basic.test.model.RequestParameter;
import com.basic.test.model.projectname.Member;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 기본 SQL DAO.
 * @author yjkim@ntels.com
 */
@Component
public interface BasicSQLDao {
    /**
     * 멤버 조회.
     * @param requestParameter requestParameter
     * @return member
     * @throws Exception 예외 처리
     */
    List<Member> getMember(RequestParameter requestParameter);
}
