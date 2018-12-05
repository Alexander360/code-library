#!/usr/bin/env python3
# -*- coding: utf-8 -*-


class MyClass(object):

    # 类静态成员变量
    message = 'Hello, Developer.'

    def show(self):
        print(self.message)

    # 类构造函数
    def __init__(self):
            print("Constructor is called")


inst = MyClass()
inst.show()

