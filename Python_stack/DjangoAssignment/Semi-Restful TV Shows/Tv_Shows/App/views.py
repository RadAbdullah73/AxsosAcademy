from urllib import request
from django.shortcuts import render , redirect
from .models import *
from time import gmtime, strftime

def index (request):
    return render (request , 'index.html')

def table(request):
    context ={
       'All' : Show.objects.all()
    }
    return render (request,'all.html',context)

def details (request):
    Show.objects.create(title = request.POST['title'] ,network= request.POST['network'],relaseDate = request.POST['date'],description = request.POST['desc'])
    return redirect ('/shows/'+str(Show.objects.get(title =request.POST['title']).id))

def show (request,id):
    context = {
        "time": strftime("%d %B, %Y ,%H:%M", gmtime()),
        'show' : Show.objects.get(id = int(id)),
    }
    return render (request,'details.html',context )

def edit (request , id):
    context={
        'show' : Show.objects.get(id=int(id))
    }
    return render ( request ,'editing.html' , context)

def update(request , id):
    Nshow = Show.objects.get(id = int(id))
    Nshow.title=request.POST['Ntitle']
    Nshow.network=request.POST['Nnetwork']
    Nshow.relaseDate=request.POST['Ndate']
    Nshow.description=request.POST['Ndesc']
    Nshow.save()
    return redirect ('/shows/' + str(id))

def destroy(request , id):
    show = Show.objects.get(id=int(id))
    show.delete()
    return redirect ('/shows')

