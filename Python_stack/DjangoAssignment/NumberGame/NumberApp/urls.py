from django.urls import path     
from . import views

urlpatterns = [
    path('', views.Number),
    path('result/' , views.result),
    path('show' , views.res),
    # path('MyResult/' , views.YourResult)
]
