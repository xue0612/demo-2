$(".code1").on("click", function() {
	var img = document.getElementsByClassName("code1")[0];
	var time = new Date().getTime();
	img.src = "images?t=" + time;
})

// 自运行
$(function() {
	var img = document.getElementsByClassName("code1")[0];
	var time = new Date().getTime();
	img.src = "images?t=" + time;
})

$(".login-btn").on("click", function() {
	var phone = $(".e-phone").val();
	var password = $(".e-password").val();
	var imgcode = $(".code").val();
	$.ajax({
		// 请求类型
		type : "post",
		// 请求路径
		url : "e_login",
		// 请求参数
		data : {
			phone : phone,
			password : password,
			imgcode : imgcode,
		},
		// 返回数据类型
		// 请求成功后调用函数
		
		success : function(data) {
			
			console.log("成功后返回数据", data);
			if (data.code == 1) {
				location.href = "./e_product"
					sessionStorage.setItem("phone",phone);
					sessionStorage.setItem("userName",data.userName);
			} else {
				alert("信息输入错误!");
				location.href = "e-commerce_login.html"
			}
		},
		// 请求失败后调用函数
		error : function(data) {
			console.log("失败后返回数据", data);
		}
	})
})

