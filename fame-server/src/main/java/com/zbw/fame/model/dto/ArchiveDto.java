package com.zbw.fame.model.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ArchiveDto {

    private String year;

    private List<ArticleInfoDto> articleInfos;
}
