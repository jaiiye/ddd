package ui.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * 模块：<br>
 * 描述：
 * 
 * @author 李乐 601235723@qq.com
 * @version 1.0 2014年5月21日<br>
 *          Copyright 2014 XXX有限公司.
 */
@Controller
@RequestMapping("snippet")
public class GridController {
	@RequestMapping("grid")
	public String grid() {
		return "snippets/grid";
	}
	
	@RequestMapping("nav")
	public String nav(){
		return "snippets/nav";
	}
}
