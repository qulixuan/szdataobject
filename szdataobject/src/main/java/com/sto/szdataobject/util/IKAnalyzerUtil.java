package com.sto.szdataobject.util;

import com.alibaba.druid.util.StringUtils;
import com.google.common.collect.Lists;
import org.wltea.analyzer.core.IKSegmenter;
import org.wltea.analyzer.core.Lexeme;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class IKAnalyzerUtil {
    /**
     * IK分词
     * @param target
     * @return
     */
    public static List<String> iKSegmenterToList(String target) throws Exception {
        if (StringUtils.isEmpty(target)){
            return Lists.newArrayList();
        }
        List<String> result = new ArrayList<>();
        StringReader sr = new StringReader(target);
        // 关闭智能分词 (对分词的精度影响较大)
        IKSegmenter ik = new IKSegmenter(sr, false);
        Lexeme lex;
        while((lex=ik.next())!=null) {
            String lexemeText = lex.getLexemeText();
            result.add(lexemeText);
        }
        //LOGGER.info("company:{}, iKSegmenterToList:{}", target, JSON.toJSON(result));
        return result;
    }

    public static void main(String[] args) {
        String str = "驅蚊噴霧(桃子)";
        try {
            System.out.println(iKSegmenterToList(str));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
