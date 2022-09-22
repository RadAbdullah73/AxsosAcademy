from django.shortcuts import render , redirect
from .models import User
def index(request):
    context = {
    "all_the_Users": User.objects.all()
    }
    return render(request, "index.html", context)
def show(request):
    User.objects.create(username= request.POST['firstname'] , lastname=request.POST['lastname'] , email=request.POST['Email'] , Age=request.POST['Age']) 
    return redirect('/')
