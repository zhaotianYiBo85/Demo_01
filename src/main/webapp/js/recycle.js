function addRecycle() {
    var location = $("input[id=location]")[0].value;
    var largeLeiBie = $("input[id=largeLeiBie]")[0].value;
    var telephone = $("input[id =telephone]")[0].value;
    var kilograms = $("input[id =kilograms]")[0].value;

    var a = {
        'location' : location,
        'largeLeiBie' : largeLeiBie,
        'telephone' : telephone,
        'kilograms' : kilograms
    }
    $.ajax({
        // 请求方式
        type : "POST",
        // 请求地址
        url : "../../recycle/addRecycle",
        data : a,
        // 请求成功
        success : function(result) {
          alert("您已预约成功")
        },
        error : function(e) {
            console.log(e.status);
            console.log(e.responseText);
        }
    });
}