package cn.edu.njuit.springbootfilmreview.service;

import cn.edu.njuit.springbootfilmreview.dto.Account;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @Author guzy
 * @Description 账户业务层
 * @Date 2022/5/23 14:50
 **/
public interface AccountService extends IService<Account> {

    List<Account> getAllAccount();
}
