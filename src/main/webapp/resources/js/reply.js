/**
 * 
 */

$(document).ready(function(){	// jquery 준비...
	// 함수 호출
	// detail.jsp가 시작되자마자 bno값을 가져올려면 $(document).ready 아래에 선언
	var bnoValue=$("input[name='bno']").val();
	
	var pageValue=1;
	// detail.jsp가 시작되자마자 댓글목록리스트(list) 함수를 호출
	
list({bno:bnoValue});



	
	// 댓글 쓰기버튼을 클릭하면 
	$("#add").on("click",function(){
		// 댓글쓰기 버튼을 클릭했을 당시에 댓글내용을 가져올려면 $("#add").on("click",function(){ 아래에 선언
		var replyValue=$("#reply").val();
		var idValue=$("#id").val();
		
		// 댓글쓰기를 하기 위한 함수 호출
		add({bno:bnoValue,reply:replyValue,id:idValue});
	})
	
	$("#chat").on("click",".remove",function(){
		// 댓글삭제 버튼을 클릭했을때 
		
		
		//댓글번호 수집
		var rno=$(this).data("rno");
		var idValue=$("#id").val();
		
		
		remove({bno:bnoValue,rno:rno,id:idValue});
	})
	
	$("#chat").on("click",".update",function(){
		// 댓글삭제 버튼을 클릭했을때 
		
		
		//댓글번호 수집
		var rno=$(this).data("rno");
		var idValue=$("#id").val();
		var reply=$("#replycontent"+rno).val();
		
		update({bno:bnoValue,rno:rno,id:idValue,reply:reply});
	})
	
	
	
})





function add(reply){	// add함수 선언 시작
	console.log(reply);
	
	$.ajax({
		type:"post",	// method방식(get, post, put, delete)
		url:"/replies/new",
		data:JSON.stringify(reply),  //서버로 보내는 데이터
		// contentType : ajax -> controller로 데이터 전송 시 타입
		// (contentType을 생략하면 web Brower한테 위임)
		contentType:"application/json; charset=utf-8",
		success:function(result){
			if(result=="success"){
				alert("댓글쓰기 성공")
		list(reply.bno)
			}
		}
	})
}	// add함수 선언 끝

function list(param){// list함수 선언 시작
	
	var bno = param.bno;
	
	
	
		
	$.getJSON("/replies/"+bno+".json",function(data){
		
	
		
		
		
		var str=""
		
		for(var i=0;i<data.length;i++){
			str+="<li>"+"작성자: "+data[i].id+"</li>"
			str+="<li><textarea id='replycontent"+data[i].rno+"'>"+data[i].reply+"</textarea></li>"
			str+="<li>"
			str+="<input class='update' type='button' value='수정' data-rno="+data[i].rno+">"
			str+="<input class='remove' type='button' value='삭제' data-rno="+data[i].rno+">"
			str+="</li>"
		
			}
		
		$("#replyUL").html(str);
		
	
	});
}// list함수 선언 끝


function remove(reply){
	console.log(reply);
	
	$.ajax({
		type:"delete",
		url:"/replies/remove/",
		data:JSON.stringify(reply),
		contentType:"application/json; charset=utf-8",
		success:function(result){
			if(result=="success"){
				alert("댓글삭제 성공")
				list(reply.bno)
			}
		}
	})
}


function update(reply){
	console.log(reply);
	
	$.ajax({
		type:"put",
		url:"/replies/update",
		data:JSON.stringify(reply),
		contentType:"application/json; charset=utf-8",
		success:function(result){
			if(result=="success"){
				alert("댓글수정 성공")
				list(reply.bno)
			}
		}
	})
}

