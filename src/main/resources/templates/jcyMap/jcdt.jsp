<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="thunisoft.comm.util.DoStr"%>
<%@page import="thunisoft.comm.util.StrUtil"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String strUrl = request.getContextPath()+"/minfo/";
String index = request.getParameter("index");
if(index==null){
    index = "0";
}
int i = new Integer(index);
%>
<!DOCTYPE html>  
<html>  
<head>  
<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />  
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />  
<title>检察地图</title>  
<style type="text/css">  
html{height:100%}  
body{height:100%;margin:0px;padding:0px}  
#container{height:100%}  
</style>  
<!-- <script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=TiM61gyIyHjvaVaECUnXV5jsgYClOiM9"></script> -->
<script type="text/javascript" src="https://api.map.baidu.com/api?v=2.0&ak=TiM61gyIyHjvaVaECUnXV5jsgYClOiM9&s=1"></script>
</head>  
<body>  
<div id="container"></div> 
<script type="text/javascript"> 
var jcyJsonArray = [{"name":"北京市人民检察院","address":"北京市东城区建国门北大街9号","tel":"(010)58762299",pointx:"116.440289",pointy:"39.917467"},
                    {"name":"北京市人民检察院第一分院","address":"北京市石景山区石景山路12号","tel":"010-59909114",pointx:"116.241343",pointy:"39.91128"},
                    {"name":"北京市人民检察院第二分院","address":"北京市丰台区方庄紫芳路18号","tel":"(010)59906699",pointx:"116.447262",pointy:"39.87104"},
                    {"name":"北京市人民检察院第三分院","address":"北京市朝阳区东三环南路1号","tel":"(010)59907000",pointx:"116.4673",pointy:"39.898639"},
                    {"name":"北京市人民检察院第四分院（北京铁路运输检察分院）","address":"北京市海淀区北蜂窝路甲5号","tel":"(010)51822188",pointx:"116.337205",pointy:"39.904785"},
                    {"name":"北京市东城区人民检察院","address":"北京市东城区珠市口东大街10－3号","tel":"(010)59558830",pointx:"116.415367",pointy:"39.898657"},
                    {"name":"北京市西城区人民检察院","address":"北京市西城区新街口西里三区18号楼","tel":"(010)59555662",pointx:"116.373404",pointy:"39.947638"},
                    {"name":"北京市朝阳区人民检察院","address":"北京市朝阳区道家园17号","tel":"(010)59553208",pointx:"116.495011",pointy:"39.930007"},
                    {"name":"北京市海淀区人民检察院","address":"北京市海淀区厂洼西路8号","tel":"(010)59554866",pointx:"116.309801",pointy:"39.970252"},
                    {"name":"北京市丰台区人民检察院","address":"北京市丰台区近园路13号","tel":"(010)63816047",pointx:"116.294254",pointy:"39.868511"},
                    {"name":"北京市石景山区人民检察院","address":"北京市石景山区古城南里甲2","tel":"(010)59907975",pointx:"116.195156",pointy:"39.911582"},
                    {"name":"北京市门头沟区人民检察院","address":"北京市门头沟区滨河路21号","tel":"(010)59908000",pointx:"116.109892",pointy:"39.957309"},
                    {"name":"北京市房山区人民检察院","address":"北京市房山区良乡政通路14号","tel":"(010)59558000",pointx:"116.143448",pointy:"39.75199"},
                    {"name":"北京市通州区人民检察院","address":"北京市通州区玉桥西路85号","tel":"(010)59552670",pointx:"116.677881",pointy:"39.895854"},
                    {"name":"北京市顺义区人民检察院","address":"北京市顺义区新顺南大街19号","tel":"(010)59556600",pointx:"116.657349",pointy:"40.129443"},
                    {"name":"北京市大兴区人民检察院","address":"北京市大兴区兴华大街二段5号","tel":"(010)59556318",pointx:"116.337448",pointy:"39.767975"},
                    {"name":"北京市昌平区人民检察院","address":"北京市昌平区政府街9号","tel":"(010)60718222",pointx:"116.2424",pointy:"40.226739"},
                    {"name":"北京市怀柔区人民检察院","address":"北京市怀柔区府前街6号","tel":"(010)59559511",pointx:"116.641593",pointy:"40.322031"},
                    {"name":"北京市平谷区人民检察院","address":"北京市平谷区府前西街11号","tel":"(010)59559010",pointx:"117.109278",pointy:"40.14655"},
                    {"name":"北京市密云区人民检察院","address":"北京市密云区西大桥路10号","tel":"(010)69041734",pointx:"116.836398",pointy:"40.373101"},
                    {"name":"北京市延庆区人民检察院","address":"北京市延庆区庆隆街99号","tel":"(010)59559778",pointx:"115.986119",pointy:"40.482269"}
                    ];
var jcyjson = jcyJsonArray[<%=i%>];
var map = new BMap.Map("container");          // 创建地图实例  
var point = new BMap.Point(jcyjson.pointx, jcyjson.pointy);  // 创建点坐标  
map.centerAndZoom(point, 15);   // 初始化地图，设置中心点坐标和地图级别  
//map.setCurrentCity("北京");          // 设置地图显示的城市 此项是必须设置的
map.enableScrollWheelZoom(true);     //开启鼠标滚轮缩放
var marker = new BMap.Marker(point);
map.addOverlay(marker);
marker.setLabel(new BMap.Label(jcyjson.name,{offset:new BMap.Size(20,-10)}));
</script>  
</body>  
</html>