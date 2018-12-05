#!/usr/bin/env python
# -*- coding: utf-8 -*-


def show_message(message, *tuple_name):
    for name in tuple_name:
        print(message, ",", name)


if __name__ == '__main__':
    show_message("Good morning", "Jack", "Evans", "Rose Hasa", 893, "Zion")
