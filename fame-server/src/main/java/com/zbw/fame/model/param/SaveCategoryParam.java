package com.zbw.fame.model.param;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class SaveCategoryParam {

    private Integer id;

    private Integer parentId;

    @NotBlank(message = "名称不允许为空")
    private String name;
}
