package com.dogezhang.myBlogServer.service;

import com.dogezhang.myBlogServer.model.Post;
import com.dogezhang.myBlogServer.repository.PostRepository;
import com.dogezhang.myBlogServer.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.ClassUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Objects;
import java.util.Optional;

/**
 * Created by zhang on 2019/3/16.
 */
@Service
public class PostServ {
    @Autowired
    private PostRepository postRepository;
    private String UPLOAD_FOLDER = ClassUtils.getDefaultClassLoader().getResource("").getPath()+"static/";;

    public String singleUpload(MultipartFile file, int type){
        System.out.println(type);
        if(Objects.isNull(file) || file.isEmpty()) {
            System.out.println("文件为空，请重新上传");
            return "文件为空，请重新上传";
        }
        String fileName = file.getOriginalFilename();
        try {
            // 该方法是对文件写入的封装，在util类中，导入该包即可使用，后面会给出方法
            FileUtil.fileupload(file.getBytes(), UPLOAD_FOLDER, fileName);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Post post = new Post();
        post.setTitle(fileName);
        post.setPath(UPLOAD_FOLDER + fileName);
        post.setType(type);
        postRepository.save(post);
        return "文件写入成功";
    }

    public String getPostById(int id){
        String content = null;
        Optional<Post> optional = postRepository.findById(id);
        if(optional.isPresent()){
            Post post = optional.get();
            try {
                content = FileUtil.fileRead(UPLOAD_FOLDER, post.getTitle());
            } catch (IOException e){
                e.printStackTrace();
            }
//            System.out.println(content);
            return content;
        }
        return "文件不存在，id错误";
    }
}
