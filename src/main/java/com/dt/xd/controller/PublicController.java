package com.dt.xd.controller;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.dt.xd.service.XdOrderService;
import com.dt.xd.service.XdProductService;
import com.dt.xd.service.XdShoppingService;
import com.dt.xd.service.XdUserService;
import com.dt.xd.xdOrder.XdOrder;
import com.dt.xd.xdProduct.XdProduct;
import com.dt.xd.xdServiceUser.XdServiceUser;
import com.dt.xd.xdShopping.XdShopping;
import com.dt.xd.xdShopping.XdShow;
import com.dt.xd.xdUser.XdUser;

@Controller
public class PublicController {
	@Resource
	XdUserService xdUserService;
	@Resource
	XdShoppingService xdShoppingService;
	@Resource
	XdOrderService xdOrderService;
	@Resource
	XdProductService xdProductService;
	/**
	 * 运营商的登录
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public Map<String, Object> login(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String code = (String) session.getAttribute("code");
		String imgcode = request.getParameter("imgcode");
		System.out.println("getCommodity====" + request.getParameter("phone"));
		System.out.println("getCommodity====" + request.getParameter("password"));
		int code1 = 0;
		String phone = request.getParameter("phone");
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println(imgcode + "=====" + code + "===");
		if (imgcode.toUpperCase().equals(code)) {
			List<XdUser> loginList = xdUserService.login(phone);
			XdUser password = loginList.get(0);
			if (password.getPassword().equals(request.getParameter("password"))) {
				code1 = 1;
				map.put("code", code1);
				map.put("name", password.getName());
				map.put("id", password.getId());
			} else {
				map.put("code", code1);
			}
		} else {
			map.put("code", code1);
		}
		return map;
	}
	/**
	 * 运营商的修改密码
	 * @param request
	 * @return map
	 */
	@ResponseBody
	@RequestMapping(value = "/repassword", method = RequestMethod.POST)
	public Map<String, Object> repassword(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String code = (String) session.getAttribute("code");
		String imgcode = request.getParameter("imgcode");

		System.out.println("getCommodity====" + request.getParameter("phone"));
		String phone = request.getParameter("phone");
		int code1 = 0;
		Map<String, Object> map = new HashMap<String, Object>();
		if (imgcode.toUpperCase().equals(code)) {
			List<XdUser> loginList = xdUserService.login(phone);
			XdUser password = loginList.get(0);
			XdUser user = new XdUser();
			user.setId(password.getId());
			user.setPhone(password.getPhone());
			user.setPassword(request.getParameter("password"));
			user.setHeadImg(password.getHeadImg());
			user.setEmail(password.getEmail());
			user.setName(password.getName());
			user.setStatus(password.getStatus());
			user.setTs(password.getTs());
			if (request.getParameter("password").equals(request.getParameter("password1"))) {
				xdUserService.repassword(user);
				code1 = 1;
				map.put("code", code1);
			} else {
				map.put("code", code1);
			}
		} else {
			map.put("code", code1);
		}
		System.out.println(imgcode + "=====" + code + "===");
		return map;
	}

//	@ResponseBody
//	@RequestMapping(value = "/register", method = RequestMethod.POST)
//	public Map<String, Object> register(HttpServletRequest request) {
//		HttpSession session = request.getSession();
//		String code = (String) session.getAttribute("code");
//		String imgcode = request.getParameter("imgcode");
//		String id = request.getParameter("id");
//		String phone = request.getParameter("phone");
//		String password = request.getParameter("password");
//		int code1 = 0;
//		Map<String, Object> map = new HashMap<String, Object>();
//		if (imgcode.toUpperCase().equals(code)) {
//			XdUser user = new XdUser();
//			user.setId(id);
//			user.setPhone(phone);
//			user.setPassword(password);
//			xdUserService.insert(user);
//			code1 = 1;
//			map.put("code", code1);
//		} else {
//			map.put("code", code1);
//		}
//		System.out.println(imgcode + "=====" + code + "===");
//		return map;
//	}
	/**
	 * 电子商务的加入购物车
	 * @param request
	 * @return map
	 */
	@ResponseBody
	@RequestMapping(value = "/shoping", method = RequestMethod.POST)
	public Map<String, Object> shoping() {
		Map<String, Object> map = new HashMap<String, Object>();
		List<XdShopping> xdShoppingList = xdShoppingService.selectAll();
		map.put("xdShoppingList", xdShoppingList);
		return map;
	}

