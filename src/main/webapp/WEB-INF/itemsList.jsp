<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>  
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    <%@ page isELIgnored="false" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>接受mvc处理器过来的数据</title>
</head>
<body>

<script type="text/javascript">

function deleteItems(){
    // 提交form的作用
	document.itemsFrom.action = "${pageContext.request.contextPath }/deleteItems.do";
	document.itemsFrom.submit();
}

function queryItems() {
	// 提交form的作用
	document.itemsFrom.action = "${pageContext.request.contextPath }/queryItems.do";
	document.itemsFrom.submit();
}





</script>

<form name="itemsFrom" action="" method="post">
        商品列表：
        
        <td><input type="button" value="批量查询" onclick="queryItems()"></td>
       
        <td><input type="button" value="批量删除" onclick="deleteItems()"></td>
        <table width="100%" border=1>
            <tr>
                <td>商品编号</td>
                <td>商品名称</td>
                <td>商品价格</td>
                <td>商品描述</td>
                <td>商品操作</td>
                 <td>选中/取消</td>
               
            </tr>
            <c:forEach items="${selist}" var="item">
                <tr>
                    <td>${item.id }</td>
                    <td>${item.name }</td>
                    <td>${item.price }</td>
                    <td>${item.detail}</td>
                    <td>
                    <a href="">删除</a></br>
                    <a href="">修改</a></br>
                    </td>
                    <td><input  type="checkbox" value="${item.id}" name="chick_id"></td>
             
                    </tr>

            </c:forEach>

        </table>

</form>
</body>
</html>