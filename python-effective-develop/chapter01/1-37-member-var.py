#!/usr/bin/env python3
# -*- coding: utf-8 -*-


class MyClass(object):

    # 类静态成员变量
    message = 'Hello, Developer.'

    # 成员方法
    def show(self):
        # 调用类成员变量
        print(self.message)
        print("Here is %s in %s!" % (self.name, self.color))

    # 构造函数
    def __init__(self, name="unset", color="black"):
        print("Constructor is called with params: ", name, " ", color)
        # 设置类成员变量
        self.name = name
        self.color = color

    # 析构函数
    def __del__(self):
        print("Destructor is called for %s!" % self.name)


inst2 = MyClass("David")
inst2.show()

print("Color of inst2 is ", inst2.color, "\n")

inst3 = MyClass("Lisa", "Yellow")
inst3.show()
print("Name of inst3 is ", inst3.name, "\n")

del inst2, inst3	
