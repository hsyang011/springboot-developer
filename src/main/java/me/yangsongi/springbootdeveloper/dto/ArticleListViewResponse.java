package me.yangsongi.springbootdeveloper.dto;

import lombok.Getter;
import me.yangsongi.springbootdeveloper.domain.Article;

import java.time.LocalDateTime;

@Getter
public class ArticleListViewResponse {

    private final Long id;
    private final String title;
    private final String content;
    private LocalDateTime createdAt;

    public ArticleListViewResponse(Article article) {
        this.id = article.getId();
        this.title = article.getTitle();
        this.content = article.getContent();
        this.createdAt = article.getCreatedAt();
    }

}
