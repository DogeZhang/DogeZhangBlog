package com.dogezhang.myBlogServer.controller;

import com.dogezhang.myBlogServer.service.PostServ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


/**
 * Created by zhang on 2019/3/16.
 */
@RequestMapping("/upload")
@RestController
@CrossOrigin
public class SinglePostUploadCtrl {
    @Autowired
    private  PostServ postServ;
    @Value("${prop.upload-folder}")
    private String UPLOAD_FOLDER;

    @PostMapping("/singleUpload")
    private String singleUpload(MultipartFile file, int type){
        return postServ.singleUpload(file, type);
    }

    @GetMapping("/getPostById")
    private String getPostById(@RequestParam int id){
        return postServ.getPostById(id);
    }
}
