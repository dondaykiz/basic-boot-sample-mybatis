package com.basic.test.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * 조회성 요청 공통 규격.
 *
 * @author yjkim@ntels.com
 */
public class RequestParameter {

    /**
     * 아이디.
     */
    private String id;

    /**
     * 최대 응답 레코드 수.
     */
    @Min(value = 0, message = "{notvalid.requestparameter.limit}")
    @Max(value = 1000, message = "{notvalid.requestparameter.limit}")
    private int limit = 10;

    /**
     * 건너 띌 레코드 수.
     */
    @Min(value = 0, message = "{notvalid.requestparameter.offset}")
    private long offset;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public long getOffset() {
        return offset;
    }

    public void setOffset(long offset) {
        this.offset = offset;
    }
}
