package com.zzzl.lemall.controller;

import com.zzzl.lemall.domain.Good;
import com.zzzl.lemall.domain.User;
import com.zzzl.lemall.service.HouTaiService;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import javax.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/30 8:43
 * 4
 */
@Controller

public class NavigationController implements ServletContextAware {

    private ServletContext servletContext;


    @Autowired
    private HouTaiService houTaiService;


//    @Autowired
//    private

//    @Autowired
//    private UsersService usersService;
//
//    @Autowired
//    private InstitutionService institutionService;
//
//    @Autowired
//    private CourseService courseService;


    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/tologin")
    public String toLogin() {
        return "login";
    }

    @RequestMapping("/welcome")
    public String toWelcome() {
        return "welcome";
    }


    //    获取商家的商品
    @RequestMapping("/good-list")
    public String toProductBrand(Model model) {
//        System.out.println("成功访问....获取所有商品的controller");


        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String name = authentication.getName();
        String id = name.substring(1);
        Integer i = Integer.parseInt(id);

        List<Good> all = houTaiService.selectByVendorId(i);
//        System.out.println(all);
        model.addAttribute("allproduct", all);
        return "product/product-list";
    }

    //跳转到添加商品
    @RequestMapping("/togoodadd")
    public String addproduct() {

        return "product/product-add";
    }


    //   新增商品
    @RequestMapping("/addgood")
    public String addGood(Model model, String goodName,
                          BigDecimal goodCurrentPrice,
                          Integer goodInventory, String goodDescribe,
                          String fname,
                          @RequestParam("file") MultipartFile file) {

        Good good = new Good();
        good.setGoodName(goodName);
        good.setGoodCurrentPrice(goodCurrentPrice);
        good.setGoodInventory(goodInventory);
        good.setGoodDescribe(goodDescribe);
        good.setGoodState("1");

        Date date = new Date();
//        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        String format = sf.format(date);
        good.setGoodUpDate(date);


        System.out.println("controller   good--------------" + good);
        System.out.println("fname------------" + fname);
        houTaiService.addGood(good);
        houTaiService.addGOODImg(good);


        //name：图片的名称
        //判断file是否为null
        if (!file.isEmpty()) {
            //不为空才执行上传
            try {
                //获取文件的字节数组
                byte[] bytes = file.getBytes();
                //创建file，文件上传之后的位置和名称
                String realPath = servletContext.getRealPath("/upload");
                System.out.println("servletContext.getRealPath" + realPath);
                String realPath1 = servletContext.getRealPath("src/main/resources/upload/");
                System.out.println("realPath1--------" + realPath1);

                File f = new File(servletContext.getRealPath("src/main/resources/upload/") + fname);
                System.out.println("-----------------");

                String property = System.getProperty("user.dir");
                Properties properties = System.getProperties();
                properties.list(System.out);
                System.out.println("-----------------");
                System.out.println("System.getProperty" + property);

//                File f = new File("C:\\Users\\admin\\Desktop\\新建文件夹\\ " + name);
                //写入
                FileUtils.writeByteArrayToFile(f, bytes);
                //上传成功
                model.addAttribute("msg", fname + "上传成功!");

                System.out.println("上传成功");

            } catch (IOException e) {
                e.printStackTrace();
                //上传失败
                model.addAttribute("msg", fname + "上传失败！");


                System.out.println("上传失败");

            }
        }

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String namee = authentication.getName();
        String id = namee.substring(1);
        Integer i = Integer.parseInt(id);

        System.out.println("i--------------" + i);

        List<Good> all = houTaiService.selectByVendorId(i);
//        System.out.println(all);
        model.addAttribute("allproduct", all);

        return "product/product-list";


    }

    //    根据商品名模糊查询
    @RequestMapping("/selecProductName")
    public String selectByNme(Model model, String keys) {
        List<Good> goods = houTaiService.selectByName(keys);
//        System.out.println(goods);
        model.addAttribute("allproduct", goods);
        return "product/product-list";

    }

