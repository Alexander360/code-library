#!/usr/bin/env python
# -*- coding: utf-8 -*-

import sys


class MyError(Exception):
    # 类私有toString()方法
    def __str__(self):
        return "I'm a self-defined Error!"


def main():

    my_error = MyError()

    try:
        print("**********Start of main()************")
        if len(sys.argv) == 1:
            raise MyError()
        print("**********End of main()************")
    except MyError:
        print("custom exception happened, ", my_error)


if __name__ == '__main__':
    main()
