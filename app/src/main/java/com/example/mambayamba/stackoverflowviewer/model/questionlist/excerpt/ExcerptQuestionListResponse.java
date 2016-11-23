package com.example.mambayamba.stackoverflowviewer.model.questionlist.excerpt;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by mambayamba on 20.11.2016.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor (suppressConstructorProperties = true)

public class ExcerptQuestionListResponse {
    private List<Item> items;
}