    //通过商品id更新
    @RequestMapping("/updateproduct")
    public String updateGoodById(Model model, Good good) {
        System.out.println(good);
        houTaiService.UpdateGoodById(good);

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String name = authentication.getName();
        String id = name.substring(1);
        Integer i = Integer.parseInt(id);

        List<Good> all = houTaiService.selectByVendorId(i);

//        System.out.println(all);
        model.addAttribute("allproduct", all);
        return "product/product-list";
    }

    //    通过商品id删除
    @RequestMapping("/deleteById")
    @ResponseBody
    public String deleteById(Model model, Integer id) {
        System.out.println("id---------" + id);
        houTaiService.deleteGoodById(id);
        List<Good> all = houTaiService.selectByVendorId(1);
//        System.out.println(all);
        model.addAttribute("allproduct", all);
        return "删除成功";
    }

    //    通过商品id数组删除
    @RequestMapping("/delInIds")
    @ResponseBody
    public String delInIds(Integer[] ids) {
        System.out.println(ids);
        if (ids.length != 0) {
            houTaiService.delInIds(Arrays.asList(ids));
            return "true";
        } else return "false";

    }

    //商品结束


//    用户开始


    //    获取所有用户
    @RequestMapping("/user-list")
    public String toUserBrand(Model model) {
//        System.out.println("成功访问....获取所有商品的controller");


        List<User> all = houTaiService.getAllUser();
//        System.out.println(all);
        model.addAttribute("alluser", all);
        return "user/user-list";
    }

    //    获取所有已删除用户
    @RequestMapping("/user-del")
    public String toUserBrand2(Model model) {
//        System.out.println("成功访问....获取所有商品的controller");


        List<User> all = houTaiService.getAllUserdel();
//        System.out.println(all);
        model.addAttribute("alluser2", all);
        return "user/user-del";
    }


    //    根据用户名模糊查询
    @RequestMapping("/selectUserName")
    public String selectUserByNme(Model model, String keys) {
        List<User> users = houTaiService.selectUserByName(keys);
//        System.out.println(users);
        model.addAttribute("alluser", users);
        return "user/user-list";

    }


    //跳转到添加用户
    @RequestMapping("/touseradd")
    public String adduser() {

        return "user/user-add";
    }

    //    根据用户id更新用户信息
    @RequestMapping("/updateuser")
    public String updateUserById(Model model, User user) {
        houTaiService.updateUserById(user);
        List<User> all = houTaiService.getAllUser();
//        System.out.println(all);
        model.addAttribute("alluser", all);
        return "user/user-list";
    }

    //        通过用户id删除
    @RequestMapping("/deleteUserById")
    @ResponseBody
    public String deleteUserById(Model model, Integer id) {
        System.out.println("id---------" + id);
        houTaiService.deleteUserById(id);
        List<User> all = houTaiService.getAllUser();
//        System.out.println(all);
        model.addAttribute("alluser", all);
        return "删除成功";
    }

    //        通过用户id数组删除
    @RequestMapping("/deluserInIds")
    @ResponseBody
    public String delUserInIds(Integer[] ids) {

        if (ids.length != 0) {
            houTaiService.delUserInIds(Arrays.asList(ids));
            return "true";
        } else return "false";

    }

    /**
     * 恢复用户
     * @param model
     * @param id
     * @return
     */
    @RequestMapping("/user/huifubyid")
    @ResponseBody
    public String huifuUser(Model model, Integer id) {
        houTaiService.huiFuUserById(id);

        List<User> all = houTaiService.getAllUser();
//        System.out.println(all);
        model.addAttribute("alluser2", all);
        return "user/user-del";
    }

