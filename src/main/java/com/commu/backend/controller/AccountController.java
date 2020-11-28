package com.commu.backend.controller;

import com.commu.backend.common.CommonResponse;
import com.commu.backend.dto.account.AccountRequest;
import com.commu.backend.service.AccountService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(CommunityApiPath.baseUrl)
public class AccountController {

    public AccountService accountService;

    public AccountController(AccountService service) {
        this.accountService = service;
    }

    @PostMapping(CommunityApiPath.Account.login)
    public CommonResponse<Void> login(@RequestBody AccountRequest body) {
        accountService.login(body.id, body.pw);
        return CommonResponse.success();
    }
}
