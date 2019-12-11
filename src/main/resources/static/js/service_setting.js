$(function(){
	var phone = sessionStorage.getItem("servicePhone");
	$.ajax({
		// 请求类型
		type : "get",
		// 请求路径
		url : "/setting",
		// 请求参数
		data:{
			phone: phone,
		},
		// 返回数据类型
		// 请求成功后调用函数
		success : function(data) {
			console.log("成功后返回数据", data);
			var txt = "";
			$(".store-info").html("");
				txt += `<li>
                        <span>服务商名称</span>
                        <span>${data.userList[0].serviceName}</span>
                    </li>
                    <li>
                        <span>地区</span>
                        <span>${data.userList[0].area}</span>
                    </li>
                    <li>
                        <span>手机号</span>
                        <span>${data.userList[0].servicePhone}</span>
                    </li>
                    <li>
                        <span>微信</span>
                        <span>${data.userList[0].wechat}</span>
                    </li>
                    <li>
                        <span>QQ</span>
                        <span>${data.userList[0].qq}</span>
                    </li>
                    <li>
                        <span>邮箱</span>
                        <span>${data.userList[0].email}</span>
                    </li>
                    <li>
                        <button class="change-info" onclick="change()">修改</button>
                    </li>`
			$(".store-info").append(txt);
		},
		// 请求失败后调用函数
		error : function(data) {
			console.log("失败后返回数据", data);
		}
	})
})

$(".user-arrow-down").on("click",function(){
    if($(".dropdown").is(":hidden")){
        $(".dropdown").show();
 }else{
       $(".dropdown").hide();
 }
})
$(".order1").on("click", function(){
    $(".main-content").show();
    $("table").show();
    $(".main-pagination").show();
    $(".main-sercive").hide();
    $(".order1").addClass("border-red");
    $(".order2").removeClass("border-red");
    $(".main-top li").eq(3).text("正常用户");
})
$(".order2").on("click", function(){
    $(".main-content").hide();
    $("table").hide();
    $(".main-pagination").hide();
    $(".main-sercive").show();
    $(".order2").addClass("border-red");
    $(".order1").removeClass("border-red");
    $(".main-top li").eq(3).text("停用用户");
})
$(".order3").on("click", function(){
    $(".main-top li").eq(3).text("未通过用户");
})
function change(event){
    $(".masking").show();
}
$(".save").on("click", function(event){
    $(".masking").hide();
    location.href = "ser_setting";
    console.log("保存");
})
$(".cancel").on("click", function(event){
    $(".masking").hide();
    console.log("取消");
})
$(function(){
	var name = sessionStorage.getItem("serviceName");
	$(".servicename").text(name);
})
$(function(){
	$.ajax({
		// 请求类型
		type : "get",
		// 请求路径
		url : "/saveimg",
		// 请求参数
		// 返回数据类型
		// 请求成功后调用函数
		success : function(data) {
			console.log("成功后返回数据", data);
			var id = sessionStorage.getItem("id");
			var imgPath = "ser_headImg?id="+id;
			$("#abc").val(id);
			$("#aaa").attr("src",imgPath);
		},
		// 请求失败后调用函数
		error : function(data) {
			console.log("失败后返回数据", data);
		}
	})
})

$(".save").on("click", function(){
	var serviceName= $(".serviceName1").val();
	var area= $(".area1").val();
	var servicePhone = sessionStorage.getItem("servicePhone");
	var wechat= $(".wechat1").val();
	var qq= $(".qq1").val();
	var email= $(".email1").val();
	$.ajax({
			// 请求类型
			type:"post",
			// 请求路径
			url:"/updateForSetting",
			// 请求参数
			  data:{
				  servicePhone:servicePhone,
				  serviceName:serviceName,
				  area:area,
				  wechat:wechat,
				  qq:qq,
				  email:email,
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