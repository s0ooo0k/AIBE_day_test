package io.github.s0ooo0k.day49.model.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record NaverSearchResult(List<Item> items) {
    @JsonIgnoreProperties(ignoreUnknown = true)
    public record Item(String title, String link, String description, String postdate){}
}
