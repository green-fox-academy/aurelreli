package com.reddit.forum.controllers;

import com.reddit.forum.models.Post;
import com.reddit.forum.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {
  private PostService postService;

  @Autowired
  public PostController(PostService postService) {
    this.postService = postService;
  }

  @GetMapping("/")
  public String listPosts(Model model) {
    model.addAttribute("posts", postService.getPosts());
    model.addAttribute("trendingposts", postService.getTrendingPosts());
    return "index";
  }

  @GetMapping("/submit")
  public String showSubmitPage() {
    return "submit";
  }

  @PostMapping("/submit")
  public String submitPostToIndexPage(String title, String url) {
    postService.addPost(new Post(title, url));
    return "redirect:/";
  }

  @GetMapping("/plus/{id}")
  public String addPoint(@PathVariable int id) {
    postService.addPoint(id);
    return "redirect:/";
  }

  @GetMapping("/minus/{id}")
  public String subtractPoint(@PathVariable int id) {
    postService.subPoint(id);
    return "redirect:/";
  }


}
