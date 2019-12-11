$(function(){
	var name = sessionStorage.getItem("name");
	$(".name").text(name);
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

$(function(){
	$.ajax({
		// 请求类型
		type : "get",
		// 请求路径
		url : "ope_saveimg",
		// 请求参数
		// 返回数据类型
		// 请求成功后调用函数
		success : function(data) {
			console.log("成功后返回数据", data);
			var id = sessionStorage.getItem("id");
			var imgPath = "./ope_headImg?id="+id;
			$("#abc").val(id);
			$("#aaa").attr("src",imgPath);
		},
		// 请求失败后调用函数
		error : function(data) {
			console.log("失败后返回数据", data);
		}
	})
})

$(document).ready(function(){
		var pcount=$('#count').val();
		var psize=$('#pageSize').val();
		var pstart=$('#pageStart').val();
		var serviceName=$('#serviceName').val();
		var nowpage=Math.floor(pstart/psize)+1;		
		var cpage=Math.ceil(pcount/psize);
		var strhtml="";
		
		if(cpage<=10){
			for(var i=1;i<=cpage;i++){
				if(i==nowpage){
					strhtml+='<a href=./ope_facilitator?pageStart='+psize*(i-1)+'&serviceName='+serviceName+' style="background-color:#aaaaaa;font-weight:700">'+i+'</a>';
				}else{
					strhtml+='<span> <a href=./ope_facilitator?pageStart='+psize*(i-1)+'&serviceName='+serviceName+'>'+i+'</a></span>';
				}
			}
		}
		else if(cpage>10){
		
			if( 1<=nowpage && nowpage<=6){		//pagestart=20 nowpage=11 cpage=15
			
				for(var i=1;i<=10;i++){			
				
					if(i==nowpage){
						strhtml+='<a href=./ope_facilitator?pageStart='+psize*(i-1)+'&serviceName='+serviceName+' style="background-color:#aaaaaa;font-weight:700">'+i+'</a>';
						//strhtml+='<a href=/userAll?pageStart='+psize*(i-1)+' style="background-color:#aaaaaa"><div class="nowpage">'+i+'</div></a>';
					}else{
						strhtml+='<span> <a href=./ope_facilitator?pageStart='+psize*(i-1)+'&serviceName='+serviceName+'>'+i+'</a></span>';
					}
				}
			}
			else if( nowpage<=cpage-4){
			
				for(var i=nowpage-5;i<=nowpage+4;i++){//6--15			
			
					if(i==nowpage){
						strhtml+='<a href=./ope_facilitator?pageStart='+psize*(i-1)+'&serviceName='+serviceName+' style="background-color:#aaaaaa;font-weight:700">'+i+'</a>';
						//strhtml+='<a href=/userAll?pageStart='+psize*(i-1)+' style="background-color:#aaaaaa"><div class="nowpage">'+i+'</div></a>';
					}else{
						strhtml+='<span> <a href=./ope_facilitator?pageStart='+psize*(i-1)+'&serviceName='+serviceName+'>'+i+'</a></span>';
					}
				
				}
			} 
			else if( cpage-4<nowpage && nowpage<=cpage){
			
				for(var i=cpage-9;i<=cpage;i++){
				
					if(i==nowpage){
						strhtml+='<a href=./ope_facilitator?pageStart='+psize*(i-1)+'&serviceName='+serviceName+' style="background-color:#aaaaaa;font-weight:700">'+i+'</a>';
						//strhtml+='<a href=userAll?pageStart='+psize*(i-1)+' style="background-color:#aaaaaa"><div class="nowpage">'+i+'</div></a>';
					}else{
						strhtml+='<span> <a href=./ope_facilitator?pageStart='+psize*(i-1)+'&serviceName='+serviceName+'>'+i+'</a></span>';
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

function stopUser(id){
	location.href="./stopuser?id="+id;
}

function openUser(id){
	location.href="./openuser?id="+id;
}