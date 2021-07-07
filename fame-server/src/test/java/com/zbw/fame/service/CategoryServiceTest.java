package com.zbw.fame.service;

import com.zbw.fame.BaseTest;
import com.zbw.fame.model.dto.CategoryInfoDto;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
public class CategoryServiceTest extends BaseTest {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void listCategoryInfo() {
        List<CategoryInfoDto> categoryInfoDtos = categoryService.listCategoryInfo(false);
        log.info("{}", categoryInfoDtos);
    }
}
