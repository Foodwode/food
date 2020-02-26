package com.example.utils;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.QName;

import java.util.*;

/**
 *  XML 拼接，解析工具类
 */
public class XmlUtils {

    /**
     * Map 类型转换成 Xml 对象返回
     * @param map 元素集合
     * @param encode 编码
     * @return Xml 对象
     * @throws Exception
     */
    public static Document map2xml(Map<String, Object> map, String encode) throws Exception {
        Iterator<Map.Entry<String, Object>> entries = map.entrySet().iterator();
        Document doc = DocumentHelper.createDocument();
        doc.setXMLEncoding(encode);
        Element root = DocumentHelper.createElement(new QName("CPMB2B"));
        doc.add(root);

        while(entries.hasNext()) {
            Map.Entry<String, Object> entry = (Map.Entry)entries.next();
            if (entry.getValue() instanceof List) {
                List<Map> list = (List)entry.getValue();
                Iterator i$ = list.iterator();

                while(i$.hasNext()) {
                    Map nodeMap = (Map)i$.next();
                    Element node = DocumentHelper.createElement(new QName((String)entry.getKey()));
                    map2xml(nodeMap, node);
                    root.add(node);
                }
            }

            if (entry.getValue() instanceof String) {
                Element node = DocumentHelper.createElement(new QName((String)entry.getKey()));
                node.addText(entry.getValue().toString());
                root.add(node);
            }
        }

        return doc;
    }

    /**
     * Map 类型转换成 Xml 元素对象返回（针对某一个 Xml 元素执行添加子元素操作）
     * @param map 元素集合
     * @param body Xml 元素对象
     * @return 添加完子元素的元素对象
     */
    private static Element map2xml(Map<String, Object> map, Element body) {
        Iterator entries = map.entrySet().iterator();

        while(true) {
            while(entries.hasNext()) {
                Map.Entry<String, Object> entry = (Map.Entry)entries.next();
                String key = (String)entry.getKey();
                Object value = entry.getValue();
                if (key.startsWith("@")) {
                    body.addAttribute(key.substring(1, key.length()), value.toString());
                } else if (key.equals("#text")) {
                    body.setText(value.toString());
                } else if (value instanceof List) {
                    List list = (List)value;

                    for(int i = 0; i < list.size(); ++i) {
                        Object obj = list.get(i);
                        if (obj instanceof Map) {
                            Element subElement = body.addElement(key);
                            map2xml((Map)list.get(i), subElement);
                        } else {
                            body.addElement(key).setText((String)list.get(i));
                        }
                    }
                } else if (value instanceof Map) {
                    Element subElement = body.addElement(key);
                    map2xml((Map)value, subElement);
                } else {
                    body.addElement(key).setText(value.toString());
                }
            }

            return body;
        }
    }

    /**
     * Xml 字符串转换成 Map 对象返回
     * @param xmlstr Xml 字符串
     * @return 转换后的 Map 对象
     * @throws Exception
     */
    public static Map xml2map(String xmlstr) throws Exception {
        Map map = new HashMap();
        Document document = null;
        document = DocumentHelper.parseText(xmlstr);
        List<Element> elementList = document.getRootElement().elements();
        Iterator i$ = elementList.iterator();

        while(i$.hasNext()) {
            Element e = (Element)i$.next();
            if (e.elements().size() != 0) {
                Map map2 = xml2map(e.asXML());
                Object list;
                if (map.containsKey(e.getName())) {
                    list = (List)map.get(e.getName());
                } else {
                    list = new ArrayList();
                }

                ((List)list).add(map2);
                map.put(e.getName(), list);
            } else {
                map.put(e.getName(), e.getTextTrim());
            }
        }

        return map;
    }

}
