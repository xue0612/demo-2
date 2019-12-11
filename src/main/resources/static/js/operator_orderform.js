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
$(".business-order").on("click", function(){
    $(".main-content").show();
    $("table").show();
    $(".main-sercive").hide();
    $(".business-order").addClass("border-red");
    $(".service-order").removeClass("border-red");
    $(".main-top li").eq(3).text("业务订单");
})
$(".service-order").on("click", function(){
    $(".main-content").hide();
    $("table").hide();
    $(".main-sercive").show();
    $(".service-order").addClass("border-red");
    $(".business-order").removeClass("border-red");
    $(".main-top li").eq(3).text("服务订单");
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
	//$(":td name=['ts']")
	$("td[name='ts']").each(function(){
		var strDate = $(this).text();//获取td标签里面的内容 如果获取不到改成 .html()
		
		if(null==strDate || ""==strDate){
			strDate = "";
	    }
	    var dateStr=strDate.trim().split(" ");
	    var strGMT = dateStr[0]+" "+dateStr[1]+" "+dateStr[2]+" "+dateStr[5]+" "+dateStr[3]+" GMT+0800";
	    var date = new Date(Date.parse(strGMT));
	    var y = date.getFullYear();
	    var m = date.getMonth() + 1;  
	    m = m < 10 ? ('0' + m) : m;
	    var d = date.getDate();  
	    d = d < 10 ? ('0' + d) : d;
	    var h = date.getHours();
	    var minute = date.getMinutes();  
	    minute = minute < 10 ? ('0' + minute) : minute;
	    var second = date.getSeconds();
	    second = second < 10 ? ('0' + second) : second;
	    strDate = y+"-"+m+"-"+d+" "+h+":"+minute+":"+second;
		
		$(this).text(new Date(strDate).Format("yyyy-M-d"));
	});
	// 取td
	// var date = new Date();
	// td.html(date.Format(ts))
})

Date.prototype.Format = function(fmt)   
    {
      var o = {   
        "M+" : this.getMonth()+1,                 //月份   
        "d+" : this.getDate(),                    //日   
        "h+" : this.getHours(),                   //小时   
        "m+" : this.getMinutes(),                 //分   
        "s+" : this.getSeconds(),                 //秒   
        "q+" : Math.floor((this.getMonth()+3)/3), //季度   
        "S"  : this.getMilliseconds()             //毫秒   
      };   
      if(/(y+)/.test(fmt))   
        fmt=fmt.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length));   
      for(var k in o)   
        if(new RegExp("("+ k +")").test(fmt))   
      fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));   
      return fmt;   
    }

$(document).ready(function(){
		var pcount=$('#count').val();
		var psize=$('#pageSize').val();
		var pstart=$('#pageStart').val();
		var orderNumber=$('#orderNumber').val();
		var nowpage=Math.floor(pstart/psize)+1;		
		var cpage=Math.ceil(pcount/psize);
		var strhtml="";
		
		if(cpage<=10){
			for(var i=1;i<=cpage;i++){
				if(i==nowpage){
					strhtml+='<a href=./ope_orderform?pageStart='+psize*(i-1)+'&orderNumber='+orderNumber+' style="background-color:#aaaaaa;font-weight:700">'+i+'</a>';
				}else{
					strhtml+='<span> <a href=./ope_orderform?pageStart='+psize*(i-1)+'&orderNumber='+orderNumber+'>'+i+'</a></span>';
				}
			}
		}
		else if(cpage>10){
		
			if( 1<=nowpage && nowpage<=6){		//pagestart=20 nowpage=11 cpage=15
			
				for(var i=1;i<=10;i++){			
				
					if(i==nowpage){
						strhtml+='<a href=./ope_orderform?pageStart='+psize*(i-1)+'&orderNumber='+orderNumber+' style="background-color:#aaaaaa;font-weight:700">'+i+'</a>';
						//strhtml+='<a href=/userAll?pageStart='+psize*(i-1)+' style="background-color:#aaaaaa"><div class="nowpage">'+i+'</div></a>';
					}else{
						strhtml+='<span> <a href=./ope_orderform?pageStart='+psize*(i-1)+'&orderNumber='+orderNumber+'>'+i+'</a></span>';
					}
				}
			}
			else if( nowpage<=cpage-4){
			
				for(var i=nowpage-5;i<=nowpage+4;i++){//6--15			
			
					if(i==nowpage){
						strhtml+='<a href=./ope_orderform?pageStart='+psize*(i-1)+'&orderNumber='+orderNumber+' style="background-color:#aaaaaa;font-weight:700">'+i+'</a>';
						//strhtml+='<a href=/userAll?pageStart='+psize*(i-1)+' style="background-color:#aaaaaa"><div class="nowpage">'+i+'</div></a>';
					}else{
						strhtml+='<span> <a href=./ope_orderform?pageStart='+psize*(i-1)+'&orderNumber='+orderNumber+'>'+i+'</a></span>';
					}
				
				}
			} 
			else if( cpage-4<nowpage && nowpage<=cpage){
			
				for(var i=cpage-9;i<=cpage;i++){
				
					if(i==nowpage){
						strhtml+='<a href=./ope_orderform?pageStart='+psize*(i-1)+'&orderNumber='+orderNumber+' style="background-color:#aaaaaa;font-weight:700">'+i+'</a>';
						//strhtml+='<a href=/userAll?pageStart='+psize*(i-1)+' style="background-color:#aaaaaa"><div class="nowpage">'+i+'</div></a>';
					}else{
						strhtml+='<span> <a href=./ope_orderform?pageStart='+psize*(i-1)+'&orderNumber='+orderNumber+'>'+i+'</a></span>';
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