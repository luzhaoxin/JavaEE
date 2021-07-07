package com.zbw.fame.service;


import com.zbw.fame.model.entity.Comment;

/**
 * 发送邮件 Service 接口
 */
public interface EmailService {

    /**
     * 发送邮件给管理员
     *
     * @param comment 回复的Comment信息
     */
    void sendEmailToAdmin(Comment comment);

    /**
     * 发送邮件给被评论的用户
     *
     * @param comment   评论的Comment信息
     * @param replyEmail 被评论人邮箱
     */
    void sendEmailToUser(Comment comment, String replyEmail);
}
