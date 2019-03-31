package com.hong.weixin.controller;

import java.io.StringReader;

import javax.xml.bind.JAXB;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hong.domain.InMessage;
import com.hong.weixin.service.MessageTypeMapper;

// 控制器 : 负责接收用户的请求参数、调用业务逻辑层代码、返回视图/结果给客户端（浏览器）
// @Controller  基于JSP的控制器
// @RestController 符合RESTful风格的WEB服务的控制器
// RESTful通过不同的请求方法调用不同的处理程序，返回的结果仅仅是数据，不包含视图（HTML、JSP）
@RestController
// 各自写代码的时候，把/kemao_1改为【/拼音名】，用于后面作为路径反向代理的时候区分不同人的代码
// @RequestMapping表示的含义：URL跟控制器的关系映射
@RequestMapping("/hongzw/weixin/receiver")
public class MessageReceiverController {
	
	private static final Logger LOG = LoggerFactory.getLogger(MessageReceiverController.class);

	@GetMapping // 只处理GET请求
	public String echo(//
			@RequestParam("signature") String signature, //
			@RequestParam("timestamp") String timestamp, //
			@RequestParam("nonce") String nonce, //
			@RequestParam("echostr") String echostr//
	) {
		// 正常来讲，需要把timestamp和nonce放入一个数组，并进行排序
		// 接着把排序后的两个元素拼接成一个新的String
		// 使用SHA-1算法对新的String进行加密
		// 最后把加密的结果跟signature进行比较，如果相同表示验证通过，返回echostr
		// 原路返回echostr的值，返回以后微信公众号平台就能够认为：服务器对接成功
		System.out.println("hello kemao!");
		return echostr;
	}
	
	@PostMapping
	public String onMessage(
			@RequestParam("signature") String signature, //
			@RequestParam("timestamp") String timestamp, //
			@RequestParam("nonce") String nonce, //
			@RequestBody String xml) {
		//收到消息
		LOG.trace("收到的消息原文:\n{}\n----------------------------------------",xml);
		
		//截取消息类型
		String type = xml.substring(0);
		Class<InMessage> cla = MessageTypeMapper.getClass(type);
		//使用JAXB将xml转化为java对象
		InMessage inMessage = JAXB.unmarshal(new StringReader(xml), cla);
		LOG.debug("转换得到的消息对象\n{}\n",inMessage.toString());
		
		
		
		
		
		return "success";	
	}
}

