package com.zbw.fame.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Category extends BaseEntity {

    private Integer parentId;

    private String name;
}
