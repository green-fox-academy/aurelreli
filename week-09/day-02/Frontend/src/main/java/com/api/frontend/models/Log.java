package com.api.frontend.models;

import java.util.List;

public class Log {
  private List<MyEntry> entries;
  private int entry_count;

  public Log() {}

  public Log(List<MyEntry> entries) {
    this.entries = entries;
    entry_count = entries.size();
  }

  public List<MyEntry> getEntries() {
    return entries;
  }

  public void setEntries(List<MyEntry> entries) {
    this.entries = entries;
  }

  public int getEntry_count() {
    return entry_count;
  }

  public void setEntry_count(int entry_count) {
    this.entry_count = entry_count;
  }
}
