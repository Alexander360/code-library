#!/usr/bin/env python3
# -*- coding: utf-8 -*-

import time

def fbis(num):
    # 定义list,包含数据0,1
    result=[0,1]
    for i in range(num-2):
        result.append(result[-2]+result[-1])
    return result

def main():
    result = fbis(20)
    fobj = open('/home/fly/PycharmProjects/practice/result.txt', 'w+')
    for i, num in enumerate(result):
        print(u"第 %d 个数是: %d" %(i, num))
        fobj.write(u"第 %d 个数是: %d\n" %(i, num))
        time.sleep(1)

if __name__ == '__main__':
    main()