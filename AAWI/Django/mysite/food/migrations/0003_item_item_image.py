# Generated by Django 4.2 on 2023-04-25 08:03

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('food', '0002_rename_item_des_item_item_desc'),
    ]

    operations = [
        migrations.AddField(
            model_name='item',
            name='item_image',
            field=models.CharField(default='https://livingstonbagel.com/wp-content/uploads/2016/11/food-placeholder.jpg', max_length=500),
        ),
    ]