	/**
	 * 电子商务的加入购物车
	 * @param request
	 * @return map
	 */
	@ResponseBody
	@RequestMapping(value = "/shop", method = RequestMethod.POST)
	public Map<String, Object> shop(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<XdShopping> xdShoppingList = xdShoppingService.selectAll();
		//将varchar类型的id强制转换为int类型,并设置自增+1
		int str = Integer.parseInt(request.getParameter("coco")) + 1;
		String st = Integer.toString(str);
		XdShopping user = new XdShopping();
		user.setId(st);
		user.setCount(2);
		//将xd_shopping里连接xd_product里的外键pro_id由于varchar类型的转换为int类型的
		user.setProId(Integer.parseInt(request.getParameter("id")));
		int i = xdShoppingService.insertShopping(user);
		map.put("code", i);
		map.put("xdShoppingList", xdShoppingList);
		return map;
	}
	/**
	 * 购物车计算总价
	 * @param request
	 * @return map
	 */
	@ResponseBody
	@RequestMapping(value = "/shopcount", method = RequestMethod.POST)
	public Map<String, Object> shopcount(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		int i = xdShoppingService.updateShopping(request);
		map.put("code", i);
		return map;
	}

	/**
	 * 电子商务的分页和查询
	 * @param map
	 * @param pageStart
	 * @param pageSize
	 * @param productName
	 * @return e-commerce_product.html
	 */
	@RequestMapping("/e_product")
	// @RequestParam 参数是基本数据类型，不赋初始置，容易报错，用此注解赋默认值
	public String e_product(Map<String, Object> map,
			//定义初始页
			@RequestParam(defaultValue = "0") int pageStart,
			//定义一个页面上有多少条数据，这里用@RequestParam赋初始值为3，所以一个页面上有三条记录
			@RequestParam(defaultValue = "3") int pageSize,
			//按照产品名称来查询
			@RequestParam(defaultValue = "") String productName) {
		List<XdProduct> xdProductList = xdProductService.selectByName(pageStart, pageSize, productName);
		long count = 0;
		//如果查询的产品名字为空
		if (productName.equals("")) {
			//直接跳转到到页面总数
			count = xdProductService.getCount();
		} else {
			//如果输入了任何值，则返回到产品的记录上
			count = xdProductService.getCount(productName);
		}
		map.put("count", count);
		map.put("xdProductList", xdProductList);
		map.put("pageStart", pageStart);
		map.put("pageSize", pageSize);
		map.put("productName", productName);
		//跳转到e-commerce_product.html，将e-commerce_product.html的拦截路径改为/e_product
		return "e-commerce_product";
	}
	
	
	/**
	 * 将上传图片upfile的拦截路径换为loadimg
	 * @return upfile
	 */
	@RequestMapping("/loadimg")
	public String loadimg() {
		return "upfile";
	}

	/**
	 * 上传图片
	 * @param file
	 * @param id
	 * @return /e_product
	 */
	@RequestMapping(value = "/upfile")
	public ModelAndView saveUserImg(MultipartFile file, Integer id) {
		Map<Object, Object> result = new HashMap<Object, Object>();
		try {
			// 获取客户端传图图片的输入流
			InputStream ins = file.getInputStream();
			byte[] buffer = new byte[1024];// bit---byte---1k---1m
			int len = 0;
			// 字节输出流
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			while ((len = ins.read(buffer)) != -1) {
				bos.write(buffer, 0, len);
			}
			bos.flush();
			byte data[] = bos.toByteArray();
			// 调用接口对图片进行存储
			XdProduct xdProduct = new XdProduct();
			xdProduct.setId(id);
			xdProduct.setImg(data);
			xdProductService.updateImg(xdProduct);

			result.put("code", 1);
		} catch (Exception e) {
			// return "error";
		}
		return new ModelAndView("redirect:/e_product");
	}

