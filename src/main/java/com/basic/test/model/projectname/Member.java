package com.basic.test.model.projectname;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 테스트 Member 모델.
 *
 * @author yjkim@ntels.com
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Member {
    /**
     * Idx.
     */
    private Integer idx;
    /**
     * 아이디.
     */
    private String userId;
    /**
     * 이름.
     */
    private String userName;
    /**
     * 패스워드.
     */
    private String userPw;
    /**
     * 이메일.
     */
    private String userEmail;
    /**
     * 번호.
     */
    private String userPhone;

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
}
