package com.liutiantian.zuul.feign;

import org.springframework.stereotype.Component;

@Component
public class UserFeignServiceImp implements UserFeignService {
    @Override
    public String getUserNameById(Integer id) {
        return "失败";
    }
}
