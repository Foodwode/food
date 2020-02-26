package com.example.utils;


import org.aspectj.lang.annotation.Aspect;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Create by LvWenMing
 * 2018-12-18
 */
@Aspect
public class MapMessage {
    public HashMap<String,Object> fatherMap = new HashMap<>();

    {
        HashMap<String, Object> reqHeaderMap = new HashMap<>();
        //TODO:此处配置项没有写完成，需要在对接时填补完整配置项
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        reqHeaderMap.put(MessageAssemble.CLIENT_TIME, sdf.format(now.getTime()));
        reqHeaderMap.put(MessageAssemble.MERCHANT_NO, "12111171");

        HashMap<String, Object> baseMap = new HashMap<>();
        //TODO:此处配置项没有写完成，需要在对接时填补完整配置项
        baseMap.put(MessageAssemble.VERSION, "1.1");
        baseMap.put(MessageAssemble.SIGNFLAG, "1");
        baseMap.put(MessageAssemble.SEVER_MODEL, "3");

        HashMap<String, Object> dataBodyMap = new HashMap<>();

        HashMap<String, Object> MessageData = new HashMap<>();
        MessageData.put(MessageAssemble.RES_HEADER, getNodeArray(reqHeaderMap));
        MessageData.put(MessageAssemble.DATABODY, getNodeArray(dataBodyMap));
        MessageData.put(MessageAssemble.BASE, getNodeArray(baseMap));

        fatherMap.put(MessageAssemble.MESSAGE_DATA, getNodeArray(MessageData));
    }

    /**
     * 拼接完整报文
     * @param TransCodeId 交易流水号
     * @param TransCode 交易码
     * @param dataBodyMap 报文体
     */
    public MapMessage(String TransCodeId, String TransCode, HashMap<String, Object> dataBodyMap){
        HashMap<String, Object> reqHeaderMap = listGetMap(MessageAssemble.RES_HEADER);
        reqHeaderMap.put(MessageAssemble.TRANS_CODE_ID, TransCodeId);
        reqHeaderMap.put(MessageAssemble.TRANS_CODE, TransCode);

        HashMap<String, Object> dataBodyMapByFather = listGetMap(MessageAssemble.DATABODY);
        dataBodyMapByFather.putAll(dataBodyMap);
    }

    private HashMap<String, Object> listGetMap(String key){
        ArrayList<HashMap<String, Object>> messageData = (ArrayList<HashMap<String, Object>>) fatherMap.get(MessageAssemble.MESSAGE_DATA);
        HashMap<String, Object> messageDataMap = messageData.get(0);
        ArrayList<HashMap<String, Object>> values =(ArrayList<HashMap<String, Object>>) messageDataMap.get(key);
        return values.get(0);
    }

    private ArrayList<HashMap<String, Object>> getNodeArray(HashMap<String, Object> nodeMap){
        ArrayList<HashMap<String, Object>> hashMaps = new ArrayList<>();
        hashMaps.add(nodeMap);
        return hashMaps;
    }

    /**
     * 获取MessageData标签中的map数据
     * @param mmp
     * @return
     */
    public static Map<String, Object> getMessageDataMap(Map<String, Object> mmp){
        ArrayList<HashMap<String, Object>> messageData = (ArrayList<HashMap<String, Object>>) mmp.get(MessageAssemble.MESSAGE_DATA);
        return messageData.get(0);
    }

    /**
     * 获取ResHeader标签中的map数据
     * @param mmp
     * @return
     */
    public static Map<String, Object> getResHeaderMap(Map<String, Object> mmp){
        Map<String, Object> messageDataMap = getMessageDataMap(mmp);
        ArrayList<HashMap<String, Object>> resHeaderList = (ArrayList<HashMap<String, Object>>) messageDataMap.get(MessageAssemble.RES_HEADER);
        return resHeaderList.get(0);
    }

    /**
     * 获取DataBody标签中的map数据
     * @param mmp
     * @return
     */
    public static Map<String, Object> getDataBodyMap(Map<String, Object> mmp){
        Map<String, Object> messageDataMap = getMessageDataMap(mmp);
        Object dataBody = messageDataMap.get(MessageAssemble.DATABODY);
        if ("".equals(dataBody)) return null;
        ArrayList<HashMap<String, Object>> dataBodyList = (ArrayList<HashMap<String, Object>>) dataBody;
        return dataBodyList.get(0);
    }

    /**
     * 获取DataBody标签中的Cycle标签中的数据    list中储存多个map，每个map储存一组信息
     * @param mmp
     * @return
     */
    public static ArrayList<HashMap<String, Object>> getDataBodyCycle(Map<String, Object> mmp){

        Object cycles = mmp.get(MessageAssemble.CYCLES);
        if ("".equals(cycles)) return null;
        ArrayList<HashMap<String, Object>> cyclesList = (ArrayList<HashMap<String, Object>>) cycles;
        Map<String, Object> cycleMap = cyclesList.get(0);
        Object cycle = cycleMap.get(MessageAssemble.CYCLE);
        if ("".equals(cycle)) return null;
        ArrayList<HashMap<String, Object>> cycleList = (ArrayList<HashMap<String, Object>>) cycle;

        return cycleList;
    }

}
