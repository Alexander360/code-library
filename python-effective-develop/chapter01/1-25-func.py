#!/usr/bin/env python
# -*- coding: utf-8 -*-


def sum_two(x, y):
    return x+y


def total(x, y, z):
    sum_of_two = sum_two(x, y)
    sum_of_three = sum_two(sum_of_two, z)
    return sum_of_two, sum_of_three


def main():
    print("return of sum:", sum_two(4, 6))
    x, y = total(1, 7, 10)
    print("return of total:", x, ",", y)


if __name__ == '__main__':
    main()
