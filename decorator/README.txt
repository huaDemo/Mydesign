装饰模式意图:
    动态地给一个对象添加一些额外的职责。就增加功能来说，Decorator模式相比生成子类更为灵活。
    该模式以对客户端透明的方式扩展对象的功能。
装饰模式角色:
    1.Component（被装饰对象的基类,抽象组件）
      定义一个对象接口，可以给这些对象动态地添加职责。
    2.ConcreteComponent（具体被装饰对象,具体组件）
      定义一个对象，可以给这个对象添加一些职责。
    3.Decorator（装饰者抽象类,抽象装饰者）
      维持一个指向Component实例的引用，并定义一个与Component接口一致的接口。
    4.ConcreteDecorator（具体装饰者,抽象装饰者）
      具体的装饰对象，给内部持有的具体被装饰对象，增加具体的职责。
装饰模式优缺点:
    优点：动态地为对象增加新的功能或者撤销功能（继承就不能做到这一点）
    缺点：会产生过多的相似的对象，不容易拍错！