#!/usr/bin/env python3
# -*- coding: utf-8 -*-


class MyClass(object):

    # 类静态成员变量
    message = 'Hello, Developer.'
    
    def show(self):
        print(self.message)

    # 构造函数
    def __init__(self, name="unset", color="black"):
        print("Constructor is called with params: ", name, " ", color)


# 调用含有默认值的构造函数
inst = MyClass()
inst.show()

# 调用含有一个参数的构造函数, 传入参数name="David"
inst2 = MyClass("David")
inst2.show()

# 调用含有两个参数的构造函数, 传入参数name="Lisa", color="Yellow"
inst3 = MyClass("Lisa", "Yellow")
inst3.show()

# 调用含有一个参数的构造函数, 传入参数color="Green"
inst4 = MyClass(color="Green")
inst4.show()

