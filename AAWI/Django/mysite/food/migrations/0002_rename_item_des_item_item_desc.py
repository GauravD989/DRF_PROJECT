# Generated by Django 4.2 on 2023-04-11 07:27

from django.db import migrations


class Migration(migrations.Migration):

    dependencies = [
        ('food', '0001_initial'),
    ]

    operations = [
        migrations.RenameField(
            model_name='item',
            old_name='item_des',
            new_name='item_desc',
        ),
    ]