$(function() {
    //确认增加事件 获取所有值传入后台增加到数据库

    $("#affirmAdd").click(function() {
        var name = $("#addName").val(); //姓名
        var age = $("#addAge").val(); //年龄
        var sex = $("input[name=addSex]:checked").val(); //性别
		var dormId = $("#addDormId").val(); //年龄
        
        if (name=="") {
        	 layer.msg("请输入学生姓名");
        	return;
        	 
		}
        var msg = { //包装成对象
            name,
            age,
            sex,
			dormId
        }
       // var obj = JSON.stringify(meg);

        var info = {
            url: "/DormSystem/add.do",
            type: "POST",
			// data:msg,
			contentType:"application/json",
            data: JSON.stringify(msg),
            dataType: "json",
            success: function(check) {
				 var options = {
				 	url: "/DormSystem/query.do",
				 }
				 studentMsg.reload(options);
                layer.msg('增加成功');

            },
            error: function() {
                layer.msg('网络错误,增加失败');
            }
        }
        $.ajax(info);
    })
})
