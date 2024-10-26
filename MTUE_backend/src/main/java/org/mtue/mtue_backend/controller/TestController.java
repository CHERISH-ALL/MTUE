package org.mtue.mtue_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
/**
 * @Title: TestController
 * @Package org.mtue.mtue_backend.controller
 * @Date 2024/10/26 16:38
 * @description: 测试项目生成
 */

@RestController
@RequestMapping("test")
public class TestController {
    @GetMapping
    public Map<String, Object> test() {
        Map<String,Object> map =new HashMap<>();
        map.put("code",201);
        map.put("message","hello world!");
        map.put("data","接口测试成功");
        return map;
    }
}
