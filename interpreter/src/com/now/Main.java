package com.now;

import java.beans.Expression;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: hua
 * @create: 2018-07-01 11:53
 */
public class Main {

    public static void main(String[] args) {
        String num = "10";
        Context context = new Context();
        context.setInput(num);
        AbstractExpression expression = new PlusExpression();
        //通过集合来操作解释器
        List<AbstractExpression> expressionList = new ArrayList<AbstractExpression>();
        expressionList.add(expression);
        expressionList.add(expression);
        for (AbstractExpression abstractExpression : expressionList) {
            abstractExpression.interpret(context);
            System.out.println(context.getOutput());
        }

    }

}
