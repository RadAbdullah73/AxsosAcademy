from django.shortcuts import render,redirect
from .models import *
def index(request):
    context={
    'dojo': Dojo.objects.all()
    }
    return render(request,"index.html",context)
def addDojo(request):
    Dojo.objects.create(name=request.POST['name'],city=request.POST['city'],state=request.POST['state'])
    return redirect("/")
def addninja(request):
    dojo1=Dojo.objects.get(id=request.POST['Dojo'])
    Ninja.objects.create(dojo=dojo1,first_name=request.POST['first_name'],last_name=request.POST['last_name'])
    return redirect('/')

def delete(request):
    Dojo.objects.get(id=int(request.POST['delete1'])).delete()
    return redirect('/')

