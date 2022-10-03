from django.urls import path , include
from . import views

urlpatterns = [
    path('', views.index),
    path('create' , views.create),
    path('success' , views.success),
    path('login',views.login),
    path('delete' , views.logout),
    path('Wall/' , include('NewApp.urls')),
]