# -*- coding: utf-8 -*-
# Generated by Django 1.9.1 on 2016-02-23 06:33
from __future__ import unicode_literals

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('app', '0001_initial'),
    ]

    operations = [
        migrations.AlterField(
            model_name='moment',
            name='content',
            field=models.CharField(max_length=300),
        ),
    ]
