# springboot项目多模块
1.创建springboot工程，删除一些不必要的文件，留下一个目录结构（如果偷懒的话，可以直接把src先复制一份保留）
2.创建maven空模块，更名为xxx-webapi（命名随意，最好标注清楚这个模块用来干嘛），将上面的复制的src粘贴进来（也可以自己创建，
但是记住要创建xxxApplication，否则项目无法启动，还有properties的spirng 相关配置文件）
3.重复上一步，更名为xxx-model/dao/services 基于自己公司的命名规范或者一些其他规则依次创建即可

## 分层如下
* Demo-Web 控制层，mapper等静态文件配置相关
* Demo-Biz 接口服务层，负责实现组装dao的信息，分为Services的接口已经Impl的接口实现
* Demo-Dao 数据层，主要是mapper的映射
* Demo-DTO 交互相关模型，包含filter，response，request
* Demo-PO 数据模型

## 用到的一些包
参考pom.xml文件

## 遇到的问题
1.有些内容是从上个项目直接拷过来用的，测试的过程中遇到的问题 mybatis的 org.apache.ibatis.binding.BindingException: Invalid bound statement (not found):
这个问题查了下，不是技术上的难点，dao对应的mapping文件方法找不到。
经过调试发现是org.apache.ibatis.binding - > resolveMappedStatement - > hasStatement 找不到对应，看断点里面的变量包名方法名啥的都是正常的后面就排除了包名问题导致的，然后就查了下目录结构和配置文件。结果问题在这目录结构 mapper -> user -> xxxMapper.xml，配置却是 mybatis.mapper-locations=classpath:mapper/*Mapper.xml层级结构上不对，后面改为 mybatis.mapper-locations=classpath:mapper/**/*Mapper.xml



## 一些小记
第二个springboot工程，总体来讲比上一个项目更顺手，也开始适应idea的功能
1.需要多看看 properties 的一些常用设置
2.application的一些注解相关的知识也需要学习

## 创建流程
1.选择【new project】 
2.找到maven选项 勾选 【create from archetype】
3.选择【maven-archetype-webapp】 next done
4.删除【src下内容】
5.引入spring等maven包到根目录下的【pom.xml】
5.选择【new module】
6.创建【springboot模块】
7.创建空目录，添加模块之间的依赖

注：企业的目录结构一般都是提前创建好，直接拉下来，只需要创建功能模块即可