	/**
	 * 图片显示，上传的图片只能是.img .jpg .png类型的
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/headImg", produces = MediaType.IMAGE_PNG_VALUE)
	public ResponseEntity<byte[]> headImg(Integer id) throws Exception {
		byte[] imageContent;
		// 根据id获取当前用户的信息
		XdProduct xdProduct = xdProductService.selectByPrimaryKey(id);

		imageContent = xdProduct.getImg();

		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.IMAGE_PNG);
		return new ResponseEntity<byte[]>(imageContent, headers, HttpStatus.OK);
	}

	/**
	 * 电子商务购物车表的分页和查询，按照id查询
	 * @param map
	 * @param pageStart
	 * @param pageSize
	 * @param id
	 * @return e-commerce_shoping-car.html
	 */
	@RequestMapping("/e_shoppingcar")
	// @RequestParam 参数是基本数据类型，不赋初始置，容易报错，用此注解赋默认值
	public String e_shoppingcar(Map<String, Object> map,
			@RequestParam(defaultValue = "0") int pageStart,
			@RequestParam(defaultValue = "3") Integer pageSize,
			//按照id查询，但是用外键连接xd_shopping和xd_product两个表，在.xml文件更改sql语句，按照xd_product里的productName查询
			@RequestParam(defaultValue = "") String id) {
		//新建一个类，将xd_product和xd_shopping两个表里的所有数据放入一个表中，生成getter和setter方法，这样就可以调用两个表里的所有数据
		List<XdShow> xdShoppingList = xdShoppingService.selectTwoTable(pageStart, pageSize, id);
		double allPrice = 0.0; 
		for(int i =0;i<xdShoppingList.size();i++) {
			allPrice += (xdShoppingList.get(i).getCount()*xdShoppingList.get(i).getProductPrice());
		}
		long count = 0;
		if (id.equals("") || id == null)
			count = xdShoppingService.getCount();
		else
			count = xdShoppingService.getCount(id);
		map.put("count", count);
		map.put("xdShoppingList", xdShoppingList);
		map.put("pageStart", pageStart);
		map.put("pageSize", pageSize);
		map.put("id", id);
		map.put("allPrice", allPrice);
		return "e-commerce_shoping-car";
	}
	
	/**
	 * 电子商务订单表的查询
	 * @param map
	 * @param id
	 * @return e-commerce_order.
	 */
	@RequestMapping("/e_order")
	public String e_order(Map<String, Object> map,String id) {
		List<XdShow> xdShoppingList = xdShoppingService.selectBoth(id);
		map.put("id", id);
		map.put("xdShoppingList", xdShoppingList);
		return "e-commerce_order";
	}

	/**
	 * 电子商务订单表的删除
	 * @param request
	 * @return map
	 */
	@ResponseBody
	@RequestMapping(value = "/e_delete", method = RequestMethod.POST)
	public Map<String, Object> e_delete(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println("id" + request.getParameter("id"));
		//按id删除，自动获取id，定义i，删除成功则输出i=1
		int i = xdShoppingService.deleteByPrimaryKey(request.getParameter("id"));
		System.out.println("======" + i);
		if (i == 1)
			map.put("code", "success");
		else
			map.put("code", "false");
		return map;
	}
	
	/**
	 * 电子商务订单表删除，使用js自动传值
	 * @param request
	 * @return map
	 */
	@ResponseBody
	@RequestMapping(value = "/order_delete", method = RequestMethod.POST)
	public Map<String, Object> order_delete(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println("id" + request.getParameter("id"));
		//按id删除，自动获取id，定义i，删除成功则输出i=1
		int i = xdShoppingService.deleteByPrimaryKey(request.getParameter("id"));
		System.out.println("======" + i);
		if (i == 1)
			map.put("code", "success");
		else
			map.put("code", "false");
		return map;
	}

	
//	@ResponseBody
//	@RequestMapping("/buyNum")
//	public Map<String,Object> buyNum(byte productPrice,String id){
//		Map<String,Object>map=new HashMap<String,Object>();
//		
//		return map;
//	}
	/**
	 * 用户评价表的的查询
	 * @param map
	 * @param id
	 * @return e-commerce_evaluate.html
	 */
	@RequestMapping("/e_evaluate")
	public String e_evaluate(Map<String, Object> map,String id) {
		List<XdShow> xdShoppingList = xdShoppingService.selectBoth(id);
		map.put("id", id);
		map.put("xdShoppingList", xdShoppingList);
		return "e-commerce_evaluate";
	}
	
//	@RequestMapping("/evaluate")
//	public ModelAndView evaluate(Map<String, Object> map) {
//		int xdOrderList=xdOrderService.updateByExample();
//		map.put("xdOrderList", xdOrderList);
//		return new ModelAndView ("/e_evaluate");
//	}
	
