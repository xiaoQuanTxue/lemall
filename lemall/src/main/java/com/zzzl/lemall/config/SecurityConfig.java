package com.zzzl.lemall.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    //授权：设置权限（权限划分）和页面（四个菜单项）的访问关联
    //admin页面需要有admin权限
    //atricle页面需要有article权限

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        //关闭springsecurity阻止Frame
        http.headers().frameOptions().disable();

        //请求访问需要的权限
        //例如：admin-role   admin-permission     admin-list  ，特点admin-*
        http.authorizeRequests().antMatchers("/admin-role", "/admin-permission", "/admin-list").hasRole("admin")
                .antMatchers("/product-*").hasAnyRole("Shopkeeper", "admin")
                .antMatchers("/charts-*").hasRole("admin")
                .antMatchers("/order-*","/order-list0","/order-list1","/order-list2","/order-item").hasAnyRole("admin","Shopkeeper");


        // 登录页面表单提交时表示用户名和密码的请求参数是：username和password
        //loginPage()    表示登录页面，默认是/login

        //  开启登录页面---默认是  /login,springsecurity自带的-----500，产生密码没有被编译的异常
        //http.formLogin();

        //展示自定义的登录页面,/tologin请求与/login请求关联
        // /login提交表单默认的用户名和密码的请求参数是：username和password，还能验证登录失败/login?err，登录成功会跳转到首页
        http.formLogin().loginPage("/tologin").loginProcessingUrl("/login");

        //<form  action="/login" >  <input name="username"/>  <input name="password"/>


        //阻止网络攻击的检测----/tologin关联/login出现
        http.csrf().disable();

        //开启注销,默认访问/logout，有注销页面，当用户确认注销会跳转到/login?logout登录页面
        http.logout();

        //开启记住用户  存储在cookie中 默认有效期14天
        http.rememberMe();
    }

    //认证：用户和权限绑定
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //用户持久化：数据库、内存
        // springsecurity5.0+版本对于密码会进行不同规则的加密
        // passwordEncoder()
        //BCryptPasswordEncoder加密的格式对密码进行加密
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
                .withUser("v1").password(new BCryptPasswordEncoder().encode("1")).roles("Shopkeeper").and()
                .withUser("admin").password(new BCryptPasswordEncoder().encode("1")).roles("admin","Shopkeeper");

    }
}
