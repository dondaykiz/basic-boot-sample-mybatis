package com.basic.test.controller;

import com.basic.test.exception.InvalidRequestException;
import com.basic.test.model.ApiResponse;
import com.basic.test.model.RequestParameter;
import com.basic.test.model.projectname.Member;
import com.basic.test.service.BasicSQLService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Basic Controller.
 * API ID : xxxx, xxxx01, xxxx02...
 *
 * @author yjkim@ntels.com
 */
@RestController
@RequestMapping(headers = "Accept=application/json")
public class BasicSQLController {
    public static final String storageConnectionString = "DefaultEndpointsProtocol=https;AccountName=yjkimrgdiag;AccountKey=ADxU14b7Nn1zTkow3z48fNetH+h4uA1hv4SGvY0NPUgYh8oANFrB3nlQdwGYi5/7gGvYTXV9QtXbMYtUUFQV/Q==;EndpointSuffix=core.windows.net";

    /**
     * Logger.
     */
    private static Logger logger = LoggerFactory.getLogger(BasicSQLController.class);

    @Autowired
    BasicSQLService basicSQLService;

    @GetMapping(value = "/member")
    public ApiResponse getMember(@Validated() RequestParameter requestParameter, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new InvalidRequestException(bindingResult);
        }

        logger.debug("RequestParams >>> " + requestParameter.getId());

        ApiResponse apiResponse = new ApiResponse();
        List<Member> result = basicSQLService.getMember(requestParameter);
        apiResponse.setResultData(result);

        return apiResponse;
    }

    @PostMapping(value = "/member")
    public void addMember(Member member) {

    }

    @PutMapping()
    public void modifyMember() {

    }

    @DeleteMapping()
    public void removeMember() {

    }
}
