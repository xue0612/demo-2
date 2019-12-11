$(function(){
	var name = sessionStorage.getItem("userName");
	$(".username").text(name);
})

$(function() {
	$.ajax({
		// 请求类型
		type : "get",
		// 请求路径
		url : "e_numshow",
		// 请求参数
		// 返回数据类型
		// 请求成功后调用函数
		success : function(data) {
			$(".shopnum").text(data.num);
		},
		error : function(data) {
			console.log("失败后返回数据", data);
		}
	})
})

$(function(){
	$.ajax({
		// 请求类型
		type : "post",
		// 请求路径
		url : "shoping",
		// 请求参数
		// 返回数据类型
		// 请求成功后调用函数
		success : function(data) {
			console.log("成功后返回数据", data);
			var i = data.xdShoppingList.length-1;
			sessionStorage.setItem("id",data.xdShoppingList[i].id);
		},
		// 请求失败后调用函数
		error : function(data) {
			console.log("失败后返回数据", data);
		}
	})
})
$(".search-product").on("click", function(){
    $(".search-product").addClass("font-aqua");
    $(".search-service").removeClass("font-aqua");
})
$(".search-service").on("click", function(){
    $(".search-service").addClass("font-aqua");
    $(".search-product").removeClass("font-aqua");
})

$(".banner a").on("click", function(event){
    $(".banner a").removeClass("border-b");
    $(event.target).addClass("border-b");
})

$(".content-nav li").on("click", function(event){
    $(".content-nav li").removeClass("nav-active");
    $(event.target).addClass("nav-active");
})

$(".search-btn").on("click", function(event){
    var productName=$(".search input").val();
    location.href="./e_product?productName="+productName;
})

function inCar(id){
	console.log(id);
	var coco = sessionStorage.getItem("id");
	$.ajax({
		// 请求类型
		type : "post",
		// 请求路径
		url : "shop",
		// 请求参数
		data : {
			id : id,
			coco : coco,
		},
		// 返回数据类型
		// 请求成功后调用函数
		success : function(data) {
			console.log("成功后返回数据", data);
			if (data.code == 1) {
				location.href = "./e_shoppingcar"
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
}

$(document).ready(function(){
		var pcount=$('#count').val();
		var psize=$('#pageSize').val();
		var pstart=$('#pageStart').val();
		var productName=$('#productName').val();
		var nowpage=Math.floor(pstart/psize)+1;		
		var cpage=Math.ceil(pcount/psize);
		var strhtml="";
		
		if(cpage<=10){
			for(var i=1;i<=cpage;i++){
				if(i==nowpage){
					strhtml+='<a href=./e_product?pageStart='+psize*(i-1)+'&productName='+productName+' style="background-color:#aaaaaa;font-weight:700">'+i+'</a>';
				}else{
					strhtml+='<span> <a href=./e_product?pageStart='+psize*(i-1)+'&productName='+productName+'>'+i+'</a></span>';
				}
			}
		}
		else if(cpage>10){
		
			if( 1<=nowpage && nowpage<=6){		//pagestart=20 nowpage=11 cpage=15
			
				for(var i=1;i<=10;i++){			
				
					if(i==nowpage){
						strhtml+='<a href=./e_product?pageStart='+psize*(i-1)+'&productName='+productName+' style="background-color:#aaaaaa;font-weight:700">'+i+'</a>';
						//strhtml+='<a href=/userAll?pageStart='+psize*(i-1)+' style="background-color:#aaaaaa"><div class="nowpage">'+i+'</div></a>';
					}else{
						strhtml+='<span> <a href=./e_product?pageStart='+psize*(i-1)+'&productName='+productName+'>'+i+'</a></span>';
					}
				}
			}
			else if( nowpage<=cpage-4){
			
				for(var i=nowpage-5;i<=nowpage+4;i++){//6--15			
			
					if(i==nowpage){
						strhtml+='<a href=./e_product?pageStart='+psize*(i-1)+'&productName='+productName+' style="background-color:#aaaaaa;font-weight:700">'+i+'</a>';
						//strhtml+='<a href=/userAll?pageStart='+psize*(i-1)+' style="background-color:#aaaaaa"><div class="nowpage">'+i+'</div></a>';
					}else{
						strhtml+='<span> <a href=./e_product?pageStart='+psize*(i-1)+'&productName='+productName+'>'+i+'</a></span>';
					}
				
				}
			} 
			else if( cpage-4<nowpage && nowpage<=cpage){
			
				for(var i=cpage-9;i<=cpage;i++){
				
					if(i==nowpage){
						strhtml+='<a href=./e_product?pageStart='+psize*(i-1)+'&productName='+productName+' style="background-color:#aaaaaa;font-weight:700">'+i+'</a>';
						//strhtml+='<a href=/userAll?pageStart='+psize*(i-1)+' style="background-color:#aaaaaa"><div class="nowpage">'+i+'</div></a>';
					}else{
						strhtml+='<span> <a href=./e_product?pageStart='+psize*(i-1)+'&productName='+productName+'>'+i+'</a></span>';
					}
				}
			}
			else{
				console.error(00000000);
			}
		}
		else{  console.error(00000000); }
		$("#mydiv").html(strhtml);

			});
