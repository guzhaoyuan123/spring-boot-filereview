package cn.edu.njuit.springbootfilmreview.dto;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author guzy
 * @Description 账户类
 * @Date 2022/5/23 14:38
 **/

@Data
@TableName("account_info")
public class Account {

    @TableId
    Long id;
    String username;
    String password;
    Integer status;
}
