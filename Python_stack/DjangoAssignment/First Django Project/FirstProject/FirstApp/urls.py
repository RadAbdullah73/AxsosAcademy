from django.urls import path     
from . import views
urlpatterns = [
    path('', views.Blogs),
    path('Blogs', views.root),
    path('Blogs/new/' , views.New),
    path('Blogs/create/' , views.create),
    path('Blogs/<int:num>/' , views.show),
    path('Blogs/<int:num>/edit/' , views.edit),
    path('Blogs/<int:num>/delete/' , views.destroy),
]
