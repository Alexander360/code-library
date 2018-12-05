#!/usr/bin/env python
# -*- coding: utf-8 -*-


def check_book(**dict_param):
    if 'Price' in dict_param.keys():
        price = int(dict_param['Price'])
        if price > 100:
            print("*******I want buy this book!*******")
    print("The book information are as follow:")
    for key in dict_param.keys():
        print(key, ": ", dict_param[key])
    print("")


if __name__ == '__main__':
    check_book(author='James', Title='Economics Introduction')
    check_book(author='Linda', Title='Deepin in Python', Date='2015-5-1', Price=302)
    check_book(Date='2002-3-19', Title='Cooking book', Price=20)
    check_book(author='Jinker Landy', Title='How to keep healthy')
    check_book(Category='Finance', Name='Enterprise Audit', Price=105)
