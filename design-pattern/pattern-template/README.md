**About design pattern**
#模板方法模式
## 概念
*很多业务场景中大部分的流程是固定的，只有少部分是未知的，模式模式就是建立抽象类将不变的部分封装起来，变化的部分作为抽象方法让子类去实现。
从而实现了对变化的封装实现了代码的解耦。*

## 应用场景
*Spring中的JDBCTemplate,Hibernate中的Template，MongoDB中template都是模板方法的运用*