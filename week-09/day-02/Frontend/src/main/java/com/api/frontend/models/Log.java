package com.api.frontend.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Log {
  private List<MyEntry> entries;
  @JsonProperty("entry_count")
  private int entryCount;

  public Log() {}

  public Log(List<MyEntry> entries) {
    this.entries = entries;
    entryCount = entries.size();
  }

  public List<MyEntry> getEntries() {
    return entries;
  }

  public void setEntries(List<MyEntry> entries) {
    this.entries = entries;
  }

  public int getEntryCount() {
    return entryCount;
  }

  public void setEntryCount(int entryCount) {
    this.entryCount = entryCount;
  }
}
