责任链模式:
　　设计模式很多时候都是看见名字都知道意思，责任链，见名知义为请求创建一系列处理对象。
    此模式基于请求的类型将请求的发送方和接收方分离。通常每个接收器包含对另一个接收器的引用。
    如果一个对象不能处理请求，则它将相同的对象传递给下一个接收者，这样形成一条链。这种模式属于行为模式。
责任链模式适用场景:
    1、有多个对象共同对一个任务进行处理。
    2、这些对象使用链式存储结构，形成一个链，每个对象知道自己的下一个对象。
    3、一个对象对任务进行处理，可以添加一些操作后将对象传递个下一个任务。也可以在此对象上结束任务的处理，并结束任务。