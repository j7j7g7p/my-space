**factory pattern**
* 简单工厂模式（Factory）：
*不是23种设计模式，简单工厂模式实质是由工厂类根据传入的参数，动态决定创建那个类。Spring 中的 BeanFactory 就是简单工厂模式的体现，根据传入一个唯一的标识来获得 Bean 对象，但是是否在传入参数后创建还是传入参数前创建这个要根据具体情况来定。*

* 工厂方法模式（Factory Method）：
*通常由应用程序直接使用 new 创建新的对象，为了将对象的创建和使用相分离，采用工厂模式,即应用程序将对象的创建及初始化职责交给工厂对象。般情况下,应用程序有自己的工厂对象来创建 Bean.如果将应用程序自己的工厂对象交给 Spring 管理,那么 Spring 管理的就不是普通的 Bean,而是工厂 Bean。*

* 抽象工厂模式：
*抽象工厂模式提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类。可以理解成是多个工厂方法的组合。在工厂中聚合多个同类产品。*
