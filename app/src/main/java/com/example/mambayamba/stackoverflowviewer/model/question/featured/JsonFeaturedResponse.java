package com.example.mambayamba.stackoverflowviewer.model.question.featured;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by mambayamba on 19.11.2016.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor(suppressConstructorProperties = true)

public class JsonFeaturedResponse{
    private List<Item> items;
}
