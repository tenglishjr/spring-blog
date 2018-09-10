package com.blog.blog.services;

import com.blog.blog.models.Post;
import com.blog.blog.repositories.PostRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    PostRepository postDao;

    public PostService(PostRepository postDao) {
        this.postDao = postDao;
//        createPosts();
    }

    public Post find(long id) {
        return postDao.findOne(id);
    }

    public List<Post> all(){
        return postDao.findAll();
    }

    public Post save(Post post) {
        return postDao.save(post);
    }

    public void delete(Long id) {
        postDao.delete(id);
    }

//    public void createPosts() {
//        postDao.save(new Post("Xbox One","For sale! On the cheap"));
//        postDao.save(new Post("Xbox Two","For sale! Pre-release edition"));
//        postDao.save(new Post("Xbox 360","Will trade for BMW."));
//        postDao.save(new Post("Xbox Controller","Buttons don't work."));
//    }
}
