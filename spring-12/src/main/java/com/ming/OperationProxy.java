package com.ming;

/**
 * @Author: ECRZ
 * Data:2021-09
 * @Description:
 */
public class OperationProxy implements Operation{
    private OperationImpl operation;

    public void setOperation(OperationImpl operation) {
        this.operation = operation;
    }

    @Override
    public void add() {
        System.out.println("新增记录前");
        operation.add();
        System.out.println("新增记录后");
    }

    @Override
    public void del() {
        System.out.println("删除记录前");
        operation.del();
        System.out.println("删除记录后");
    }

    @Override
    public void update() {
        System.out.println("更新记录前");
        operation.update();
        System.out.println("更新记录后");
    }

    @Override
    public void select() {
        System.out.println("查询前");
        operation.select();
        System.out.println("查询后");
    }
}
