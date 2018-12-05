#!/usr/bin/env python
# -*- coding: utf-8 -*-


def sum_two(x, y=10):
    return x+y


if __name__ == '__main__':
    print("return of sum(2, 3):", sum_two(2, 3))
    print("return of sum(-4):", sum_two(-4))
