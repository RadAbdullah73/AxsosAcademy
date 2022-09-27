from contextlib import redirect_stderr
from multiprocessing import context
from django.shortcuts import render , redirect
from .models import *

def index(request):
    context={
        'books':Book.objects.all()
    }
    return render (request , 'index.html' , context)

def AddBook(request):
    Book.objects.create(title =request.POST['title'] , desc = request.POST['desc'])
    return redirect('/')

def index1(request):
    context={
        'publishers':Publisher.objects.all()
    }
    return render (request , 'index1.html' , context)

def addPublisher(request):
    Publisher.objects.create(first_name =request.POST['first_name'] , last_name = request.POST['last_name'])
    return redirect('/authors')

def Go(request):
    return redirect ('/authors')

def BookView(request , id):
    context={
        'oneBook' : Book.objects.get(id = int(id)),
        'Publishers' : Publisher.objects.all()
    }
    return render ( request , 'index3.html' , context)

def addPupToBook(request,id):
    book = Book.objects.get(id = int(id))
    Pub = Publisher.objects.get(id=request.POST['selectAuthor'])
    book.publishers.add(Pub)
    return redirect ('/books' +'/' +str(id))

def PupView(request , id):
    context = {
        'firstPup' : Publisher.objects.get(id=int(id)),
        'Books' : Book.objects.all()
    }
    return render ( request , 'index4.html' , context)

def addBookToPup(request,id):
    pub = Publisher.objects.get(id = int(id))
    book = Book.objects.get(id=request.POST['selectBook'])
    pub.books.add(book)
    return redirect ('/publishers' +'/' +str(id))

def Back(request):
    return redirect ('/')

