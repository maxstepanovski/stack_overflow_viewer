package com.example.mambayamba.stackoverflowviewer.model.questionpage;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by mambayamba on 21.11.2016.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor(suppressConstructorProperties = true)

public class QuestionPageResponse {
    private List<Item> items;
}
