# Generated by Django 2.2.4 on 2022-10-04 07:44

from django.db import migrations


class Migration(migrations.Migration):

    dependencies = [
        ('App', '0004_auto_20221004_1043'),
    ]

    operations = [
        migrations.RemoveField(
            model_name='book',
            name='created_at',
        ),
        migrations.RemoveField(
            model_name='book',
            name='updated_at',
        ),
    ]