	/**
	 * 运营商产品页分页
	 * @param map
	 * @param pageStart
	 * @param pageSize
	 * @param productName
	 * @return operator_product.html
	 */
	@RequestMapping("/ope_product")
	// @RequestParam 参数是基本数据类型，不赋初始置，容易报错，用此注解赋默认值
	public String ope_product(Map<String, Object> map,
			//定义初始页
			@RequestParam(defaultValue = "0") int pageStart,
			//定义一个页面上有多少条数据，这里用@RequestParam赋初始值为3，所以一个页面上有三条记录
			@RequestParam(defaultValue = "3") int pageSize,
			//按照产品名称来查询
			@RequestParam(defaultValue = "") String productName) {
		List<XdProduct> xdProductList = xdProductService.selectByName(pageStart, pageSize, productName);
		long count = 0;
		//如果查询的产品名字为空
		if (productName.equals("")) {
			//直接跳转到到页面总数
			count = xdProductService.getCount();
		} else {
			//如果输入了任何值，则返回到产品的记录上
			count = xdProductService.getCount(productName);
		}
		map.put("count", count);
		map.put("xdProductList", xdProductList);
		map.put("pageStart", pageStart);
		map.put("pageSize", pageSize);
		map.put("productName", productName);
		return "operator_product";
	}
	
	/**
	 * 运营商订单页的分页查询
	 * @param map
	 * @param pageStart
	 * @param pageSize
	 * @param orderNumber
	 * @return operator_orderform
	 */
	@RequestMapping("/ope_orderform")
	// @RequestParam 参数是基本数据类型，不赋初始置，容易报错，用此注解赋默认值
	public String ope_orderform(Map<String, Object> map,
			//定义初始页
			@RequestParam(defaultValue = "0") int pageStart,
			//定义一个页面上有多少条数据，这里用@RequestParam赋初始值为3，所以一个页面上有三条记录
			@RequestParam(defaultValue = "3") int pageSize,
			//按照产品名称来查询
			@RequestParam(defaultValue = "") String orderNumber) {
		List<XdOrder> xdOrderList = xdOrderService.selectByNumber(pageStart, pageSize, orderNumber);
		long count = 0;
		//如果查询的产品名字为空
		if (orderNumber.equals("")) {
			//直接跳转到到页面总数
			count = xdOrderService.countByExample();
		} else {
			//如果输入了任何值，则返回到产品的记录上
			count = xdOrderService.getCount(orderNumber);
		}
		map.put("count", count);
		map.put("xdOrderList", xdOrderList);
		map.put("pageStart", pageStart);
		map.put("pageSize", pageSize);
		map.put("orderNumber", orderNumber);
		return "operator_orderform";
	}
	@RequestMapping("/ope_delete")
	public ModelAndView ope_delete(@RequestParam(defaultValue="0",required=false)Integer id) {
			int i=xdProductService.deleteByPrimaryKey(id);
			if(i==1)
				return new ModelAndView ("redirect:/ope_product");
			else
				return new ModelAndView ("error");
		
	}
	
