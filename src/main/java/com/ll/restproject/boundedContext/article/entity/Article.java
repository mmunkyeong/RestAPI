package com.ll.restproject.boundedContext.article.entity;


import com.ll.restproject.base.entity.BaseEntity;
import com.ll.restproject.boundedContext.member.entity.Member;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
public class Article extends BaseEntity {
    @ManyToOne
    private Member author;
    private String subject;
    private String content;
}