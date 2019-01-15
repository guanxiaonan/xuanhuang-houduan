### 目录结构
```
├── gyn-config-server				//配置中心
├── gyn-eureka-server				//服务注册和发现
├── gyn-one-service					//统一API网关
├── gyn-inventory-service			//库存服务
├── dmx-material-service		//生产任务服务
└── gyn-user-service				//用户服务
```

### 项目说明
该项目是物料管理平台的后台服务部分,只提供API接口。
使用到的相关技术：SpringBoot/SpringCloud/Mybatis/MySQL/Quartz
SpringCloud 使用到的组件包括：Eureka、Feign、Config

> ps: gyn-produce-task-service用到了远程配置和Quartz

### 前端界面

