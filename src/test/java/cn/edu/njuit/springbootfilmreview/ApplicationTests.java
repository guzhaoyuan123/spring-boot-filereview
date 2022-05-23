package cn.edu.njuit.springbootfilmreview;

import cn.edu.njuit.springbootfilmreview.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {


    @Autowired
    AccountService accountService;
    @Test
    void contextLoads() {
        System.out.println(accountService.getAllAccount());
    }

}
