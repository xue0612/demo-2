$(function(){
	var name = sessionStorage.getItem("userName");
	$(".username").text(name);
})

$(".search-product").on("click", function () {
    $(".search-product").addClass("font-aqua");
    $(".search-service").removeClass("font-aqua");
})
$(".search-service").on("click", function () {
    $(".search-service").addClass("font-aqua");
    $(".search-product").removeClass("font-aqua");
})

$(".banner a").on("click", function (event) {
    $(".banner a").removeClass("border-b");
    $(event.target).addClass("border-b");
})

$(".user-action a").on("click", function (event) {
    $(".user-action a").removeClass("bg-gray");
    $(event.target).addClass("bg-gray");
})
$(".content-nav li").on("click", function (event) {
    $(".content-nav li").removeClass("nav-active");
    $(event.target).addClass("nav-active");
})

$(".content-banner li").eq(0).on("click", function (event) {
    $(".content-banner li").removeClass("border-b1");
    $(event.target).addClass("border-b1");
    $(".change-password").hide();
    $(".account-info").show();
})
$(".content-banner li").eq(1).on("click", function (event) {
    $(".content-banner li").removeClass("border-b1");
    $(event.target).addClass("border-b1");
    $(".change-password").show();
    $(".account-info").hide();
})

$(".save").on("click", function(){
	var phone = $(".phone").val();
	var password = $(".password").val();
	var password1 = $(".password1").val();
	$.ajax({
		//请求类型
		type:"post",
		//请求路径
		url:"account_repassword",
		//请求参数
		data:{
			phone: phone,
			password: password,
			password1: password1,
		},
		//返回数据类型
		//请求成功后调用函数
		success: function(data){
			console.log("成功后返回数据",data);
			if(data.code == 1){
				location.href = "e-commerce_login.html"
			}
			else{
				alert("密码修改失败!");
				location.href = "e-commerce_account.html"
			}
			
		},
		//请求失败后调用函数
		error: function(data){
			console.log("失败后返回数据",data);
		}
	})
})

$(".save1").on("click", function(){
	
	var userName= $(".userName").val();
	var email= $(".email").val();
	var sex = "";
	var sex=$(":radio[name='sex']:checked").val();
	console.log(sex);
	var phone = sessionStorage.getItem("phone");
	$.ajax({
			// 请求类型
			type:"post",
			// 请求路径
			url:"update",
			// 请求参数
			  data:{ 
				  userName:userName,
				  phone:phone,
			      email:email,
			      sex:sex,	 
			 },
			// 返回数据类型
			dataType:"json",
			// 请求成功后调用函数
			success:function(data){
				console.log("成功后返回数据",data);
		       
					//location.href = "e-commerce_account.html"
				
				},
			// 请求成功后调用函数
			error:function(data){
				console.log("失败后返回的数据",data);
			}
		
})
})