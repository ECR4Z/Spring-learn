package com.ming;

/**
 * @Author: ECRZ
 * Data:2021-09
 * @Description:
 */
public class OperationImpl implements Operation{
    @Override
    public void add() {
        System.out.println("新增了一条记录");
    }

    @Override
    public void del() {
        System.out.println("删除了一条记录");
    }

    @Override
    public void update() {
        System.out.println("更新了一条记录");
    }

    @Override
    public void select() {
        System.out.println("执行了一次查询");
    }
}
