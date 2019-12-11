var check = null;
$(".user-arrow-down").on("click",function(){
    if($(".dropdown").is(":hidden")){
        $(".dropdown").show();
 }else{
       $(".dropdown").hide();
 }
}) 
$(function(){
	$.ajax({
		// 请求类型
		type : "get",
		// 请求路径
		url : "/ope_saveimg",
		// 请求参数
		// 返回数据类型
		// 请求成功后调用函数
		success : function(data) {
			console.log("成功后返回数据", data);
			var id = sessionStorage.getItem("id");
			var imgPath = "ope_headImg?id="+id;
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
	var name = sessionStorage.getItem("name");
	$(".name").text(name);
})

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
					strhtml+='<a href=ope_product?pageStart='+psize*(i-1)+'&productName='+productName+' style="background-color:#aaaaaa;font-weight:700">'+i+'</a>';
				}else{
					strhtml+='<span> <a href=ope_product?pageStart='+psize*(i-1)+'&productName='+productName+'>'+i+'</a></span>';
				}
			}
		}
		else if(cpage>10){
		
			if( 1<=nowpage && nowpage<=6){		//pagestart=20 nowpage=11 cpage=15
			
				for(var i=1;i<=10;i++){			
				
					if(i==nowpage){
						strhtml+='<a href=ope_product?pageStart='+psize*(i-1)+'&productName='+productName+' style="background-color:#aaaaaa;font-weight:700">'+i+'</a>';
						//strhtml+='<a href=/userAll?pageStart='+psize*(i-1)+' style="background-color:#aaaaaa"><div class="nowpage">'+i+'</div></a>';
					}else{
						strhtml+='<span> <a href=ope_product?pageStart='+psize*(i-1)+'&productName='+productName+'>'+i+'</a></span>';
					}
				}
			}
			else if( nowpage<=cpage-4){
			
				for(var i=nowpage-5;i<=nowpage+4;i++){//6--15			
			
					if(i==nowpage){
						strhtml+='<a href=ope_product?pageStart='+psize*(i-1)+'&productName='+productName+' style="background-color:#aaaaaa;font-weight:700">'+i+'</a>';
						//strhtml+='<a href=/userAll?pageStart='+psize*(i-1)+' style="background-color:#aaaaaa"><div class="nowpage">'+i+'</div></a>';
					}else{
						strhtml+='<span> <a href=ope_product?pageStart='+psize*(i-1)+'&productName='+productName+'>'+i+'</a></span>';
					}
				
				}
			} 
			else if( cpage-4<nowpage && nowpage<=cpage){
			
				for(var i=cpage-9;i<=cpage;i++){
				
					if(i==nowpage){
						strhtml+='<a href=ope_product?pageStart='+psize*(i-1)+'&productName='+productName+' style="background-color:#aaaaaa;font-weight:700">'+i+'</a>';
						//strhtml+='<a href=/userAll?pageStart='+psize*(i-1)+' style="background-color:#aaaaaa"><div class="nowpage">'+i+'</div></a>';
					}else{
						strhtml+='<span> <a href=ope_product?pageStart='+psize*(i-1)+'&productName='+productName+'>'+i+'</a></span>';
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

$(".checkall").on("change", function(){
	check=this.checked
	$(":checkbox[name='product']").attr("checked",check);
})

$(".down-line").on("click", function(){
	var input= $(":checkbox[name='product']");
	var id= "";
	if(check){
			for(var i = 0;i< input.length;i++){
				id += $(input[i]).val()+",";
			}
			id = id.substr(0,id.length-1);
	}
	$.ajax({
		url:"/downall",
		type:"get",
		data:{
			id: id,
		},
		success: function(data){
			console.log(data.xx);
			if(data.xx.indexOf("1") == -1){
				location.href="ope_product";
			}
			else if(data.code == "false"){
				alert("操作错误");
			}
		},
		error: function(){
			console.log("失败")
		}
	})
})

$(".up-line").on("click", function(){
	var input= $(":checkbox[name='product']");
	var id= "";
	if(check){
			for(var i = 0;i< input.length;i++){
				id += $(input[i]).val()+",";
			}
			id = id.substr(0,id.length-1);
	}
	$.ajax({
		url:"/upall",
		type:"get",
		data:{
			id: id,
		},
		success: function(data){
			console.log(data.xx);
			if(data.xx.indexOf("0") == -1){
				location.href="ope_product";
			}
			else if(data.code == "false"){
				alert("操作错误");
			}
		},
		error: function(){
			console.log("失败")
		}
	})
})

function downLine(id){
	location.href="downline?id="+id;
}

function upLine(id){
	location.href="upline?id="+id;
}