	@RequestMapping("/ope_expenses")
	// @RequestParam 参数是基本数据类型，不赋初始置，容易报错，用此注解赋默认值
	public String ope_expenses(Map<String, Object> map) {
		List<XdOrder> xdOrderList = xdOrderService.selectOrder();
		map.put("xdOrderList", xdOrderList);
		return "operator_expenses";
	}
	/**
	 * 服务商上传图片
	 * @param request
	 * @return map
	 */
	@ResponseBody
	@RequestMapping(value = "/saveimg", method = RequestMethod.GET)
	public Map<String, Object> saveimg(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		return map;
	}
	/**
	 * 运营商下线
	 * @param request
	 * @return 运营商产品表
	 */
	@RequestMapping("/downline")
	public ModelAndView downline(HttpServletRequest request) {
		XdProduct user = new XdProduct();
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("======="+id);
		user = xdProductService.selectByPrimaryKey(id);
		System.out.println(user.getStatus());
		user.setStatus("0");
		System.out.println("user="+user.getStatus());
		int code = xdProductService.updateByStatus(user);
		System.out.println(code);
		return new ModelAndView("redirect:/ope_product");
	}
	/**
	 * 运营商上线
	 * @param request
	 * @return 运营商产品页
	 */
	@RequestMapping("/upline")
	public ModelAndView upline(HttpServletRequest request) {
		XdProduct user = new XdProduct();
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("======="+id);
		user = xdProductService.selectByPrimaryKey(id);
		System.out.println(user.getStatus());
		user.setStatus("1");
		System.out.println("user="+user.getStatus());
		int code = xdProductService.updateByStatus(user);
		System.out.println(code);
		return new ModelAndView("redirect:/ope_product");
	}

	
	/**
	 * 运营商下线
	 * @param request
	 * @return 运营商产品表
	 */
	@RequestMapping("/ser_downline")
	public ModelAndView ser_downline(HttpServletRequest request) {
		XdProduct user = new XdProduct();
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("======="+id);
		user = xdProductService.selectByPrimaryKey(id);
		System.out.println(user.getStatus());
		user.setStatus("0");
		System.out.println("user="+user.getStatus());
		int code = xdProductService.updateByStatus(user);
		System.out.println(code);
		return new ModelAndView("redirect:/ser_product");
	}
	/**
	 * 运营商上线
	 * @param request
	 * @return 运营商产品页
	 */
	@RequestMapping("/ser_upline")
	public ModelAndView ser_upline(HttpServletRequest request) {
		XdProduct user = new XdProduct();
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("======="+id);
		user = xdProductService.selectByPrimaryKey(id);
		System.out.println(user.getStatus());
		user.setStatus("1");
		System.out.println("user="+user.getStatus());
		int code = xdProductService.updateByStatus(user);
		System.out.println(code);
		return new ModelAndView("redirect:/ser_product");
	}
	@RequestMapping("/ser_product") // @RequestParam 参数是基本数据类型，不赋初始置，容易报错，用此注解赋默认值
	public String ser_product(Map<String, Object> map,Model model,

			@RequestParam(defaultValue = "0") int pageStart,

			@RequestParam(defaultValue = "3") Integer pageSize,

			@RequestParam(defaultValue = "") String productName) {
		List<XdProduct> xdProductList = xdProductService.selectByName(pageStart, pageSize, productName);
		XdProduct  xdProduct=new XdProduct();
		model.addAttribute("xdProduct",xdProduct);
		long count = 0;
		if (productName.equals("") || productName == null)
			count = xdProductService.getCount();
		else
			count = xdProductService.getCount(productName);
		map.put("count", count);
		map.put("xdProductList", xdProductList);
		map.put("pageStart", pageStart);
		map.put("pageSize", pageSize);
		map.put("productName", productName);
		return "service_product";
	}
	/* 添加服务 
	 * @param map
	 * @param xdProduct
	 * return service_product
	 * */
	@RequestMapping("/ser_insert")
	//@RequestMapping映射路径
	public ModelAndView insert(Map<String, Object> map, XdProduct xdproduct) {
		int i = xdProductService.insert(xdproduct);
		if (i==1) {
			return new ModelAndView("redirect:/ser_product");
		}else {
			return new ModelAndView("redirect:/ser_product");
		}
	}

	/* 删除服务
	 * @param id
	 *  return service_product
	 *  */
	@RequestMapping("/ser_delete")
	public ModelAndView deleteByPrimaryKey(
			@RequestParam(defaultValue="0",required=false)Integer id) {
		int i=xdProductService.deleteByPrimaryKey(id);//根据主键删除
		
		if(i==1)
			return new ModelAndView("redirect:/ser_product");
		else
			return new ModelAndView("redirect:/ser_product");

	}

