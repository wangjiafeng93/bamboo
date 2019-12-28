<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="thunisoft.comm.util.DoStr"%>
<%@page import="thunisoft.comm.util.StrUtil"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String strUrl = request.getContextPath()+"/minfo/";
%>
<!DOCTYPE html>
<html>
        <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=0">
        <meta name="apple-mobile-web-app-capable" content="yes">
        <meta name="apple-touch-fullscreen" content="yes">
        <meta name="apple-mobile-web-app-status-bar-style" content="black">
        <meta name="format-detection" content="telephone=no">
        <meta name="copyright" content="Copyright www.thunisoft.com ">
        <meta name="revisit-after" content="1 days">
        <meta name="keywords" content="thunisoft mobile">
        <meta name="author" content="wuwg">
        <meta name="description" content="thunisoft">
        <title>检查地图</title>
        <link rel="stylesheet" type="text/css" href="../css/reset.css"/>
        <link rel="stylesheet" type="text/css" href="../css/layout.css"/>
        <link rel="stylesheet" type="text/css" href="../css/common.css"/>
        <link rel="stylesheet" type="text/css" href="../css/global.css"/>
        <link rel="stylesheet" type="text/css" href="../css/unit-title.css"/>
        <link rel="stylesheet" type="text/css" href="../css/component-window.css"/>
        <link rel="stylesheet" type="text/css" href="../css/unit-btn.css"/>
        <link rel="stylesheet" type="text/css" href="../css/module-jcyjs.css"/>
    </head>
    <body>
        <!--page-->
        <div class="fdm-page02">
            <!--header-->
            <!-- <div class="fdm-header">
                <a href="javascript:history.go(-1);">返回</a>
                <h1>检查地图</h1>
                <span></span>
            </div> -->
            <!--header end-->
            <!--contain-->
            <div class="fdm-contain fdm-plr20">
                <div class="fdm-item">
                    <p class="fdm-item-prof" onclick="gojcdt(0);"><span class="fdm-icon icon09 js-dw"></span>北京市人民检察院</p>
                </div>
                <div class="fdm-item">
                    <p class="fdm-item-prof" onclick="gojcdt(1);"><span class="fdm-icon icon09 js-dw"></span>北京市人民检察院第一分院</p>
                </div>
                <div class="fdm-item">
                    <p class="fdm-item-prof" onclick="gojcdt(2);"><span class="fdm-icon icon09 js-dw"></span>北京市人民检察院第二分院</p>
                </div>
                <div class="fdm-item">
                    <p class="fdm-item-prof" onclick="gojcdt(3);"><span class="fdm-icon icon09 js-dw"></span>北京市人民检察院第三分院</p>
                </div>
                <div class="fdm-item">
                    <p class="fdm-item-prof" onclick="gojcdt(4);"><span class="fdm-icon icon09 js-dw"></span>北京市人民检察院第四分院</p>
                </div>
                <div class="fdm-item">
                    <p class="fdm-item-prof js-dw" onclick="gojcdt(5);"><span class="fdm-icon icon09"></span>北京市东城区人民检察院</p>
                </div>
                <div class="fdm-item">
                    <p class="fdm-item-prof js-dw" onclick="gojcdt(6);"><span class="fdm-icon icon09"></span>北京市西城区人民检察院</p>
                </div>
                <div class="fdm-item">
                    <p class="fdm-item-prof js-dw" onclick="gojcdt(7);"><span class="fdm-icon icon09"></span>北京市朝阳区人民检察院</p>
                </div>
                <div class="fdm-item">
                    <p class="fdm-item-prof" onclick="gojcdt(8);"><span class="fdm-icon icon09"></span>北京市海淀区人民检察院</p>
                </div>
                <div class="fdm-item">
                    <p class="fdm-item-prof js-dw" onclick="gojcdt(9);"><span class="fdm-icon icon09"></span>北京市丰台区人民检察院</p>
                </div>
                <div class="fdm-item">
                    <p class="fdm-item-prof" onclick="gojcdt(10);"><span class="fdm-icon icon09"></span>北京市石景山区人民检察院</p>
                </div>
                <div class="fdm-item">
                    <p class="fdm-item-prof" onclick="gojcdt(11);"><span class="fdm-icon icon09"></span>北京市门头沟区人民检察院</p>
                </div>
                <div class="fdm-item">
                    <p class="fdm-item-prof" onclick="gojcdt(12);"><span class="fdm-icon icon09"></span>北京市房山区人民检察院</p>
                </div>
                <div class="fdm-item">
                    <p class="fdm-item-prof" onclick="gojcdt(13);"><span class="fdm-icon icon09"></span>北京市通州区人民检察院</p>
                </div>
                <div class="fdm-item">
                    <p class="fdm-item-prof" onclick="gojcdt(14);"><span class="fdm-icon icon09"></span>北京市顺义区人民检察院</p>
                </div>
                <div class="fdm-item">
                    <p class="fdm-item-prof" onclick="gojcdt(15);"><span class="fdm-icon icon09"></span>北京市大兴区人民检察院</p>
                </div>
                <div class="fdm-item">
                    <p class="fdm-item-prof" onclick="gojcdt(16);"><span class="fdm-icon icon09"></span>北京市昌平区人民检察院</p>
                </div>
                <div class="fdm-item">
                    <p class="fdm-item-prof" onclick="gojcdt(17);"><span class="fdm-icon icon09"></span>北京市怀柔区人民检察院</p>
                </div>
                <div class="fdm-item">
                    <p class="fdm-item-prof" onclick="gojcdt(18);"><span class="fdm-icon icon09"></span>北京市平谷区人民检察院</p>
                </div>
                <div class="fdm-item">
                    <p class="fdm-item-prof" onclick="gojcdt(19);"><span class="fdm-icon icon09"></span>北京市密云区人民检察院</p>
                </div>
                <div class="fdm-item">
                    <p class="fdm-item-prof" onclick="gojcdt(20);"><span class="fdm-icon icon09"></span>北京市延庆区人民检察院</p>
                </div>
            </div>
            <!--contain  end-->
        </div>  
        <!--page  end-->
    </body>
    <script src="../js/lib/jquery/jQuery.v1.11.1.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="../js/app/common/setHtml.js" type="text/javascript" charset="utf-8"></script>
    <script src="../js/app/common/index.js" type="text/javascript" charset="utf-8"></script>
    <script type="text/javascript">
    function gojcdt(index){
    	window.location.href = "<%=basePath%>mobilejcfw/jcdt/jcdt.jsp?index=" + index;
    }
    </script>
</html>
