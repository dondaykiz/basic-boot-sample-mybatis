package com.basic.test.service;

import com.basic.test.model.RequestParameter;
import com.basic.test.model.projectname.Member;

import java.util.List;

/**
 * 기본 SQL Service.
 * @author yjkim@ntels.com
 */
public interface BasicSQLService {
    /**
     * 멤버 조회.
     * @param requestParameter 멤버 객체
     * @return 조회된 멤버 객체
     * @throws Exception 예외
     */
    List<Member> getMember(RequestParameter requestParameter);
}
