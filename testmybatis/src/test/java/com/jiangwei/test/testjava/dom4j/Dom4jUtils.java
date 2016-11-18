package com.jiangwei.test.testjava.dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.StringReader;

/**
 * Created by weijiang
 * Date: 2016/11/18
 * Desc:
 */
public class Dom4jUtils {

    SAXReader saxReader;

    public Dom4jUtils() {
        this.saxReader = new SAXReader();
    }

    public Dom4jUtils(SAXReader saxReader) {
        this.saxReader = saxReader;
    }


    public Document getDocument(String source) throws DocumentException {
        return  DocumentHelper.parseText(source);
    }

    public Document getDocument(File file) throws DocumentException {
       return this.saxReader.read(file);
    }

    public Document getDocument(StringReader sourceReader) throws DocumentException {
        return this.saxReader.read(sourceReader);
    }



}
