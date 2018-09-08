package com.blog.blog.services;

import com.blog.blog.models.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    private List<Post> posts;

    public PostService() {
        posts = new ArrayList<>();
        createPosts();
    }

    public Post find(long id) {
        return posts.get( (int) id - 1);
    }

    public List<Post> all(){
        return posts;
    }

    public Post save(Post post) {
        post.setId(posts.size() + 1);
        posts.add(post);
        return post;
    }

    public void createPosts() {
        posts.add(new Post("Xbox One","For sale! On the cheap", 1));
        posts.add(new Post("Xbox Two","For sale! Pre-release edition", 2));
        posts.add(new Post("Xbox 360","Will trade for BMW.", 3));
        posts.add(new Post("Xbox Controller","Buttons don't work.", 4));
    }
}
