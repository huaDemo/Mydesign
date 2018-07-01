package com.now;

/**
 * 上下文环境类,用来保存文法
 *
 * @author: hua
 * @create: 2018-07-01 13:31
 */
public class Context {
    private String input, output;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
