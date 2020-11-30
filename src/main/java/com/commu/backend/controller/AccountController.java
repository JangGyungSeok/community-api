package com.commu.backend.controller;

import com.commu.backend.common.CommonResponse;
import com.commu.backend.dto.account.AccountRequest;
import com.commu.backend.service.AccountService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(CommunityApiPath.baseUrl)
@Log4j2
public class AccountController {

    public AccountService accountService;

    public AccountController(AccountService service) {
        this.accountService = service;
    }

    @PostMapping(CommunityApiPath.Account.login)
    public CommonResponse<Void> login(@RequestBody AccountRequest body) {
    	log.info("asd");
        accountService.login(body.id, body.pw);
        return CommonResponse.success();
    }
}
