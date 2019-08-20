## 问答社区项目

## 资料
[Spring文档](https://spring.io/guides)    
[Spring Web](https://spring.io/guides/gs/serving-web-content/)  
[elastic社区](https://elasticsearch.cn/explore/)  
[Github deploy key](https://developer.github.com/v3/guides/managing-deploy-keys/#deploy-keys)   
[Bootstrap](bootstrap组件：https://v3.bootcss.com/components/) 
[Github OAuth ](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)
## 工具
[Git](https://git-scm.com/downloads)    
[Visual Paradigm](https://www.visual-paradigm.com)


## 脚本
```sql
create table USER
(
	ID int auto_increment,
	ACCOUNT_ID VARCHAR(100),
	NAME VARCHAR(50),
	TOKEN CHAR(36),
	GMT_CREATE BIGINT,
	GMT_MODIFIED BIGINT,
	constraint USER_PK
		primary key (ID)
);
```