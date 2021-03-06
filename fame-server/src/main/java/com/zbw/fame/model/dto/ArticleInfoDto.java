package com.zbw.fame.model.dto;

import com.zbw.fame.model.entity.Article;
import lombok.Data;

import java.util.Date;

@Data
public class ArticleInfoDto {

    public ArticleInfoDto() {
    }

    public ArticleInfoDto(Article article) {
        super();
        this.id = article.getId();
        this.title = article.getTitle();
        this.created = article.getCreated();
    }


    /**
     * id
     */
    private Integer id;

    /**
     * 内容标题
     */
    private String title;

    /**
     * 创建时间
     */
    private Date created;
}
