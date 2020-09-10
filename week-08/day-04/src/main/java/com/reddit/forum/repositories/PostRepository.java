package com.reddit.forum.repositories;

import com.reddit.forum.models.Post;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Integer> {
  List<Post> findAll();
}
