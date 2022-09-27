from django.urls import path
from . import views

urlpatterns = [
    path('', views.index),
    path('addBook' , views.AddBook),
    path('authors', views.index1),
    path('addPublisher' , views.addPublisher),
    path('goToPublisher' , views.Go),
    path('goToBooks' , views.Back),
    path('books/<int:id>' , views.BookView),
    path('addPupToBook/<int:id>' , views.addPupToBook),
    path('publishers/<int:id>', views.PupView),
    path('addBookToPup/<int:id>' ,views.addBookToPup),
]