package cn.edu.njuit.springbootfilmreview.service.impl;

import cn.edu.njuit.springbootfilmreview.dto.Account;
import cn.edu.njuit.springbootfilmreview.service.AccountService;
import cn.edu.njuit.springbootfilmreview.service.mapper.AccountMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author guzy
 * @Description 账户实现类
 * @Date 2022/5/23 14:44
 **/

@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    @Override
    public List<Account> getAllAccount() {
        return accountMapper.selectList(null);
    }
}
