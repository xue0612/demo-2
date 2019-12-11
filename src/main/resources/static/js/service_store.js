$(".user-arrow-down").on("click",function(){
    if($(".dropdown").is(":hidden")){
        $(".dropdown").show();
 }else{
       $(".dropdown").hide();
 }
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
$(function(){
	$.ajax({
		// 请求类型
		type : "get",
		// 请求路径
		url : "/save_store_img",
		// 请求参数
		// 返回数据类型
		// 请求成功后调用函数
		success : function(data) {
			console.log("成功后返回数据", data);
			var id = sessionStorage.getItem("id");
			var licPath = "ser_store_headImg?id="+id;
			$("#1").val(id);
			$("#2").attr("src",licPath);
		},
		// 请求失败后调用函数
		error : function(data) {
			console.log("失败后返回数据", data);
		}
	})
})
$(".save").on("click", function(){
	var servicePhone = sessionStorage.getItem("servicePhone");
	var synopsis= $(".syn").val();
	var worktime= $(".wt").val();
	var qq= $(".q").val();
	var customPhone= $(".ct").val();
	$.ajax({
			// 请求类型
			type:"post",
			// 请求路径
			url:"/updateStore",
			// 请求参数
			  data:{
				  servicePhone:servicePhone,
				  synopsis:synopsis,
				  worktime:worktime,
				  qq:qq,
				  customPhone:customPhone,
			 },
			// 返回数据类型
			dataType:"json",
			// 请求成功后调用函数
			success:function(data){
				console.log("成功后返回数据",data);
		       
				
				},
			// 请求成功后调用函数
			error:function(data){
				console.log("失败后返回的数据",data);
			}
		
})
})