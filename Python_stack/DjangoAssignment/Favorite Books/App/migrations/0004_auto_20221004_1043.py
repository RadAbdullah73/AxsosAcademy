# Generated by Django 2.2.4 on 2022-10-04 07:43

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('App', '0003_book_desc'),
    ]

    operations = [
        migrations.AddField(
            model_name='book',
            name='created_at',
            field=models.DateTimeField(default=True),
        ),
        migrations.AddField(
            model_name='book',
            name='updated_at',
            field=models.DateTimeField(default=True),
        ),
    ]
