package com.zbw.fame.service;

import com.zbw.fame.BaseTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


@Slf4j
public class SysOptionServiceTest extends BaseTest {

    @Autowired
    private SysOptionService sysOptionService;

    @Test
    public void getAllOptionMap() {
        log.info("{}", sysOptionService.getAllOptionMap());
    }

    @Test
    public void save() {
        sysOptionService.save("new_option", "new123");
    }
}
