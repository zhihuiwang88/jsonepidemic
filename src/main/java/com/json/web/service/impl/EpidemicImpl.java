package com.json.web.service.impl;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.client.utils.URLEncodedUtils;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.json.web.entity.Candata;
import com.json.web.entity.EpidemicCmdQuery;
import com.json.web.entity.EpidemicPersonCar;
import com.json.web.entity.Otncandata;
import com.json.web.util.HttpClientNewUtil;
import com.json.web.util.ResutlUtil;

public class EpidemicImpl {

	
	@SuppressWarnings("rawtypes")
	private static  ResutlUtil resutlUtil = new ResutlUtil();
	private static final ObjectMapper objectMapper = new ObjectMapper();
	private static EpidemicCmdQuery epidemicCmdQuery = new EpidemicCmdQuery();
	
	/**
	 * 请求参数费非空判断
	 * 返回成功null
	 * @param mapQuery,请求参数
	 * @param mapRequest,封装请求参数
	 */
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static ResutlUtil verityParam(Map<String, Object> mapJson,EpidemicCmdQuery epidemicCmdQuery) {
		
		EpidemicPersonCar epidemicPersonCar = new EpidemicPersonCar();
		
		epidemicCmdQuery.setCmd((String)mapJson.get("cmd"));
		// 人员和车辆
		Map<String, Object> mapQuery = (Map<String, Object>) mapJson.get("query");
		if (StringUtils.isEmpty(mapQuery.get("con"))) {
			resutlUtil.setCode(9998);
			resutlUtil.setMsg("con is null");
			return resutlUtil;
		}
		epidemicPersonCar.setCon((String)mapQuery.get("con"));
		if (StringUtils.isEmpty(mapQuery.get("caxy"))) {
			resutlUtil.setCode(9998);
			resutlUtil.setMsg("caxy  is null");
			return resutlUtil;
		}
		epidemicPersonCar.setCaxy((String)mapQuery.get("caxy"));
		if (StringUtils.isEmpty(mapQuery.get("xbkm"))) {
			resutlUtil.setCode(9998);
			resutlUtil.setMsg("xbkm  is null");
			return resutlUtil;
		}
		epidemicPersonCar.setXbkm((String)mapQuery.get("xbkm"));
		if (StringUtils.isEmpty(mapQuery.get("wgx"))) {
			resutlUtil.setCode(9998);
			resutlUtil.setMsg("wgx  is null");
			return resutlUtil;
		}
		epidemicPersonCar.setWgx((String)mapQuery.get("wgx"));
		epidemicPersonCar.setXbkm((String)mapQuery.get("xbkm"));
		if (StringUtils.isEmpty(mapQuery.get("dnhm"))) {
			resutlUtil.setCode(9998);
			resutlUtil.setMsg("dnhm  is null");
			return resutlUtil;
		}
		epidemicPersonCar.setDnhm((String)mapQuery.get("dnhm"));
		if (StringUtils.isEmpty(mapQuery.get("rfhm"))) {
			resutlUtil.setCode(9998);
			resutlUtil.setMsg("rfhm is null");
			return resutlUtil;
		}
		epidemicPersonCar.setRfhm((String)mapQuery.get("rfhm"));
		if (StringUtils.isEmpty(mapQuery.get("qmc"))) {
			resutlUtil.setCode(9998);
			resutlUtil.setMsg("qmc  is null");
			return resutlUtil;
		}
		epidemicPersonCar.setQmc((String)mapQuery.get("qmc"));
		if (StringUtils.isEmpty(mapQuery.get("qr"))) {
			resutlUtil.setCode(9998);
			resutlUtil.setMsg("qr  is null");
			return resutlUtil;
		}
		epidemicPersonCar.setQr((String)mapQuery.get("qr"));
		if (StringUtils.isEmpty(mapQuery.get("fxhm"))) {
			resutlUtil.setCode(9998);
			resutlUtil.setMsg("fxhm  is null");
			return resutlUtil;
		}
		epidemicPersonCar.setFxhm((String)mapQuery.get("fxhm"));
		if (StringUtils.isEmpty(mapQuery.get("qdm"))) {
			resutlUtil.setCode(9998);
			resutlUtil.setMsg("qdm  is null");
			return resutlUtil;
		}
		epidemicPersonCar.setQdm((String)mapQuery.get("qdm"));
		String  dylx = (String)mapQuery.get("dylx");
		if (StringUtils.isEmpty(dylx)) {
			resutlUtil.setCode(9998);
			resutlUtil.setMsg("dylx  is null");
			return resutlUtil;
		}
		epidemicPersonCar.setDylx(dylx);
		// pc01--移动02
		try {
		if ("01".equals(dylx)) {
			if (StringUtils.isEmpty(mapQuery.get("kyamc"))) {
				resutlUtil.setCode(9998);
				resutlUtil.setMsg("kyamc  is null");
				return resutlUtil;
			}
			if (StringUtils.isEmpty(mapQuery.get("hip"))) {
				resutlUtil.setCode(9998);
				resutlUtil.setMsg("hip  is null");
				return resutlUtil;
			}
			if (StringUtils.isEmpty(mapQuery.get("szh"))) {
				resutlUtil.setCode(9998);
				resutlUtil.setMsg("szh  is null");
				return resutlUtil;
			}
			epidemicPersonCar.setKyamc((String)mapQuery.get("kyamc"));
			epidemicPersonCar.setHip((String)mapQuery.get("hip"));
			epidemicPersonCar.setSzh((String)mapQuery.get("szh"));
			epidemicPersonCar.setJhm("");
			epidemicPersonCar.setDmuz("");
			epidemicPersonCar.setWezc("");
			
		} else if ("02".equals(dylx)) {
			if (StringUtils.isEmpty(mapQuery.get("jhm"))) {
				resutlUtil.setCode(9998);
				resutlUtil.setMsg("jhm  is null");
				return resutlUtil;
			}
			if (StringUtils.isEmpty(mapQuery.get("dmuz"))) {
				resutlUtil.setCode(9998);
				resutlUtil.setMsg("dmuz  is null");
				return resutlUtil;
			}
			if (StringUtils.isEmpty(mapQuery.get("wezc"))) {
				resutlUtil.setCode(9998);
				resutlUtil.setMsg("wezc  is null");
				return resutlUtil;
			}
			epidemicPersonCar.setKyamc("");
			epidemicPersonCar.setHip("");
			epidemicPersonCar.setSzh("");
			epidemicPersonCar.setJhm((String)mapQuery.get("jhm"));
			epidemicPersonCar.setDmuz((String)mapQuery.get("dmuz"));
			epidemicPersonCar.setWezc((String)mapQuery.get("wezc"));
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		epidemicCmdQuery.setQuery(epidemicPersonCar);
		return null;
	}
	
	
	
	/**
	 * ResutlUtil
	 * 更具URL+ 请求参数拿到返回数据
	 * @param json，请求参数
	 * @return
	 */
	public static String epidemic(String json) {
		Map<String, Object> mapRequest = new HashMap<String, Object>();
		Map<String, Object> mapData = new HashMap<String, Object>();
		try {
			// json转map
			Map<String, Object> mapJson = objectMapper.readValue(json, Map.class);
			// 请求参数费非空判断
			EpidemicImpl.verityParam(mapJson, epidemicCmdQuery);
			String url = "http://127.0.0.1/con/gcp";
			String result = objectMapper.writeValueAsString(epidemicCmdQuery);
			String responseJson = HttpClientNewUtil.postJson(url, result,"UTF-8");
			// 处理返回参数fastjson
			JSONObject responseResult = JSON.parseObject(json);
			String code = responseResult.getString("code");
			// 成功状态码
			if ("10000".equals(code)) {
				mapData.put("iscontactperson", responseResult.getString("iscontactperson"));
				mapData.put("sfzt", responseResult.getString("sfzt"));
				mapData.put("cksfcz", responseResult.getString("cksfcz"));
				mapData.put("sfdghb", responseResult.getString("sfdghb"));
				mapData.put("sfycl", responseResult.getString("sfycl"));
//				mapData.put("clsfdghb", responseResult.getString("clsfdghb"));
				mapData.put("clsfdghb", URLEncodedUtils.parse(responseResult.getString("clsfdghb"), Charset.forName("UTF-8")));
				
				// otncandata,遍历
				List<Otncandata> list = new ArrayList<Otncandata>();
				JSONArray listOtncandata = responseResult.getJSONArray("otncandata");
				for (Object object : listOtncandata) {
					JSONObject mapOtn = (JSONObject) object;
					Otncandata otncandata = new Otncandata();
					otncandata.setXm(mapOtn.getString("xm"));
					otncandata.setJclx(mapOtn.getString("jclx"));
					otncandata.setSfzhm(mapOtn.getString("sfzhm"));
					otncandata.setGrylx(mapOtn.getString("grylx"));
					otncandata.setJclx(mapOtn.getString("jcrq"));
					list.add(otncandata);
				}
				mapData.put("otncandata", list);
				// candata,遍历
				List<Candata> listCan = new ArrayList<Candata>();
				JSONArray listCandata = responseResult.getJSONArray("candata");
				for (Object object : listCandata) {
					Candata candata  = new Candata();
					JSONObject mapCan = (JSONObject) object;
					candata.setJclx(mapCan.getString("jclx"));
					candata.setJcrq(mapCan.getString("jcrq"));
					candata.setSfzhm(mapCan.getString("sfzhm"));
					candata.setXm(mapCan.getString("xm"));
					listCan.add(candata);
				}
				mapData.put("candata", listCan);
//				resutlUtil.setCode(responseResult.getInteger("code"));
//				resutlUtil.setMsg(responseResult.getString("msg"));
//				resutlUtil.setResultData(mapData);
			} else {
				resutlUtil.setCode(105);
				resutlUtil.setMsg("未取到返回数据");
				return JSONObject.toJSONString(resutlUtil);
//				 return resutlUtil;
			}
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		return resutlUtil;
		return JSONObject.toJSONString(mapData);
	}
	
	
	
	
}
