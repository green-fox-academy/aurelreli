package com.reddit.forum.services;

import com.reddit.forum.models.Post;
import com.reddit.forum.repositories.PostRepository;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
  private PostRepository postRepository;

  @Autowired
  public PostService(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  public List<Post> getPosts() {
    return postRepository.findAll();
  }

  public void addPost(Post post) {
    postRepository.save(post);
  }

  public void addPoint(int id) {
    Post post = postRepository.findById(id).orElseThrow(NoSuchElementException::new);
    post.incrementPoint();
    postRepository.save(post);
  }

  public void subPoint(int id) {
    Post post = postRepository.findById(id).orElseThrow(NoSuchElementException::new);
    post.decrementPoint();
    postRepository.save(post);
  }

  public List<Post> getTrendingPosts() {
    return postRepository.findAll().stream()
        .sorted(Comparator.comparing(Post::getPoint).reversed())
        .limit(10)
        .collect(Collectors.toList());
  }
}
