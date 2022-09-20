from django.shortcuts import render 
def form (request):
    return render(request ,"index.html")

def page(request):
    context={
        'fname' : request.POST['name'],
        'flocation' : request.POST['location'],
        'flanguage' : request.POST['language'],
        'fcomment' : request.POST['cmt']
    }
    return render(request , "Page.html" , context)


