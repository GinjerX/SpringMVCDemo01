$(function(){
    //修改事件 确认提交修改
    $("#affirmUpdate").click(function(){
        var id = tempMsg.id;
        var name = $("#updateName").val(); //姓名
        var age = $("#updateAge").val(); //年龄
        var sex = $("input[name=updateSex]:checked").val(); //性别
		var dormId = $("#updateDormId").val(); //年龄
        
        if (name=="") {
        	 layer.msg("请输入学生姓名");
        	 return;
        	 
		}
        var msg = { //包装成对象
            id,
            name,
            age,
            sex,
			dormId
        }
        
        var info = {
            url: "/DormSystem/update.do",
            type: "POST",
            data: JSON.stringify(msg),
            dataType: "json",
            success: function(check) {
				 var options={
				    	url: "/DormSystem/query.do",
				    }
				studentMsg.reload(options);
                layer.msg('修改成功');
            },
            error: function() {
                layer.msg('网络错误,操作失败');
            }
        }
        $.ajax(info);
    })
})