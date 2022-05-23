package cn.edu.njuit.springbootfilmreview.service.mapper;

import cn.edu.njuit.springbootfilmreview.dto.Account;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface AccountMapper extends BaseMapper<Account> {
}
