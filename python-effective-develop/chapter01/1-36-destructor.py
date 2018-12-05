#!/usr/bin/env python3
# -*- coding: utf-8 -*-


class MyClass(object):

    # 类静态成员变量
    message = 'Hello, Developer.'
    
    def show(self):
        print(self.message)

    # 构造函数
    def __init__(self, name = "unset", color = "black"):
        print("Constructor is called with params: ",name, " ", color)

    # 析构函数
    def __del__(self):
        print("Destructor is called!")


inst = MyClass()
inst.show()

inst2 = MyClass("David")
inst2.show()

# 使用del关键字调用析构函数，销毁对象
del inst, inst2

inst3 = MyClass("Lisa", "Yellow")
inst3.show()

del inst3