	/* 编辑服务 
	 * @param xdProduct
	 * return service_product
	 * */
	@RequestMapping("/ser_update")
	public ModelAndView updateByPrimaryKey(XdProduct xdProduct) {//数据绑定
		int i = xdProductService.updateForService(xdProduct);//通过主键编辑
		if(i==1)
			return new ModelAndView("redirect:/ser_product");
		else
			
			return new ModelAndView("redirect:/ser_product");
	}

	/*编辑查询服务
	 *  按主键进行异步查询 
	 *  @param id
	 *  return update
	 *  */
	@RequestMapping("/ser_select")//编辑查询服务
	public ModelAndView selectByPrimaryKey(Integer id,Model model) throws Exception {
		XdProduct xdProduct = xdProductService.selectByPrimaryKey(id);//根据主键id查询
		model.addAttribute("xdProduct",xdProduct);
			return new ModelAndView ("update");
	}
	/* 编辑服务 
	 * @param xdProduct
	 * return service_product
	 * */
	@RequestMapping("/ope_update")
	public ModelAndView ope_update(XdProduct xdProduct) {//数据绑定
		int i = xdProductService.updateForService(xdProduct);//通过主键编辑
		if(i==1)
			return new ModelAndView("redirect:/ope_product");
		else
			
			return new ModelAndView("redirect:/ope_product");
	}

	/*编辑查询服务
	 *  按主键进行异步查询 
	 *  @param id
	 *  return update
	 *  */
	@RequestMapping("/ope_select")//编辑查询服务
	public ModelAndView ope_select(Integer id,Model model) throws Exception {
		XdProduct xdProduct = xdProductService.selectByPrimaryKey(id);//根据主键id查询
		model.addAttribute("xdProduct",xdProduct);
			return new ModelAndView ("update1");
	}
	@RequestMapping("/ser_orderform")
	// @RequestParam 参数是基本数据类型，不赋初始置，容易报错，用此注解赋默认值
	public String ser_orderform(Map<String, Object> map,
			//定义初始页
			@RequestParam(defaultValue = "0") int pageStart,
			//定义一个页面上有多少条数据，这里用@RequestParam赋初始值为3，所以一个页面上有三条记录
			@RequestParam(defaultValue = "3") int pageSize,
			//按照产品名称来查询
			@RequestParam(defaultValue = "") String productName) {
		List<XdProduct> xdProductList = xdProductService.selectByName(pageStart, pageSize, productName);
		long count = 0;
		//如果查询的产品名字为空
		if (productName.equals("")) {
			//直接跳转到到页面总数
			count = xdProductService.getCount();
		} else {
			//如果输入了任何值，则返回到产品的记录上
			count = xdProductService.getCount(productName);
		}
		map.put("count", count);
		map.put("xdProductList", xdProductList);
		map.put("pageStart", pageStart);
		map.put("pageSize", pageSize);
		map.put("productName", productName);
		return "service_orderform";
	}
	
	
	/**
	 * 服务商设置上传图片
	 * @param file
	 * @param id
	 * @return /e_product
	 */
	@RequestMapping(value = "/ope_upfile",method = RequestMethod.POST)
	public ModelAndView ope_changeImg(MultipartFile file, String id) {
		Map<Object, Object> result = new HashMap<Object, Object>();
		try {
			// 获取客户端传图图片的输入流
			InputStream ins = file.getInputStream();
			byte[] buffer = new byte[1024];// bit---byte---1k---1m
			int len = 0;
			// 字节输出流
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			while ((len = ins.read(buffer)) != -1) {
				bos.write(buffer, 0, len);
			}
			bos.flush();
			byte data[] = bos.toByteArray();
			// 调用接口对图片进行存储
			XdUser xdUser = new XdUser();
			xdUser.setId(id);
			xdUser.setImg(data);
			xdUserService.updateForOpeImg(xdUser);

			result.put("code", 1);
		} catch (Exception e) {
			// return "error";
		}
		return new ModelAndView ("redirect:/ope_user");
	}

