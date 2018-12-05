#!/usr/bin/env python
# -*- coding: utf-8 -*-

import datetime


def named_func(a):
    return "I'm named function with param %s" % a


def call_func(func, param) :
    print(datetime.datetime.now())
    print(func(param))
    print("")


if __name__ == '__main__':
    call_func(named_func, 'hello')
    call_func(lambda x: x*2, 9)
    call_func(lambda y: y*y, -4)
