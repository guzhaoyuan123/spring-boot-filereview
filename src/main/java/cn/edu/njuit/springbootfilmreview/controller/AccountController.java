package cn.edu.njuit.springbootfilmreview.controller;

import cn.edu.njuit.springbootfilmreview.service.AccountService;
import cn.edu.njuit.springbootfilmreview.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author guzy
 * @Description 账户接口层
 * @Date 2022/5/23 14:52
 **/

@RestController
@RequestMapping("/api")
@Api(value = "账户接口", tags = "账户接口")
public class AccountController {

    //    @ApiImplicitParams({
//            @ApiImplicitParam(value = "昵称",name = "name",dataType = "String",required = true),
//            @ApiImplicitParam(value = "年龄",name = "age",dataType = "int",required = true)
//    })


    @Autowired
    AccountService accountService;

    @ApiOperation(value = "查找全部")
    @GetMapping("/list")
    public Result getAllAccount() {
        return Result.success(accountService.getAllAccount());
    }
}
