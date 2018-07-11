**About design pattern**
#策略模式
## 概念
*策略模式是先封装好一系列策略，按照用户的不同选择来确定某种策略来提供服务，重点是如何定义选择消除代码的耦合性和扩展性的提升。
到达尽量消除主业务代码中的if-else,switch-case语句。策略的选择可以使用抽象，也可以使用枚举将选择拆分。
比如支付来说前端传来的永远是一个支付类型码匹配哪种支付类型的判断是始终要做的，交给谁做是关键。
*

## spring中的策略模式
*BeanFactory有各种实现方式，按照用户配置的选取指定工厂来构建bean，策略模式往往和抽象工厂一起使用。*