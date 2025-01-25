package com.w.search.service;

import com.huaban.analysis.jieba.JiebaSegmenter;

import java.util.List;

/**
 * @author yongzhi.wei
 * 处理文本
 *  分词
 *  数据清洗：去掉无用字符，例如", :, ..."
 */
public class SentenceService {

    /**
     * 数据清洗，去掉无用字符，例如", :, ..."
     * @param sentence 句子
     * @return 清洗后的句子
     */
    private String clean(String sentence){
        return sentence;
    }

    /**
     * 分词
     * @param sentence 句子
     * @return 分解后的词语
     */
    public List<String> segment(String sentence){
        sentence = clean(sentence);

        JiebaSegmenter seg = new JiebaSegmenter();
        return seg.sentenceProcess(sentence);
    }
}
