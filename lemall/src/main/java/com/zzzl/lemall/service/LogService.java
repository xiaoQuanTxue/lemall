//package com.zzzl.lemall.service;
//
//import com.alibaba.fastjson.JSONObject;
//import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.File;
//import java.io.IOException;
//
///**
// * 2 * @Author: zxq
// * 3 * @Date: 2020/10/31 20:27
// * 4
// */
//@Service
//public class LogService {
//
//    public JSONObject logUpload(MultipartFile file) throws Exception {
//        if (file == null || file.isEmpty()) {
//            throw new Exception("未选择需上传的日志文件");
//        }
//
//        String filePath = new File("logs_app").getAbsolutePath();
//        File fileUpload = new File(filePath);
//        if (!fileUpload.exists()) {
//            fileUpload.mkdirs();
//        }
//
//        fileUpload = new File(filePath, file.getOriginalFilename());
//        if (fileUpload.exists()) {
//            throw new Exception("上传的日志文件已存在");
//        }
//
//        try {
//            file.transferTo(fileUpload);
//
//            return ReturnMessage.success();
//        } catch (IOException e) {
//            throw new Exception("上传日志文件到服务器失败：" + e.toString());
//        }
//    }
//}