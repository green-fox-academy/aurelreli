package com.reddit.forum.models;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.boot.context.properties.bind.DefaultValue;

@Entity
@Table(name = "posts")
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
//  @Column(name = "post_id")
  private int id;
  private String title;
  @Column(columnDefinition = "integer default 0")
  private int point;
  private String url;
  private Date date;

  public Post() {}

  public Post(String title, String url) {
    this.title = title;
    this.url = url;
    date = new Date();
  }

  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public int getPoint() {
    return point;
  }

  public String getUrl() {
    return url;
  }

  public Date getDate() {
    return date;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setPoint(int point) {
    this.point = point;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public void incrementPoint() {
    this.point++;
  }

  public void decrementPoint() {
    this.point--;
  }
}
