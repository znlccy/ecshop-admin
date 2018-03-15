package com.znlccy.ecshop.utils;

import com.znlccy.ecshop.tools.NormalTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * @CreateTime:2018/3/14 18:24
 * @Author:Administrator
 * @Version:v-1.0.0
 * @Comment: 发送邮件工具
 */
@Component
public class SendEmailUtils {

    /**
     * 注入javaMailSender
     */
    @Autowired
    private JavaMailSender javaMailSender;

    /**
     * 发送邮件者
     */
    @Value("${spring.mail.username}")
    private String userName;

    /**
     * @comment: sendNormalEmail 发送普通邮件
     * @param: [title, titleWithName, content, contentWithName, email]
     * @return: void
     */
    private void sendNormalEmail(String title, boolean titleWithName, String content, boolean contentWithName, String email) {
        String emailTitle = "ZC公司购物商城";
        MimeMessage mimeMessage = null;
        try {
            /*创建要发送的信息*/
            mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
            /*设置谁发送的*/
            helper.setFrom(new InternetAddress(userName, emailTitle, "UTF-8"));
            /*设置发送给谁 [接收者的邮箱]*/
            helper.setTo(email);
            title = titleWithName? title + "-" + emailTitle:title;
            /*发送邮件的辩题*/
            helper.setSubject(title);
            if (contentWithName) {
                content += "<p style='text-align:right'>"+emailTitle+"</p>";
                content += "<p style='text-align:right'>"+ NormalTools.currentDate("yyyy-MM-dd HH:mm:ss")+"</p>";
            }
            /*发送的内容是否为html*/
            helper.setText(content, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        javaMailSender.send(mimeMessage);
    }

    /**
     * @comment: sendRegisterCode 发送验证码,注册时的验证码
     * @param: [email, code]
     * @return: void
     */
    public void sendRegisterCode(final String email, String code) {
        /*实例化一个StringBuffer*/
        final StringBuffer sb = new StringBuffer();
        sb.append("<h2>"+email+",您好!</h2>")
                .append("<p>此次的验证码是:"+code+"</p>");
        new Thread(new Runnable() {
            @Override
            public void run() {
                sendNormalEmail("验证码", true, sb.toString(), true, email);
            }
        }).start();
    }

    /**
     * @comment: sendRegisterSuccess 注册成功时提示邮件
     * @param: [email, password, url]
     * @return: void
     */
    public void sendRegisterSuccess(final String email, String password, String url) {
        /*实例化一个StringBuffer*/
        final StringBuffer sb = new StringBuffer();
        sb.append("<h3>恭喜您，注册成功!<h3>")
            .append("<h2>初始密码是:<b style='color:#F00'>").append(password).append("</b>，请不要告诉任何人!</h2>")
            .append("请及时<a href='").append(url).append("'登录网站</a>修改密码.");
        new Thread(new Runnable() {
            @Override
            public void run() {
                sendNormalEmail("注册成功", true, sb.toString(), true, email);
            }
        }).start();
    }

    /**
     * @comment: sendFindPwdSuccess 发送找回密码成功提示
     * @param: [email, password, url]
     * @return: void
     */
    public void sendFindPwdSuccess(final String email, String password, String url) {
        /*实例化一个StringBuffer对象*/
        final StringBuffer sb = new StringBuffer();
        sb.append("<h3>恭喜您，密码找回成功!</h3>")
            .append("<h2>系统随机密码是:<b style='color:#F00'>").append(password).append("</b>请不要告诉任何人!</h2>")
            .append("请及时<a href='").append(url).append("'>登录网站</a>修改密码.");
        new Thread(new Runnable() {
            @Override
            public void run() {
                sendNormalEmail("成功找回密码", true, sb.toString(), true, email);
            }
        }).start();
    }

    /**
     * @comment: sendOnRegister 新用户注册通过邮件提示
     * @param: [email, nickName, regEmail, url]
     * @return: void
     */
    public void sendOnRegister(final String email, String nickName, String regEmail, String url) {
        /*实例化一个StringBuffer对象*/
        final StringBuffer sb = new StringBuffer();
        sb.append("<a href='").append(url).append("'><h1>姓名:").append(nickName).append("</h1></a>");
        sb.append("<h3>注册邮箱:").append(regEmail).append("</h3>");
        new Thread(new Runnable() {
            @Override
            public void run() {
                sendNormalEmail("新用户注册通知", true, sb.toString(), true, email);
            }
        }).start();
    }
}
