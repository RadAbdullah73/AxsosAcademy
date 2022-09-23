from django.shortcuts import render
from django.urls import path     
from . import views
urlpatterns = [
    path('', views.index),
    path('increasegolds/' , views.increasing),
    path('incORdec/' ,views.increasingORdecreasing) 
]
