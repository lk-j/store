用户服务： 提供用户相关信息，注册用户等功能
分层：
    Infrastructure 层 :  基础实施层，向其他层提供通用的技术能力(比如工具类,第三方库类支持,常用基本配置,数据访问底层实现)
	Domain层 : 主要负责表达业务概念,业务状态信息和业务规则；是整个系统的核心层,几乎全部的业务逻辑会在该层实现。
	Application层 :  相对于领域层,应用层是很薄的一层,应用层定义了软件要完成的任务,要尽量简单。
	Interfaces层 : 负责向用户显示信息和解释用户命令，请求应用层以获取用户所需要展现的数据(比如获取首页的商品数据)

![Image text](https://img-blog.csdnimg.cn/img_convert/b9f022dcf2ac7f09f5cb76f72908e535.png)

├─java
│  └─com
│      └─shop
│          └─store
│              ├─application  应用层
│              │  ├─service   应用层服务
│              │  └─task      任务
│              ├─domain         领域层
│              │  ├─aggregate    聚合根
│              │  ├─entity       实体 
│              │  ├─factory      工厂
│              │  ├─repository   仓储
│              │  ├─service      职责不明的服务 
│              │  └─vo           值对象
│              ├─infrastructure  基础设施层
│              │  ├─config      配置
│              │  └─util        工具包
│              └─interface      展示层
│                  ├─assembler  DTO和do对象转换，组织网关层的数据对象(DTO，VO)入侵domain层
│                  ├─dto        数据传输对象DTO
│                  └─controller     门面类
└─resources
