# https://blog.csdn.net/weixin_35982117/article/details/81735058

1、新建一web工程，導入axis相关的jar包
2、web.xml中添加axis相关的配置信息

	<servlet>  
	    <display-name>Apache-Axis Servlet</display-name>  
	    <servlet-name>AxisServlet</servlet-name>  
	    <servlet-class>org.apache.axis.transport.http.AxisServlet</servlet-class>  
	</servlet>  
	<servlet-mapping>  
	    <servlet-name>AxisServlet</servlet-name>  
	<url-pattern>/services/*</url-pattern>  

3、新建服務類及方法

4、	WEB-INF 目錄下 新建並配置 server-config.wsdd

5、部署在 Tomcat

http://localhost:8000/axis-manual-server/services/HelloService?wsdl



	