	/**
	 * 图片显示，上传的图片只能是.img .jpg .png类型的
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/ope_headImg",produces = MediaType.IMAGE_PNG_VALUE)
	public ResponseEntity<byte[]> ope_headImg(String id) throws Exception {
		byte[] imageContent;
		XdUser xdUser = xdUserService.selectByPrimaryKey(id);
		imageContent = xdUser.getImg();
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.IMAGE_PNG);
		return new ResponseEntity<byte[]>(imageContent, headers, HttpStatus.OK);
	}
	@ResponseBody
	@RequestMapping(value = "/ope_saveimg", method = RequestMethod.GET)
	public Map<String, Object> ope_saveimg(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		return map;
	}
	
	@ResponseBody
	@RequestMapping(value = "/downall", method = RequestMethod.GET)
	public Map<String, Object> downall(HttpServletRequest request) {
		XdProduct user = new XdProduct();
		Map<String,Object> map = new HashMap<String,Object>();
		String xx= "";
		System.out.println(xx);
		String str = request.getParameter("id");
		String[] strs= str.split(",");
		System.out.println("======"+str);
		int len = strs.length;
		for(int i = 0;i<len;i++) {
			user = xdProductService.selectByPrimaryKey(Integer.parseInt(strs[i]));
			if(user.getStatus().equals("1")) {
				user.setStatus("0");
				int code = xdProductService.updateByStatus(user);
				xx += user.getStatus();
			}
			else {
				xx += user.getStatus();
			}
//			011111111" ["","11111"]
		}
		map.put("xx", xx);
		return map;
	}
	
	@ResponseBody
	@RequestMapping(value = "/upall", method = RequestMethod.GET)
	public Map<String, Object> upall(HttpServletRequest request) {
		XdProduct user = new XdProduct();
		Map<String,Object> map = new HashMap<String,Object>();
		String xx= "";
		System.out.println(xx);
		String str = request.getParameter("id");
		String[] strs= str.split(",");
		System.out.println("======"+str);
		int len = strs.length;
		for(int i = 0;i<len;i++) {
			user = xdProductService.selectByPrimaryKey(Integer.parseInt(strs[i]));
			if(user.getStatus().equals("0")) {
				user.setStatus("1");
				int code = xdProductService.updateByStatus(user);
				xx += user.getStatus();
			}
			else {
				xx += user.getStatus();
			}
//			011111111" ["","11111"]
		}
		map.put("xx", xx);
		return map;
	}
	
	@ResponseBody
	@RequestMapping(value = "/e_numshow", method = RequestMethod.GET)
	public Map<String, Object> e_numshow(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		long i =xdShoppingService.getCount();
		map.put("num", i);
		return map;
	}
	
	@ResponseBody
	@RequestMapping(value = "/shoppingcaradd", method = RequestMethod.POST)
	public Map<String, Object> shoppingcaradd(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		long i =xdShoppingService.updateShopping(request);
		map.put("num", i);
		return map;
	}
	
	@ResponseBody
	@RequestMapping(value = "/shoppingcarre", method = RequestMethod.POST)
	public Map<String, Object> shoppingcarre(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		long i =xdShoppingService.updateShopping(request);
		map.put("num", i);
		return map;
	}
	
	@ResponseBody
	@RequestMapping(value = "/query", method = RequestMethod.GET)
	// @RequestParam 参数是基本数据类型，不赋初始置，容易报错，用此注解赋默认值
	public Map<String, Object> ope_query(HttpServletRequest request) {
		List<XdOrder> xdOrderList = xdOrderService.selectByDate(request);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("xdOrderList", xdOrderList);
		return map;
	}
	
	@ResponseBody
	@RequestMapping(value = "/queryall", method = RequestMethod.GET)
	// @RequestParam 参数是基本数据类型，不赋初始置，容易报错，用此注解赋默认值
	public Map<String, Object> ope_queryall(HttpServletRequest request) {
		List<XdOrder> xdOrderList = xdOrderService.selectOrder();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("xdOrderList", xdOrderList);
		return map;
	}
}
