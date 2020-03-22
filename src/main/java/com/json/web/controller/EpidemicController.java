package com.json.web.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.json.web.entity.EpidemicCmdQuery;
import com.json.web.service.impl.EpidemicImpl;
import com.json.web.util.ResutlUtil;

/**
 * 测试请求参数和返回数据
 * @author Dell
 *
 */
@Controller
@RequestMapping("/epidemic")
public class EpidemicController {
    private static final ObjectMapper objectMapper = new ObjectMapper();
	private static ResutlUtil resutlUtil = new ResutlUtil();
	/**
	 * 测试请求参数
	 * @param mapJson,请求参数
	 * @parm mapRequest,再次封装请求参数
	 * localhost:8081/jsondemo/epidemic/request
	 */
	@SuppressWarnings("unchecked")
	@PostMapping("/request")
	@ResponseBody
	public ResutlUtil verityRequest(@RequestBody String json) {
		Map<String, Object> mapRequest = new HashMap<String, Object>();
		EpidemicCmdQuery epidemicCmdQuery = new EpidemicCmdQuery();
		try {
			// json 转map
			Map<String, Object> mapJson = objectMapper.readValue(json, Map.class);
			EpidemicImpl.verityParam(mapJson,epidemicCmdQuery);
			
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		resutlUtil.setCode(200);
		resutlUtil.setResultData(epidemicCmdQuery);
		return resutlUtil;
	}
	
	/**
	 * localhost:8081/jsondemo/epidemic/response
	 * 测试返回结果
	 * @param json
	 * @return
	 */
	@PostMapping(value = "/response",produces={"application/json;charset=UTF-8"})
	@ResponseBody
	public String verityResponse(@RequestBody String json) {
		return EpidemicImpl.epidemic(json);
	}
}
