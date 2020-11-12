package com.joy.datasource.controller;

import com.joy.datasource.mapper.discovery.CategoryMapper;
import com.joy.datasource.mapper.ting.AlbumMetadataMapper;
import com.joy.datasource.model.discovery.Category;
import com.joy.datasource.model.ting.AlbumMetadata;
import com.joy.datasource.model.ting.AlbumMetadataExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ai Lun on 2020-11-13.
 */
@RestController
public class TestController {

    @Autowired
    private AlbumMetadataMapper albumMetadataMapper;

    @Autowired
    private CategoryMapper categoryMapper;

    @RequestMapping("/ting")
    @ResponseBody
    public AlbumMetadata getById(@RequestParam("id") Long id) {
        return albumMetadataMapper.selectByPrimaryKey(id);
    }

    @RequestMapping("/discovery")
    @ResponseBody
    public Category getByIdCategory(@RequestParam("id") Integer id) {
        return categoryMapper.selectByPrimaryKey(id);
    }

}
