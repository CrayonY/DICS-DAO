package com.ucd.common.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

import com.alibaba.fastjson.JSON;


public final class Tools {

	private static final ObjectMapper objectMapper = new ObjectMapper();

	public static String toJson(Object obj) {
		try {
			return objectMapper.writeValueAsString(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static <T> T jsonToObject(String str, Class<T> T) {
		try {
			return objectMapper.readValue(str, T);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public static <T> Map<String, Object> json2map(String jsonStr)     throws Exception {
		return JSON.parseObject(jsonStr, Map.class);
	}

	public static <T> T map2obj(Map<?, ?> map, Class<T> clazz) throws Exception {
		return JSON.parseObject(JSON.toJSONString(map), clazz);
	}


	public static <T> T map2Listobj(Map<?, ?> map, Class<T> clazz) throws Exception {
		String str = JSON.toJSONString(map);
		return JSON.parseObject(str,clazz);
	}

//	public static <T> String listPageToJson(PageView<T> page) {
//		Map<String, Object> result = new HashMap<String, Object>();
//		result.put("success", page.isSuccess());
//		result.put("recode", page.getRecode());
//		result.put("msg", page.getMsg());
//		result.put("draw", page.getDraw());
//		result.put("recordsTotal", page.getTotalrecord());
//		result.put("recordsFiltered", page.getTotalrecord());
//		result.put("data", page.getRecords());
//		return toJson(result);
//	}

//	public static <T> String listPageToBootstrapJson(PageView<T> page) {
//		Map<String, Object> result = new HashMap<String, Object>();
//		result.put("total", page.getTotalrecord());
//		result.put("rows", page.getRecords());
//		return toJson(result);
//	}
//
//	public static <T> String objectToJson(String recode, String msg, Object data) {
//		Map<String, Object> result = new HashMap<String, Object>();
//		result.put("success", "000000".equals(recode));
//		result.put("recode", recode);
//		result.put("msg", msg);
//		result.put("data", data);
//		return toJson(result);
//	}
//
//	public static <T> String resultToJson(String recode, String msg) {
//		Map<String, Object> result = new HashMap<String, Object>();
//		result.put("success", "000000".equals(recode));
//		result.put("recode", recode);
//		result.put("msg", msg);
//		return toJson(result);
//	}

}
