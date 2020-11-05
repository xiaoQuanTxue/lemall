package com.zzzl.lemall.controller;

import com.zzzl.lemall.domain.*;
import com.zzzl.lemall.mapper.OrderitemMapper;
import com.zzzl.lemall.service.HouTaiService;
import com.zzzl.lemall.service.OrderService;
import org.apache.commons.io.FileUtils;
import org.bouncycastle.math.raw.Mod;
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

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderitemMapper orderitemMapper;


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
                          @RequestParam("file") MultipartFile file) {

        Good good = new Good();
        good.setGoodName(goodName);
        good.setGoodCurrentPrice(goodCurrentPrice);
        good.setGoodInventory(goodInventory);
        good.setGoodDescribe(goodDescribe);
        good.setGoodState("1");

        Date date = new Date();
        good.setGoodUpDate(date);

        String fname = file.getOriginalFilename();
        System.out.println("controller   good--------------" + good);
        System.out.println("fname------------" + fname);
        houTaiService.addGood(good);


        //name：图片的名称
        //判断file是否为null
        if (!file.isEmpty()) {
            //不为空才执行上传
            try {

                //创建file，文件上传之后的位置和名称

//                File f = new File(servletContext.getRealPath("/upload"+ fname));

                String fileName = file.getOriginalFilename();  // 文件名
                System.out.println("filename-----------" + fileName);

                String suffixName = fileName.substring(fileName.lastIndexOf("."));  // 后缀名
                System.out.println("suffixname------" + suffixName);

                String filePath = "D:\\桌面文件\\项目\\lemall\\dianshang\\images\\picturea\\upload\\"; // 上传后的路径
//                fileName = UUID.randomUUID() + suffixName; // 新文件名

                File dest = new File(filePath + fileName);
                if (!dest.getParentFile().exists()) {
                    dest.getParentFile().mkdirs();
                }
                //写入
                file.transferTo(dest);


                GoodDetails gd = new GoodDetails();
                gd.setGoodDetailsIgm("localImg/" + fileName);
                good.setPictureLocation(gd);
                houTaiService.addGOODImg(good);
                System.out.println(good);

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
    public String toadduser() {

        return "user/user-add";
    }

    @RequestMapping("/adduser")
    public String adduser(Model model, User user) {
        user.setUserBirth(new Date());
        user.setUserState("1");
        houTaiService.addUser(user);

        List<User> users = houTaiService.getAllUser();
//        System.out.println(users);
        model.addAttribute("alluser", users);
        return "user/user-list";
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
     *
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

//    用户结束


//    订单开始

    //    获取所有
    @RequestMapping("/order-list0")
    public String toOrder(Model model) {
//        System.out.println("成功访问....获取所有商品的controller");

        List<Orders> all = orderService.displayAllOrder();

        model.addAttribute("allorders", all);
        return "order/order-list0";
    }

    //    获取未发货
    @RequestMapping("/order-list1")
    public String toOrder1(Model model) {

        String state = "待发货";
        List<Orders> all = orderService.displayAllOrder1(state);

        model.addAttribute("allorders1", all);
        return "order/order-list1";
    }


    //    获取已发货
    @RequestMapping("/order-list2")
    public String toOrder2(Model model) {

        String state = "已发货";
        List<Orders> all = orderService.displayAllOrder1(state);

        model.addAttribute("allorders2", all);
        return "order/order-list2";
    }


    @RequestMapping("/orderitem")
    public List<Orderitem> Orderitme(Model model, Integer id) {
        System.out.println(id);
        List<Orderitem> orderitems = orderitemMapper.selectOrderitemsByOrderId(id);
        model.addAttribute("orderitem", orderitems);
        return orderitems;
    }


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
}
