#!/usr/bin/env python
# -*- coding: utf-8 -*-

try:
    myList = [4, 6]
    print(myList[10])
    print("This is never been called")
except ZeroDivisionError:
    print("ZeroDivisionError happened")
except IndexError:
    print("IndexError happened")
else:
    print("No exception happened")
finally:
    print("Process finished!")
