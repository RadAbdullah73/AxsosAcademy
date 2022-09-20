from django.shortcuts import render, HttpResponse , redirect
def Blogs(request):
    return redirect('/Blogs')

def root(request):
    return HttpResponse("A string")

def New(request):
    return HttpResponse("A New String")

def create(request):
    return redirect('/Blogs')

def show(request , num):
    return HttpResponse(f"A string {num}")

def edit(request , num):
    return HttpResponse(f"A string {num}")

def destroy(request , num):
    return redirect('/Blogs')




