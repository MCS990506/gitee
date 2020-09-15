package com.untiled.utils;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BeanFactory {
    private static Map<String,Object> map =new HashMap<>();
    static {
        try {
            SAXReader saxReader=new SAXReader();
            InputStream inputStream = BeanFactory.class.getClassLoader().getResourceAsStream("beans.xml");
            Document document = saxReader.read(inputStream);
            Element beans = document.getRootElement();
            List<Element> beanList = beans.elements();
            for (Element bean : beanList) {
                String idValue = bean.attributeValue("id");
                String classValue = bean.attributeValue("class");
                Class<?> clazz = Class.forName(classValue);
                Object interfaceImplObj = clazz.newInstance();
                map.put(idValue,interfaceImplObj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Object getBean(String interfaceName){
        return map.get(interfaceName);
    }
}