    @RequestMapping("/selectDelUserByNAME")
    public String selectDelUser(Model model, String keys) {
        List<User> users = houTaiService.selectDelUserByName(keys);
//        System.out.println(all);
        model.addAttribute("alluser2", users);
        return "user/user-del";
    }


//    @RequestMapping("/member-list")
//    public String toMemberList(Model model) {
//        System.out.println("controller-----------");
//
//        List<Users> allUserss = usersService.getAllByState("启用");
//        System.out.println(allUserss);
//        model.addAttribute("users1", allUserss);
//        return "member/member-list";
//    }

//    @RequestMapping("/member-del")
//    public String toMemberDel(Model model) {
//
//        List<Users> allUserss = usersService.getAllByState("删除");
//        System.out.println(allUserss);
//        model.addAttribute("users2", allUserss);
//        return "member/member-del";
//    }


//    @RequestMapping("/admin-role")
//    public String toAdminRole() {
//        return "admin/admin-role";
//    }
//
//    @RequestMapping("/admin-permission")
//    public String toAdminPermission() {
//        return "admin/admin-permission";
//    }
//
//    @RequestMapping("/admin-list")
//    public String toAdminList() {
//        return "admin/admin-list";
//    }
//
//
//    @RequestMapping("/charts1")
//    public String toCharts1() {
//        System.out.println("controller访问成功");
//        return "charts/charts-1";
//    }

    @RequestMapping("/charts1")
    public String toCharts1() {
        return "charts/charts-1";
    }

    @RequestMapping("/charts2")
    public String toCharts2() {
        return "charts/charts-2";
    }

    @RequestMapping("/charts3")
    public String toCharts3() {
        return "charts/charts-3";
    }

    @RequestMapping("/charts4")
    public String toCharts4() {
        return "charts/charts-4";
    }

    @RequestMapping("/charts5")
    public String toCharts5() {
        return "charts/charts-5";
    }

    @RequestMapping("/charts6")
    public String toCharts6() {
        return "charts/charts-6";
    }

    @RequestMapping("/charts7")
    public String toCharts7() {
        return "charts/charts-7";
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;

    }


//    @RequestMapping("/jigou-list")
//    public String toJiGouList(Model model) {
//        List<Institution> allJIGouByState = institutionService.getAllJIGouByState("已启用");
//        System.out.println(allJIGouByState);
//        model.addAttribute("jigou1", allJIGouByState);
//        return "jigou/jigou-list";
//    }
//
//    @RequestMapping("/jigou-del")
//    public String toJiGouDel(Model model) {
//        List<Institution> allJIGouByState = institutionService.getAllJIGouByState("已删除");
//        System.out.println(allJIGouByState);
//        model.addAttribute("jigou2", allJIGouByState);
//        return "jigou/jigou-del";
//    }
//
//    @RequestMapping("/touseradd")
//    public String touseradd() {
//        return "member/member-add";
//    }
//
//    @RequestMapping("/useradd")
//    public String touserUpdate() {
//        return "member/member-add";
//    }
//


//
//
//    @RequestMapping("touserupdate1")
//    @ResponseBody
//    public String toUserUpdate1(int id, Model model) {
//        System.out.println(id);
//        model.addAttribute("courseId", id);
//        System.out.println("跳转修改用户页controller访问成功");
//        return id + "";
//    }
//
//    @RequestMapping("touserupdate2")
//    public String toUserUpdate2() {
//
//        return "member/passwordr-update";
//    }
//
//
//    @RequestMapping("toaddjigou")
//    public String tojigouadd() {
//
//        return "jigou/jigou-add";
//    }
//
//
//    @RequestMapping("tojigouupdate1")
//    @ResponseBody
//    public String toJiGouUpdate1(int id, Model model) {
//        System.out.println(id);
//        model.addAttribute("courseId", id);
//        System.out.println("跳转修改机构页controller访问成功");
//        return id + "";
//    }
//
//    @RequestMapping("tojigouupdate2")
//    public String toJiGouUpdate2() {
//
//        return "jigou/passwordr-update";
//    }

}
