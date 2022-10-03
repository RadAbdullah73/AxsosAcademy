from django.urls import path
from . import views

urlpatterns = [
    path('', views.Wall),
    path('CreateMessage' , views.create),
    path('AddComment' , views.AddComment),
    path('delete',views.logout),
]
