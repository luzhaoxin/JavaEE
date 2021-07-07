package com.zbw.fame.model.param;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class SaveTagParam {

    private Integer id;

    @NotBlank(message = "名称不允许为空")
    private String name;
}
