package com.now;

/**
 * @author: hua
 * @create: 2018-07-01 13:35
 */
public class PlusExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        //提示信息
        System.out.println("自动递增:");
        //获得上下文环境
        String input = context.getInput();
        //进行类型转换
        int intInput = Integer.parseInt(input);
        //递增
        intInput++;
        //对上下文环境重新赋值
        context.setInput(intInput + "");
        context.setOutput(intInput + "");
    }
}
