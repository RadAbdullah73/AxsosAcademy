from django.urls import path
from . import views

urlpatterns = [
    path('', views.index),
    path('addDojo', views.addDojo),
    path('addninja', views.addnin),
    path('delete', views.delete),

]