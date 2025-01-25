package com.w.search.service;

import com.w.search.mapper.DocumentMapper;
import com.w.search.mapper.InvertedIndexMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yongzhi.wei
 */
@Service
public class SearchService {

    @Resource
    DocumentMapper documentMapper;

    @Resource
    InvertedIndexMapper invertedIndexMapper;

    /**
     * 插入新文档
     */
    public void insertDocument(){

    }

    /**
     * 修改文档
     */
    public void updateDocument(){

    }

    /**
     * 搜索文档
     * @param word 关键字
     */
    public List<String> search(String word){
        return null;
    }
}