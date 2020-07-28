package blog;

import java.util.ArrayList;

public class Blog {
  private ArrayList<BlogPost> blog;
  public Blog() {
    blog = new ArrayList<>();
  }

  public void add(BlogPost blogPost) {
    blog.add(blogPost);
  }
  public void delete(int i) {
    blog.remove(i);
  }
  public void update(int i, BlogPost blogPost) {
    blog.add(i, blogPost);
  }

  public int getSize() {
    return blog.size();
  }
  public BlogPost getBlogPost(int i) {
    return blog.get(i);
  }
}
