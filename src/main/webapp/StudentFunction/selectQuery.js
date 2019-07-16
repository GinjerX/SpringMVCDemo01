$(function(){
    /* 模糊查询 */
    $("#selectQuery").click(function(){
        var name = $("#selectName").val(); //姓名
        var age = $("#selectAge").val(); //年龄
        var iphone = $("#selectPhone").val(); //手机号码
        var address = $("#selectAddress").val(); //地址
        var sex = $("#selectSex").find("option:selected").val(); //性别
        var education = $("#selectEducation").find("option:selected").val(); //学历
        var likes = []; //爱好
        var likeArr = $("input[name=selectLike]");
        for (let i = 0; i < likeArr.length; i++) {
            if (likeArr[i].checked) {
                likes.push($(likeArr[i]).val());
            }
        }
        var msg = { //包装成对象
            name,
            age,
            iphone,
            address,
            sex,
            education,
            likes:likes.join(",")
        }
        var options={
        	url:"../likeQueryServlet?name="+name+"&age="+age+"&sex"+sex,
        }
        studentMsg.reload(options);
        
        /*var info = {
            url: "../studentQuery",
            type: "POST",
            data: {obj:JSON.stringify(msg)},
            dataType: "json",
            success: function(check) {
                if(check.judge == "2"){
                   layer.msg("名字重复");
                }else if(check.judge == "3"){
                    layer.msg('手机号码已存在');
                }else{
                   studentMsg.reload();
                   layer.msg('增加成功');
               }
            },
            error: function() {
                layer.msg('网络错误,查询失败');
            }
        }
        $.ajax(info);*/
    })
})