package com.ming.userService;

/**
 * @Author: ECRZ
 * Data:2021-09
 * @Description:
 */
public class UserServiceImpl implements UserService {
    @Override
    public Integer add() {
        System.out.println("新增了一条记录");
        //也可直接返回1，因为Java会自动把1包装为Integer对象；
        return new Integer(1);
    }

    @Override
    public void del() { System.out.println("删除了一条记录"); }

    @Override
    public void update() {
        System.out.println("更新了一条记录");
    }

    @Override
    public void select() {
        System.out.println("执行了一次查询");
    }
}
