from django.shortcuts import redirect, render
from App.models import *

def Wall(request):
    context={
        'msgs' : Message.objects.all(),
        'user' : User.objects.get(id=request.session['id']).first_name
    }
    return render(request,'Wall.html',context)

def create(request):
    user1 = User.objects.get(id=request.session['id'])
    Message.objects.create(message=request.POST['message'] , user=user1)
    return redirect ("/Wall")

def AddComment(request):
    user1 = User.objects.get(id=request.session['id'])
    messages=Message.objects.get(id=request.POST['hide'])
    Comment.objects.create(comment=request.POST['cmt'],message=messages,user=user1)
    return redirect('/Wall')

        
def logout(request):
    del request.session['first_name']
    del request.session['id']
    return redirect('/')

    
